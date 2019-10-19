package com.bluemsun.dao;

import com.bluemsun.entity.User;

import java.util.List;

public interface UserDao {
    //注册时调用
    /**
     *检测用户名
     * @param userName
     * @return
     */
    int checkOutUserName(String userName);
    /**
     * 检测学号
     * @param studentCode
     * @return
     */
    int checkOutStudentCode(int studentCode );
    /**
     * 新增用户
     * @param user
     * @return
     */
    int uploadRegisterInfo(User user);

    //登录时调用

    /**
     * 登录验证
     * @param userName
     * @param password
     * @return
     */
    User CheckLogin(String userName,String password);
    //主页调用
    /**
     * 获得用户所有信息
     * @param UserId
     * @return
     */
    User getUserInfo(int UserId);
    //成员管理页
    /**
     * 列出所有成员
     * @return
     */
    List<User> ListAllUser();

    /**
     * 更新个人身份与审核状态
     * @param UserId
     * @return
     */
    int UpdateUserAvailableAndStatus(int UserId);
    //个人主页
    /**
     * 密码更改
     * @param password
     * @param user_Id
     * @return
     */
    int UpadteUserPassword(int user_Id,String password);
}
