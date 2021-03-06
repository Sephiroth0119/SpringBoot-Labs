package cn.iocoder.springboot.lab23.testdemo.service;

import cn.iocoder.springboot.lab23.testdemo.dao.UserDao;
import cn.iocoder.springboot.lab23.testdemo.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDO get(Integer id) {
        return userDao.selectById(id);
    }

}
