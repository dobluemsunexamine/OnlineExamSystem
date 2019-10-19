package com.bluemsun.web;

import com.bluemsun.dao.UserDao;
import com.bluemsun.entity.User;
import com.bluemsun.util.HttpServletRequestUtil;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/register")
public class RegsiterController {
    @Autowired
    private UserDao userDao;
    private User user;
    @RequestMapping(value = "/checkoutUserName", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> checkOutUserName(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        String userName = HttpServletRequestUtil.getString(request, "UserName");
        int count = userDao.checkOutUserName(userName);
        if (count == 1) {
            //不成功
            modelMap.put("checkNum", -1);
        } else {
            //成功
            modelMap.put("checkNum", 1);
        }
        return modelMap;
    }
    @RequestMapping(value = "/checkoutStudentCode" ,method =RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> checkOutStudentCode(HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<>();
        int studentCode =HttpServletRequestUtil.getInt(request,"studentCode");
        int count = userDao.checkOutStudentCode(studentCode);
        if (count == 1) {
            //不成功
            modelMap.put("checkNum", -1);
        } else {
            //成功
            modelMap.put("checkNum", 1);
        }
        return modelMap;
    }
    @RequestMapping(value = "/submitRegisterInfo",method = RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> submitRegisterInfo(HttpServletRequest request){
        Map<String ,Object> modelMap = new HashMap<>();
        user.setUserName(HttpServletRequestUtil.getString(request,"userName"));
        user.setPassword(HttpServletRequestUtil.getString(request,"password"));
        user.setTrueName(HttpServletRequestUtil.getString(request,"TrueName"));
        user.setStudentCode(HttpServletRequestUtil.getInt(request,"StudentCode"));
        int flag = userDao.uploadRegisterInfo(user);
        if(flag==1){
            //添加成功
            modelMap.put("success",1);
        }else{
            //添加不成功
            modelMap.put("success",-1);
        }
        return modelMap;
    }
}