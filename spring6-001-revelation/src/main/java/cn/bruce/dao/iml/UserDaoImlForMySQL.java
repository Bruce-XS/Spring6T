package cn.bruce.dao.iml;

import cn.bruce.dao.UserDao;

public class UserDaoImlForMySQL implements UserDao {

    @Override
    public void deleteUser() {
        System.out.println("MySQL数据库正在删除user info....");
    }
}
