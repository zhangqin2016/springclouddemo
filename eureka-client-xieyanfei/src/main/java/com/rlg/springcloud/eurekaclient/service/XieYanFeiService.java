package com.rlg.springcloud.eurekaclient.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import test.common.model.test.GirlVo;

/**
 * Created by Administrator on 2019/1/20.
 */
@RestController
public class XieYanFeiService {

    @RequestMapping("/xieyanfei")
    public String xieyanfei() {
        return " request xieyanfei service success !";
    }

    @RequestMapping("/xieyanfei/info")
    public @ResponseBody GirlVo xieyanfeiInfo() {
        return new GirlVo("谢艳飞","18","无");
    }

}
