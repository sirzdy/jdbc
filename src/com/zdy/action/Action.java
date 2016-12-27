package com.zdy.action;

import clojure.lang.Obj;
import com.zdy.dao.Dao;
import com.zdy.model.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class Action {
    public static void main(String[] args) throws Exception {
        Dao dao=new Dao();
        //新增
        /*Model model=new Model();
        model.setNo("20122430202");
        model.setPwd("123456789");
        dao.add(model);*/

        //删除
        /*dao.delete("20122430202");*/

        //修改
        /*Model model=new Model();
        model.setNo("20122430202");
        model.setPwd("9999999999");
        dao.update(model);*/

        //查询单个,按照id
        /*Model m=dao.get("20122430238");
        System.out.println(m.toString());*/

        //查询全部
        /*List<Model> ms=dao.query();
        for (Model m:ms){
            System.out.println(m.getNo()+","+m.getPwd());
        }*/

        //条件查询
        /*List<Model> ms=dao.query("23456");
        for(int i=0;i<ms.size();i++){
            System.out.println(ms.get(i).toString());
        }
        for (Model m:ms){
            System.out.println(m.getNo()+","+m.getPwd());
        }*/

        //条件查询2
        List<Map<String,Object>> params=new ArrayList<Map<String,Object>>();
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("name","pwd");
        param.put("relative","=");
        param.put("value","'dspzzy'");
        params.add(param);
        List<Model> ms=dao.query(params);
        for(int i=0;i<ms.size();i++){
            System.out.println(ms.get(i).toString());
        }
    }
}
