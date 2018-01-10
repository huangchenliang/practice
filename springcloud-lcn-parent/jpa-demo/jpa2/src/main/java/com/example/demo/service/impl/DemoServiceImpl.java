package com.example.demo.service.impl;

import com.example.demo.client.Demo3Client;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lorne on 2017/6/26.
 */
@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    private RestTemplate restTemplate;




    @Override
    public int save() {

       restTemplate.getForObject("http://DEMO3/demo/save",String.class);
        return 0;
    }
}
