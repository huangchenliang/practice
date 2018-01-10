package com.hchl.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/11/9
 *
 * @author ：huangchenliang
 */
// @RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test
{

    public static void main(String[] args)
    {
//        IntStream.range(0,10).forEach(System.out::println);
        List<Integer> list = IntStream.range(0,10).boxed().collect(Collectors.toList());
        ArrayList list1 = new ArrayList(){{add(1);add(1);add(2);}};

        System.out.println(list1.stream().distinct().count());
    }
}
