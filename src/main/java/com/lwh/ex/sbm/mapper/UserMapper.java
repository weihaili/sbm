package com.lwh.ex.sbm.mapper;

import com.lwh.ex.sbm.model.UserQO;
import com.lwh.ex.sbm.model.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserMapper {

    int saveUser(UserVO vo);

    int delUserById(Long id);

    List<UserVO> queryUsers(UserQO qo);
}
