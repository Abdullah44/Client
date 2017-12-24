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
        <title>New Quiz</title>
    </head>
    <body>
        <div align="center">
        <h1>Create new quiz</h1>
        
        <form:form action="saveQuiz" method="post" modelAttribute="quiz">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Title:</td>
                <td><form:input path="title" /></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><form:input path="description" /></td>
            </tr>
            <tr>
                <td>Marks:</td>
                <td><form:input path="marks" /></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
    </body>
</html>
