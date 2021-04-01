package com.zzb.servlet;

import sun.nio.cs.ISO_8859_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求乱码问题
 * Get
 * Tomcat8.5 8以上版本                            7
 * Get       不乱码                               乱码
 * Post      会乱码，通过设置服务器解析编码格式      乱码
 * 乱码原因： Request 默认ISO-8859-1（不支持中文）
 * 解决方式： req.setCharacterEncoding("UTF-8");;要放在获取参数前
 * 乱码情况： post请求无论哪个版本都会乱码
 *           Get 也都会乱码，而且在7版本下即便加上req.setCharacterEncoding("UTF-8");也不能解决乱码问题，因为它只针对post请求
 *           new String (req.getParameter("uname").getBytes("ISO-8859-1"),"UTF-8");针对任何请求方式；
 *           但如果数据本身不乱码，依然使用new String，则会乱码
 */
@WebServlet("/ser02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //获取客户端传递的参数
        String uname=req.getParameter("uname");
        String pawd=req.getParameter("pawd");

        System.out.println("姓名"+uname);
        System.out.println("密码"+pawd);
        //解决Tomcat7及以下一般版本的GET乱码;
//        String name=new String (req.getParameter("uname").getBytes("ISO-8859-1"),"UTF-8");
//        System.out.println("nsme"+name);

    }
}
