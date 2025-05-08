<%-- 
    Document   : admins
    Created on : 01 May 2025, 10:09:57 PM
    Author     : karabol7
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.StudentsTBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Admin View - Students Temperature Web Application</title>
         <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f6f8;
            color: #333;
        }

        header {
            background-color: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
            box-shadow: 0 2px 8px rgba(0,0,0,0.2);
        }

        nav {
            margin-top: 10px;
        }

        nav a {
            color: white;
            margin: 0 10px;
            text-decoration: none;
            font-size: 1em;
            transition: color 0.3s;
        }

        nav a:hover {
            color: #ffdd57;
        }

        main {
            padding: 40px 20px;
        }

        h1 {
            font-size: 2em;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: white;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        thead {
            background-color: #007bff;
            color: white;
        }

        th, td {
            padding: 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        td a {
            color: #007bff;
            text-decoration: none;
        }

        td a:hover {
            text-decoration: underline;
        }

        footer {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 15px 0;
            margin-top: 30px;
        }
    </style>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>Students Temperature Web Application - Admin</h1>
         <nav>
            <a href="index.html" title="Home">🏠 Home</a>
            <a href="student_form.html" title="Submit Temperature">Submit Temperature</a>
            <a href="about.html" title="About Us">About</a>
            <a href="contact.html" title="Contact Us">Contact</a>
        </nav>
    </header>

    <main>
         <%
             List<StudentsTBL> list = (List<StudentsTBL>)request.getAttribute("list");
              
         %>
         <table border="1">
             <thead>
                <tr>
                    <th>First Name</th>
                    <th>Surname</th>
                    <th>Student Number</th>
                    <th>Temperature (°C)</th>
                    <th>Status</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <%
                for(int i=0;i<list.size();i++){
                  StudentsTBL stud = list.get(i);
                  Long id = stud.getId();
                  String name = stud.getName();
                  String surname = stud.getSurname();
                  Double temperature = stud.getTemperature();
                   
                  String status;
        if (temperature > 37) {
            status = "High";
        } else if (temperature < 35) {
            status = "Low";
        } else {
            status = "Normal";
        }
        
            %>
            <tr>
                <td><%=name%></td>
                <td><%=surname%></td>
                <td><%=id%></td>
                <td><%=temperature%></td>
                <td><%=status%></td>
                <td><a href="edit.html">Edit</a> | <a href="delete.html">Delete</a></td>
            </tr>
            <%
                }
            %>
            
         </table>
    </main>
 
    <footer>
        <p>&copy; 2025 Students Temperature Web Application</p>
    </footer>
</html>
