<%-- 
    Document   : delete_outcome
    Created on : 02 May 2025, 3:57:16 PM
    Author     : karabol7
--%>

<%@page import="za.ac.tut.entities.StudentsTBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Deletion Outcome</title>
        
        <style>
            /* General body styles */
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
            }

            /* Container for content */
            .container {
                max-width: 800px;
                margin: 50px auto;
                padding: 20px;
                background-color: #fff;
                border-radius: 8px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            }

            /* Heading style */
            h1 {
                font-size: 28px;
                color: #333;
                text-align: center;
                margin-bottom: 20px;
            }

            /* Paragraph style */
            p {
                font-size: 16px;
                line-height: 1.5;
                color: #555;
                text-align: center;
            }

            /* Link styles */
            a {
                color: #007BFF;
                text-decoration: none;
                font-weight: bold;
            }

            a:hover {
                text-decoration: underline;
            }

            /* Success message style */
            .success-message {
                background-color: #d4edda;
                border: 1px solid #c3e6cb;
                color: #155724;
                padding: 15px;
                border-radius: 8px;
                margin-bottom: 20px;
                text-align: center;
            }

            /* Button-like appearance for the link */
            a.button {
                padding: 10px 20px;
                background-color: #007BFF;
                color: white;
                border-radius: 5px;
                text-align: center;
                display: inline-block;
                text-decoration: none;
                font-weight: bold;
            }

            a.button:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            StudentsTBL stbl = (StudentsTBL)request.getAttribute("stbl");
        %>
        <p>
             The student with id number <%=stbl.getId()%> has been successfully deleted.
         Please click <a href="admins_view.html">here</a> to view details.
        </p>
    </body>
</html>
