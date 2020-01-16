package com.atguigu.springboothelloworld.bean;

import java.util.ArrayList;

/**
 * @author van
 * @date 2020/1/16
 */
public class TemplatesTest
{
    //模板一:psvm
    public static void main(String[] args) {

        //模板二:sout
        System.out.println();
        //变形 soutp / soutm soutv xxx.sout
        String str="123";
        System.out.println("str = " + str);
        //模板三 fori
        String arr[] = new String[]{"aa","bbb","ccc"};
        for (int i = 0; i <arr.length ; i++) {
            
        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList<Object> objects = new ArrayList<>();
        if (objects == null) {
            
        }
    }

}
