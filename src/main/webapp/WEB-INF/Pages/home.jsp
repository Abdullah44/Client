<%-- 
    Document   : home
    Created on : Nov 20, 2017, 8:57:16 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
        <h1>User List</h1>
        <h3>
            <a href="newUser">New User</a>
        </h3>
        <h3>
            <a href="Login">Login</a>
        </h3>
        <table border="1">
 
            <th>ID</th>
            <th>UserName</th>
            <th>Role</th>
            <c:forEach var="user" items="${listUsers}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.type}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </body>
</html>
