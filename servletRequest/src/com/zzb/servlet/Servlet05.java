package com.zzb.servlet;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@WebServlet("/ser05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet05…");
        req.setAttribute("name","admin");
        req.setAttribute("age",18);
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        req.setAttribute("list",list);
//        req.getRequestDispatcher("ser06").forward(req,resp);
//        请求跳转到jsp页面
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
