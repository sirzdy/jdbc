package com.zdy.dao;
import com.zdy.db.DButil;
import com.zdy.model.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class Dao {
    public void add(Model model) throws SQLException {
        Connection connection= DButil.getConnection();
        String sql="" +
                "insert into pwd(no,pwd)" +
                "values(?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,model.getNo());
        preparedStatement.setString(2,model.getPwd());
        preparedStatement.execute();
    }
    public void update(Model model) throws SQLException {
        Connection connection= DButil.getConnection();
        String sql="" +
                "update pwd " +
                "set pwd=? " +
                "where no=? ";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,model.getPwd());
        preparedStatement.setString(2,model.getNo());
        preparedStatement.execute();
    }
    public void delete(String no) throws SQLException {
        Connection connection= DButil.getConnection();
        String sql="delete from pwd " +
                "where no=? ";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,no);
        preparedStatement.execute();
    }
    public List<Model> query() throws SQLException {
        Connection connection= DButil.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from pwd");
        List<Model> ms=new ArrayList<Model>();
        Model m=null;
        while(resultSet.next()){
            m=new Model();
            m.setNo(resultSet.getString("no"));
            m.setPwd(resultSet.getString("pwd"));
            ms.add(m);
        }
        return ms;
    }

    public List<Model> query(String pwd) throws SQLException {//按照条件查询
        Connection connection= DButil.getConnection();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("select * from pwd");
        //stringBuilder.append(" where pwd=?");
        stringBuilder.append(" where pwd like ?");
        PreparedStatement preparedStatement=connection.prepareStatement(stringBuilder.toString());
        //preparedStatement.setString(1,pwd);
        preparedStatement.setString(1,"%"+pwd+"%");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Model> ms=new ArrayList<Model>();
        Model m=null;
        while(resultSet.next()){
            m=new Model();
            m.setNo(resultSet.getString("no"));
            m.setPwd(resultSet.getString("pwd"));
            ms.add(m);
        }
        return ms;
    }
    public List<Model> query(List<Map<String,Object>> params) throws SQLException {
        Connection connection= DButil.getConnection();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("select * from pwd where 1=1");
        if (params!=null&&params.size()>0){
            for (int i=0;i<params.size();i++){
                Map<String,Object> map=params.get(i);
                stringBuilder.append(" and " + map.get("name")+map.get("relative")+map.get("value"));
            }
        }
        PreparedStatement preparedStatement=connection.prepareStatement(stringBuilder.toString());
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Model> ms=new ArrayList<Model>();
        Model m=null;
        while(resultSet.next()){
            m=new Model();
            m.setNo(resultSet.getString("no"));
            m.setPwd(resultSet.getString("pwd"));
            ms.add(m);
        }
        return ms;
    }

    public Model get(String no) throws SQLException {
        Model m=null;
        Connection connection= DButil.getConnection();
        String sql="select * from pwd " +
                "where no=? ";
        System.out.println(no);
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,no);
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next()){
            m=new Model();
            m.setNo(resultSet.getString("no"));
            m.setPwd(resultSet.getString("pwd"));
        }
        return m;
    }
}
