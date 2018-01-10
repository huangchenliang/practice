package com.example.demo.client;

import com.example.demo.config.MyConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lorne on 2017/6/27.
 */
@FeignClient(value = "demo3",configuration = MyConfiguration.class,fallback = Demo3ClientHystric.class)
public interface Demo3Client {



    @RequestMapping("/demo/save")
    int save();
}
