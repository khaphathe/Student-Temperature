<%-- 
    Document   : error_page
    Created on : 01 May 2025, 7:51:40 PM
    Author     : karabol7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            max-width: 500px;
            width: 100%;
            text-align: center;
        }
        h1 {
            color: #e74c3c;
            margin-bottom: 20px;
        }
        p {
            color: #555;
            font-size: 16px;
            line-height: 1.6;
        }
        b {
            color: #333;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            font-weight: bold;
        }
        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Error in Student Details</h1>
        <%
            String name = (String)request.getAttribute("name");
            Long id = (Long)request.getAttribute("id");
        %>
        <p>
            Hey <b><%=name %></b>, your student number <b><%= id %></b> is incorrect.<br>
            A student number must have <b>9</b> digits.
        </p>
        
        <p>
            Click <a href="student_form.html">here</a> to re-enter your details.
        </p>
    </div>
</body>
</html>
