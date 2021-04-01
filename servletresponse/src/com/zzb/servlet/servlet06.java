package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *重定向与请求转发区别
 * 请求转发地址栏不会变，重定向会变
 * 请求转发只有一次求，重定向两次
 * 请求转发request对象共享，重定向不共享
 * 请求转发是服务端行为，重定向是客户端行为
 * 请求转发地址只能是当前站点下（当前项目）下的资源；重定向可以是任何地址，不能是WEB-INF下文件
 */
@WebServlet("/ser06")

public class servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet06");
        //接收参数
        String uname=req.getParameter("uname");
        System.out.println("servlet06"+uname);
        //设置request域对象
        req.setAttribute("pawd","123456");
        //请求转发
        //req.getRequestDispatcher("index.jsp").forward(req,resp);
        //重定向
        //resp.sendRedirect("index.jsp");
        //重定向到百度
        //resp.sendRedirect("http://www.baidu.com");
        //请求转发到百度404
        //req.getRequestDispatcher("http://www.baidu.com").forward(req,resp);
    }
}
