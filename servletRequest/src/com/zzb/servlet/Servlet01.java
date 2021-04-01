package com.zzb.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //常用方法
        //获取请求时的完整路径（从http开始，到？前面结束
        String url=req.getRequestURL()+" ";
        System.out.println("获取请求时的完整路径"+url);
        //获取请求时的部分路径（从项目的站点名开始，到？前结束
        String uri=req.getRequestURI();
        System.out.println("获取请求时的部分路径"+uri);
        //获取请求时的参数字符串，（从?后开始最后字符串）
        String queryString=req.getQueryString();
        System.out.println("获取请求时的参数字符串"+queryString);
        //获取请求方式（Get，Post）
        String method=req.getMethod();
        System.out.println("获取请求方式"+method);
        //获取当前协议版本 （HTTP/1.1）
        String prototcol =req.getProtocol();
        System.out.println("获取当前协议版本"+prototcol);
        //获取项目的站点名（项目对外访问路径）
        String webapp=req.getContextPath();
        System.out.println("获取项目的站点名"+webapp);


        /*获取请求参数的函数*/
        //获取指定名称的参数值,返回字符串（重点！！！）
        String uname=req.getParameter( "uname");
        String pawd=req.getParameter( "pawd");
        System.out.println("uname"+uname+" "+"pawd"+pawd);


        //获取指定名称参数的所有参数值,返回字符串数组（用于复选框传值）
        String []hobbys=req.getParameterValues( "hobby");
        //判断数组是否为空；
        if(hobbys!=null&&hobbys.length>0){
            for (String hobby:hobbys){
                System.out.println("爱好："+hobby);
            }
        }
    }
}
