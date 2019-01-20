package com.rlg.springcloud.servicefeign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import test.common.model.test.GirlVo;

/**
 * Created by zhangqin on 2019/1/20.
 */
@FeignClient(value = "service-zhangmeng")
public interface ZhangMengInterface {

    @RequestMapping(value = "/zhangmeng",method = RequestMethod.GET)
    String zhangmeng();


    @RequestMapping(value = "/zhangmeng/info",method = RequestMethod.GET)
    GirlVo zhangmengInfo();


}