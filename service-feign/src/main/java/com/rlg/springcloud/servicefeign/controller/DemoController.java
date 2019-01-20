package com.rlg.springcloud.servicefeign.controller;

import com.rlg.springcloud.servicefeign.feigninterface.XieYanFeiInterface;
import com.rlg.springcloud.servicefeign.feigninterface.ZhangMengInterface;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.common.model.api.ApiResp;
import test.common.model.test.GirlVo;

/**
 * Created by zhangqin on 2019/1/20.
 */
@RestController
public class DemoController {

    @Autowired
    private ZhangMengInterface zhangMengInterface;

    @Autowired
    private XieYanFeiInterface xieYanFeiInterface;
    @RequestMapping("/xieyanfei")
    public String xieyanfei() {
        return xieYanFeiInterface.xieyanfei();
    }

    @RequestMapping("/zhangmeng")
    public String zhengmeng() {
        return zhangMengInterface.zhangmeng();
    }


    @RequestMapping("/girl/info")
    public ApiResp<GirlVo> getGirlInfo(String girlName) {
        if(StringUtils.isBlank(girlName)){
            return ApiResp.buildFail("请填写女孩名称");
        }
        ApiResp apiResp;
        switch (girlName){
            case "zhangmeng":
                apiResp = ApiResp.buildSuccess(zhangMengInterface.zhangmengInfo());
                break;
            case "xieyanfei":
                apiResp = ApiResp.buildSuccess(xieYanFeiInterface.xieyanfeiInfo());
                break;
                default:
                    apiResp = ApiResp.buildFail("你查找的女孩<"+girlName+">没有找到！");
                    break;
        }

        return apiResp;
    }
}
