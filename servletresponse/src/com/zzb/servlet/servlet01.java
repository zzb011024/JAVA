package com.zzb.servlet;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 响应数据
 *      getWriter()        字符输出流（输出字符串）
 *
 *      getOutputStream()  字节输出流（输出任意类型数据）
 *      二者不可同时使用，同时使用会报错
 */
@WebServlet("/ser01")

public class servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //getWriter()        字符输出流（输出字符串）
        //获取字符输出流
        //PrintWriter writer=resp.getWriter();
        //输出数据
        //writer.write("hello");
        //getOutputStream()  字节输出流（输出任意类型数据）
        //获取字节输出流
        ServletOutputStream out=resp.getOutputStream();
        //输出数据
        out.write( "hi".getBytes());
    }
}
