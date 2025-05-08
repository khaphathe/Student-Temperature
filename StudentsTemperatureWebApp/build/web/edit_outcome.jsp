<%-- 
    Document   : edit_outcome
    Created on : 02 May 2025, 8:23:46 AM
    Author     : karabol7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Outcome</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
            color: #333;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        main {
            flex: 1;
            padding: 40px 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        h1 {
            color: #28a745;
            margin-bottom: 20px;
        }

        .message-box {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            text-align: center;
        }

        .message-box p {
            font-size: 1.2em;
            margin: 15px 0;
        }

        .message-box a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .message-box a:hover {
            text-decoration: underline;
        }

        footer {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 15px;
            font-size: 0.9em;
        }
    </style>
    </head>
    <body>
        <main>
        <h1>Update Successful!</h1>
        <div class="message-box">
        <%
            Long id = (Long)request.getAttribute("id");
            String name = (String)request.getAttribute("name");
            String surname = (String)request.getAttribute("surname");
             
            
        %>
        <p>
            The student number <strong><%=id%></strong> has been successfully updated.
            Please click <a href="admins_view.html">here</a> to view details.
        </p>
        </div>
        </main>
         <footer>
        <p>&copy; 2025 Students Temperature Web Application</p>
    </footer>
    </body>
</html>
