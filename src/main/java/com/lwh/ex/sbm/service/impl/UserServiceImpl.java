package com.lwh.ex.sbm.service.impl;

import com.lwh.ex.sbm.mapper.UserMapper;
import com.lwh.ex.sbm.model.UserQO;
import com.lwh.ex.sbm.model.UserVO;
import com.lwh.ex.sbm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public int saveUser(UserVO vo) {
        return mapper.saveUser(vo);
    }

    @Override
    public int delUser(Long id) {
        return mapper.delUserById(id);
    }

    @Override
    public List<UserVO> queryUsers(UserQO qo) {
        return mapper.queryUsers(qo);
    }
}
