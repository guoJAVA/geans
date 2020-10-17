package com.gng.geans.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gng.geans.app.dao.IUserDao;
import com.gng.geans.app.service.IUserService;
import com.gng.geans.app.vo.User;
import com.gng.geans.common.api.CommonResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserDao userDao;

    public CommonResult<List<User>> queryUserList() {
        CommonResult<List<User>> commonResult;
        try {
            QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
            List<User> userList = userDao.selectList(queryWrapper);
            commonResult = CommonResult.createSuccessResult("获取用户列表成功", userList);
        } catch (Exception e) {
            commonResult = CommonResult.createFailedResult("获取用户列表失败", null);
            logger.error("获取用户列表失败:{}", e.getMessage(), e);
            e.printStackTrace();
        }
        return commonResult;
    }

    public CommonResult<User> queryUserById(Long userId) {
        CommonResult<User> commonResult;
        try {
            User user = userDao.queryUserById(userId);
            commonResult = CommonResult.createSuccessResult("获取用户成功", user);
        } catch (Exception e) {
            commonResult = CommonResult.createFailedResult("获取用户失败", null);
            logger.error("获取用户失败:{}", e.getMessage(), e);
            e.printStackTrace();
        }
        return commonResult;
    }
}
