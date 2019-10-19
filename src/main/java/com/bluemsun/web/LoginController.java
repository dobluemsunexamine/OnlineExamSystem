package com.bluemsun.web;

import com.bluemsun.dao.UserDao;
import com.bluemsun.entity.User;
import com.bluemsun.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {
@Autowired
  private   UserDao userDao;
private User user;
@RequestMapping(value = "/login" ,method = RequestMethod.POST)
@ResponseBody
public Map<String,Object> LoginCheck(HttpServletRequest request){
    Map<String,Object> modelMap = new HashMap<>();
    String userName=HttpServletRequestUtil.getString(request,"userName");
    String password=HttpServletRequestUtil.getString(request,"password");
    user = userDao.CheckLogin(userName,password);
    if(user.getAvailable()==0){
        //等待审核
        modelMap.put("success",0);
    }else if(user.getAvailable()==2){
        //审核未通过
        modelMap.put("success",-1);
    }else if(user.getAvailable()==1){
        //审核通过
        modelMap.put("success",1);
        user = userDao.getUserInfo(user.getUserId());
        request.getSession().setAttribute("user",user);
        //保持登录cookie

    }
    return modelMap;
}
}
