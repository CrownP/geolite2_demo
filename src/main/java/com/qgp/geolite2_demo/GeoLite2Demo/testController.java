package com.qgp.geolite2_demo.GeoLite2Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName testController
 * @Description TODO
 * @Author qgp
 * @Date 2019/9/24 9:33
 * @Version 1.0
 **/
@RestController
public class testController {

    @RequestMapping("/getIpMsg")
    public String getIpMsg(@RequestParam String ip) {
        IPEntity msg = IPUtils.getIPMsg(ip);
        return msg.toString();
    }
}
