package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * request作用域
 *      通过该对象可以在一个请求中传递数据，作用范围：在一次请求中有效，即服务器跳转有效（请求转发跳转时有效）
 * 设置域对象内容
 *  req.setAttribute(String name,Object value);
 * 获取对象内容
 * req.getAttribute(String name);
 * 删除对象内容
 * req.removeAttribute(String name)
 *
 */
@WebServlet("/ser06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取对象内容
        System.out.println("servlet06…");
        String name= (String) req.getAttribute("name");
        System.out.println("name:"+name);
        Integer age= (Integer) req.getAttribute("age");
        System.out.println("age:"+age);
        List<String> list= (List<String>) req.getAttribute("list");
        System.out.println(list.get(0));


    }
}
