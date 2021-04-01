package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发跳转
 * req.getRequestDispatcher("url").forward(req,resp);
 * 可以让请求从服务端跳转到客户端（或跳转到指定Servlet）
 *
 * 特点：
 *      服务端行为
 *      地址栏不变
 *      从始至终只有一个请求
 *
 */
@WebServlet("/ser03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收客户端请求参数
        String uname=req.getParameter("uname");
        System.out.println("Servlet03name"+uname);
        //请求跳转到Servlet04
       // req.getRequestDispatcher("ser04").forward(req,resp);
        //请求跳转到jsp页面
        //req.getRequestDispatcher("login.jsp").forward(req,resp);
        //请求跳转到HTML页面
        req.getRequestDispatcher("login.html").forward(req,resp);
    }
}
