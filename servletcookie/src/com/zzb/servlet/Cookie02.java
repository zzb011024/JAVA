package com.zzb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie的获取
 * 返回的是Cookie的数组
 */
@WebServlet("/co02")
public class Cookie02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取Cookie数组
        Cookie[] cookies=req.getCookies();
        if (cookies!=null&&cookies.length>0){
            //遍历cookie数组
            for (Cookie cookie:cookies){
                //获取cookie名称和值
                String name=cookie.getName();
                String value=cookie.getValue();
                System.out.println("name: "+name+"value: "+value);
            }
        }
    }
}
