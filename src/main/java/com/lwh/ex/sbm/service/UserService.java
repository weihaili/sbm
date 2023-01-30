package com.lwh.ex.sbm.service;

import com.lwh.ex.sbm.model.UserQO;
import com.lwh.ex.sbm.model.UserVO;

import java.util.List;

public interface UserService {

    int saveUser(UserVO vo);

    int delUser(Long id);

    List<UserVO> queryUsers(UserQO qo);
}
