package cn.bruce.service.iml;

import cn.bruce.dao.UserDao;
import cn.bruce.dao.iml.UserDaoImlForMySQL;
import cn.bruce.service.UserService;

public class UserServiceIml implements UserService{

    private UserDao userDao = new UserDaoImlForMySQL();

    @Override
    public void deleteById() {
        userDao.deleteUser();
    }
}
