package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *重定向
 *服务端指导，客户端行为，存在两次请求
 * 地址栏会改变
 * request对象不共享
 */
@WebServlet("/ser04")

public class servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet04");
        //接收参数
        String uname=req.getParameter("uname");
        System.out.println("servlet04"+uname);
        //重定向到ser05
        resp.sendRedirect("ser05");
    }
}
