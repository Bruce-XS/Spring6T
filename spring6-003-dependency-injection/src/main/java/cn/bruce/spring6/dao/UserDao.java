package cn.bruce.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GFKDXS
 *
 * @version 1.0
 * @ClassName: UserDao
 * @Description: dao bean
 * @author: Bruce Xiao
 * @date: 2023-03-15
 */
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert(){
        logger.info("数据据正在保存。。。。。。。。。");
    }
}
