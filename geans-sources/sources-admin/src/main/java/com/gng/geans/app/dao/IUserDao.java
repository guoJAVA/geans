package com.gng.geans.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gng.geans.app.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends BaseMapper<User> {

    User queryUserById(Long userId);
}
