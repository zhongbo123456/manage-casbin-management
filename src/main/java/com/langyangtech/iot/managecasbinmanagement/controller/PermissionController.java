package com.langyangtech.iot.managecasbinmanagement.controller;

import com.langyangtech.iot.common.Result;
import com.langyangtech.iot.managecasbinmanagement.eintity.Policy;
import com.langyangtech.iot.managecasbinmanagement.init.EnforcerFactory;
import com.langyangtech.iot.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhongbo
 */
@RestController
public class PermissionController {

    @PostMapping("/anon/role/per")
    public Result addPer(){

        EnforcerFactory.addPolicy(new Policy("bob", "/check", "GET"));

        return ResultUtils.success();
    }

    @DeleteMapping("/anon/role/per")
    public Result deletePer(){

        EnforcerFactory.removePolicy(new Policy("alice", "/user/list", "*"));

        return ResultUtils.success();
    }

    @GetMapping("/check")
    public Result check(){
        return ResultUtils.success("校验通过");
    }

    @GetMapping("/hello")
    public Result sayHello(){
        return ResultUtils.success("hello world");
    }

    @GetMapping("/try")
    public Result  sayTry(){
        return ResultUtils.success("say try");
    }


}
