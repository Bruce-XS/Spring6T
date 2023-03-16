package cn.bruce.spring6.service;

import cn.bruce.spring6.dao.OrderDao;
import cn.bruce.spring6.dao.UserDao;

/**
 * GFKDXS
 *
 * @version 1.0
 * @ClassName: OrderService
 * @Description: OrderService
 * @author: Bruce Xiao
 * @date: 2023-03-15
 */
public class OrderService {

    private UserDao userDao;
    private OrderDao orderDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    //    public OrderService(UserDao userDao, OrderDao orderDao) {
//        this.userDao = userDao;
//        this.orderDao = orderDao;
//    }

    public void getData(){
        userDao.insert();
        orderDao.getOrder();
    }
}
