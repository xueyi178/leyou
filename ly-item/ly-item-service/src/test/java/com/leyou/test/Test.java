package com.leyou.test;

import java.util.*;

/**
 * @ProjectName 测试类
 * @ClassName Test
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/12/28 19:53
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //分子
        int a = 35;
        //分母
        int b= 8;
        //得出每个的数量
        int c = a/b;
        for(int i =0;i<b;i++) {
            System.out.println("c====="+c);
            //循环增加每个
            list.add(c);
        }
        //得出余数
        int d = a%b;
        //按1循环余数
        for(int i =0;i<d;i++) {
            System.out.println("第二个for循环====="+i);
            System.out.println("第二个for循环====="+d);
            list.set(i, list.get(i)+1);
        }

        System.out.println(list.toString());
    }
}
