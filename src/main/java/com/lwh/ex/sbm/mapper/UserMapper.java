package com.lwh.ex.sbm.mapper;

import com.lwh.ex.sbm.model.UserQO;
import com.lwh.ex.sbm.model.UserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserMapper {

    int saveUser(@Param("vo") UserVO vo);

    int delUserById(@Param("id") Long id);

    List<UserVO> queryUsers(@Param("qo") UserQO qo);

    int batchSave(@Param("vos") List<UserVO> vos);
}
