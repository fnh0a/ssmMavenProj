package com.hou.erp.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hou.erp.dao.IUserDao;
import com.hou.erp.pojo.User;
import com.hou.erp.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
