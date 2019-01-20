package com.rlg.springcloud.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import test.common.model.test.GirlVo;

/**
 * Created by zhangqin on 2019/1/20.
 */
@RestController
public class ZhangMengService {


    @RequestMapping("/zhangmeng")
    public String zhangmeng() {
        return " request zhengmeng service success !";
    }

    @RequestMapping("/zhangmeng/info")
    public @ResponseBody
    GirlVo zhangmengInfo() {
        return new GirlVo("张梦","18","无");
    }

}
