package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 字节流响应数据
 * 乱码问题
 *      对于getOutputStream()获得的字节流，响应中文时，由于本身就是传输的字节，可能乱码，也可能显示正确
 *乱码解决
 *1. 设置服务端编码格式
 *                resp.setCharacterEncoding("UTF-8");
 *2.设置客户端编码格式
 *               resp.setHeader("content-Type","text/html;charset=UTF-8");
 *      总结：
 *       设置客户端编码和服务端编码都支持中文，且保持一致
 *       同时设置客户端和服务端的编码
 *       resp.setContentType("text/html;charset=UTF-8");
 *
 */
@WebServlet("/ser03")

public class servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //同时设置客户端和服务端编码方式
        resp.setContentType("text/html;charset=UTF-8");
        //getOutputStream()  字节输出流（输出任意类型数据）
        //获取字节输出流
        ServletOutputStream out=resp.getOutputStream();
        //输出数据
        out.write( "<h2>你好<h2>".getBytes("UTF-8"));
    }
}
