package com.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2019/4/13 0013.
 */
public class IntSort {
    public static void main(String[] args) {

        //对list中进行排序
        List<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(9);
        list.add(3);
        //排序前数据
        System.out.println("排序前数据--------------");
        for(int n:list)
        {
            System.out.println("-------"+n);
        }
        Collections.sort(list);
        System.out.println("排序后数据--------------");
        for(int n:list)
        {
            System.out.println("-------"+n);
        }


    }
}
