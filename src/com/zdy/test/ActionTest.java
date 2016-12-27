package com.zdy.test;

import com.zdy.action.ActionDO;
import com.zdy.model.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class ActionTest {
    public static void main(String[] args) throws SQLException {
        ActionDO actiondo=new ActionDO();
        //新增
        /*Model model=new Model();
        model.setNo("20122430222");
        model.setPwd("000000");
        actiondo.add(model);*/

        //删除
        /*actiondo.del("20122430222");*/

        //更新
        /*Model model=new Model();
        model.setNo("20122430222");
        model.setPwd("2222222");
        actiondo.upd(model);*/

        //查询全部
        /* List<Model> ms=actiondo.query();
        for (int i=0;i<ms.size();i++){
            //System.out.println(ms.get(i).toString());
            System.out.println(ms.get(i).getNo()+":"+ms.get(i).getPwd());
        }*/

        //条件查询
        List<Map<String,Object>> params=new ArrayList<Map<String,Object>>();
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("name","pwd");
        param.put("relative","=");
        param.put("value","'dspzzy'");
        params.add(param);
        List<Model> ms=actiondo.query(params);
        for(int i=0;i<ms.size();i++){
            System.out.println(ms.get(i).toString());
        }
    }

}
