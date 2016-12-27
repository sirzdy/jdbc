package com.zdy.view;

import com.zdy.action.ActionDO;
import com.zdy.model.Model;

import java.util.Scanner;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class View {
    public static final String CONTEXT="请选择条目：" +
            "EXIT/E 退出  " +
            "ADD/A 添加  " +
            "DELETE/D 删除  " +
            "UPDATE/U 修改  " +
            "QUERY/Q 查询  ";
    public static final String OPERATION_EXIT="EXIT";
    public static final String OPERATION_ADD="ADD";
    public static final String OPERATION_DELETE="DELETE";
    public static final String OPERATION_UPDATE="UPDATE";
    public static final String OPERATION_QUERY="QUERY";
    public static void main(String[] args) {
        System.out.println(CONTEXT);
        Scanner scanner=new Scanner(System.in);
        Model model=new Model();
        ActionDO actiondo=new ActionDO();
       while(scanner.hasNext()){
            String in=scanner.next().toString();
            if (OPERATION_EXIT.equals(in.toUpperCase())||OPERATION_EXIT.substring(0,1).equals(in.toUpperCase())){
                break;
            }
            if (OPERATION_ADD.equals(in.toUpperCase())||OPERATION_ADD.substring(0,1).equals(in.toUpperCase())){
                System.out.println("未完待续……");
            }
            if (OPERATION_DELETE.equals(in.toUpperCase())||OPERATION_DELETE.substring(0,1).equals(in.toUpperCase())){
                System.out.println("未完待续……");
            }
            if (OPERATION_UPDATE.equals(in.toUpperCase())||OPERATION_UPDATE.substring(0,1).equals(in.toUpperCase())){
                System.out.println("未完待续……");
            }
            if (OPERATION_QUERY.equals(in.toUpperCase())||OPERATION_QUERY.substring(0,1).equals(in.toUpperCase())){
                System.out.println("未完待续……");
            }
            //System.out.println("您输入的值是："+in);
        }
    }
}
