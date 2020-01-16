package com.atguigu.springboothelloworld.bean;

import java.util.HashMap;

/**
 * @author van
 * @date 2020/1/16
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        for (int i = 0; i <60 ; i++) {
            System.out.println(i);
        }
        String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
    }
}
