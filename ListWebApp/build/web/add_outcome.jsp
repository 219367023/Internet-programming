<%-- 
    Document   : add_outcome
    Created on : 05 Apr 2025, 11:58:39 AM
    Author     : Jacob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add outcome Page</title>
    </head>
    <body>
        <h1>Add outcome</h1>
        
        <%
            String num = (String)request.getAttribute("numbStr");
        %>
        
        <p>
            The number <%=num%> has been added to the list.
            <br>
            <br>
            Please click <a href="menu.html">here</a> to go back the menu.
        </p>
        
    </body>
</html>
