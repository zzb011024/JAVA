package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发跳转
 * 可以让请求从服务端跳转到客户端（或跳转到指定Servlet）
 *
 */
@WebServlet("/ser04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收客户端请求参数
        String uname=req.getParameter("uname");
        System.out.println("Servlet04name"+uname);

    }
}
