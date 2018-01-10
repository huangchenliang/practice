package com.example.demo.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.demo.dao.TestRepository;
import com.example.demo.entity.Test;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by lorne on 2017/6/26.
 */
@Service
public class DemoServiceImpl implements DemoService {


//    @Autowired
//    private Demo2Client demo2Client;


    @Autowired
    private TestRepository testRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Test> list() {
        return testRepository.findAll();
    }

    @Override
    @TxTransaction
    @Transactional
    public int save() {

        String rs2 = restTemplate.getForObject("http://DEMO2/demo/save",String.class);
        System.out.println(rs2+"===");
        Test test = new Test();
        test.setName("jpa-hello-1");

        int rs1 = testRepository.save(test).getId();

//        int v = 100/0;

        return rs1;
    }
}
