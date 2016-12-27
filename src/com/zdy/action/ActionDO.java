package com.zdy.action;

import clojure.lang.Obj;
import com.zdy.dao.Dao;
import com.zdy.model.Model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class ActionDO {
    //增
    public void add(Model model) throws SQLException {
        Dao dao=new Dao();
        dao.add(model);
    }
    //删
    public void del(String no) throws SQLException {
        Dao dao=new Dao();
        dao.delete(no);
    }
    //改
    public void upd(Model model) throws SQLException {
        Dao dao=new Dao();
        dao.update(model);
    }
    //查一个
    public Model get(String no) throws SQLException {
        Dao dao=new Dao();
        return dao.get(no);
    }
    //查全部
    public List<Model> query() throws SQLException {
        Dao dao=new Dao();
        return dao.query();
    }
    //查条件
    public List<Model> query(List<Map<String,Object>> params) throws SQLException {
        Dao dao=new Dao();
        return dao.query(params);
    }
}
