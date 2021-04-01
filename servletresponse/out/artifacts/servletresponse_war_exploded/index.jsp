<%--
  Created by IntelliJ IDEA.
  User: 17840
  Date: 2021/3/28
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    //获取参数
    String uname=request.getParameter("uname");
    String pawd= (String) request.getAttribute("pawd");
    //输出内容
    out.print(uname);
    out.print("------------------------");
    out.print(pawd);

  %>
  </body>
</html>
