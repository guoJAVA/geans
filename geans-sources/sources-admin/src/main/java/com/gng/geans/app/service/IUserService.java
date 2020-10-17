package com.gng.geans.app.service;

import com.gng.geans.app.vo.User;
import com.gng.geans.common.api.CommonResult;

import java.util.List;

public interface IUserService {

    /**
     * 查询用户列表
     * @return
     */
    CommonResult<List<User>> queryUserList();

    /**
     * 根据标识查询用户信息
     * @param userId
     * @return
     */
    CommonResult<User> queryUserById(Long userId);
}
