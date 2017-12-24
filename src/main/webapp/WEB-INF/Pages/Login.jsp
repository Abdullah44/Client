<%-- 
    Document   : Login
    Created on : Nov 20, 2017, 9:01:03 PM
    Author     : user
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
        <h1>Login</h1>
        
        <form action="/j_spring_security_check" method="post" >
        <table>
            
            <tr>
                <td>Username:</td>
                <td><input path="Username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type = "Password" path="Password" /></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form>
    </div>
    </body>
</html>
