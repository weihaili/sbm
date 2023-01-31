package com.lwh.ex.sbm.controller;

import com.alibaba.fastjson.JSONObject;
import com.lwh.ex.sbm.model.UserQO;
import com.lwh.ex.sbm.model.UserVO;
import com.lwh.ex.sbm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "userController", tags = "userController")
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService service;

    @ApiOperation(value = "queryUsers", tags = "userController")
    @GetMapping("/query")
    public List<UserVO> queryUsers(UserQO qo) {
        log.info("UserController queryUsers qo:{}", JSONObject.toJSONString(qo));
        return service.queryUsers(qo);
    }

    @DeleteMapping("/del")
    @ApiOperation(value = "delUser", tags = "userController")
    public int delUser(Long id) {
        log.info("UserController delUser id:{}", id);
        return service.delUser(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "saveUser", tags = "userController")
    public int saveUser(@RequestBody UserVO vo) {
        log.info("UserController saveUser vo:{}", JSONObject.toJSONString(vo));
        return service.saveUser(vo);
    }

    @PostMapping("/batch-save")
    @ApiOperation(value = "batchSaveUser", tags = "userController")
    public int batchSaveUser(@RequestBody List<UserVO> vos) {
        log.info("UserController batchSaveUser vos:{}", JSONObject.toJSONString(vos));
        return service.batchSaveUser(vos);
    }
}