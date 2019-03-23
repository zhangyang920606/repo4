
<%@ page import="com.itheima.domain.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>



  <%

    User user= new User();

    user.setUsername("jack");

    request.getSession().setAttribute("user" , user);

  %>

${sessionScope.user.username}
  <body>
  <%--index.jsp...--%>
  </body>
</html>
