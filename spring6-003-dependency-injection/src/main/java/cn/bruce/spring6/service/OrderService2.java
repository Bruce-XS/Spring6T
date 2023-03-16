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
public class OrderService2 {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    public void getData(){
        orderDao.getOrder();
    }
}
