package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 字符流响应数据
 *  乱码原因:
 *      对于getWriter获得的字符串资源，响应中文必定出乱码，因为服务端默认使用ISO-8859-1编码，该编码不支持中文
 *   解决方式:
 *          1. 设置服务端编码格式
 *               resp.setCharacterEncoding("UTF-8");
 *          2.设置客户端编码格式
 *              resp.setHeader("content-Type","text/html;charset=UTF-8");
 *    总结：
 *      设置客户端编码和服务端编码都支持中文，且保持一致
 *      同时设置客户端和服务端的编码
 *      resp.setContentType("text/html;charset=UTF-8");
 */
@WebServlet("/ser02")

public class servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置服务端编码格式
       // resp.setCharacterEncoding("UTF-8");
        //设置客户端编码格式
        // resp.setHeader("content-Type","text/html;charset=UTF-8");
        //同时设置客户端和服务端编码方式
        resp.setContentType("text/html;charset=UTF-8");

        //getWriter()        字符输出流（输出字符串）
        //获取字符输出流
        PrintWriter writer=resp.getWriter();
        //输出数据
        writer.write("<h2>你好<h2>");

    }
}
