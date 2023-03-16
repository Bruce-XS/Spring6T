package cn.bruce.spring6.service;

import cn.bruce.spring6.dao.User;
import cn.bruce.spring6.dao.UserDao;

/**
 * GFKDXS
 *
 * @version 1.0
 * @ClassName: UserService
 * @Description: service bean
 * @author: Bruce Xiao
 * @date: 2023-03-15
 */
public class UserService {

    private UserDao userDao;

    //起名字的时候 不要随便起 最好自动生成的  不要为难自己
//    public void setMysQLUserDao(UserDao xyz){
//        this.userDao = xyz;
//    }
    //不使用idea自带生成的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.insert();
    }


}
