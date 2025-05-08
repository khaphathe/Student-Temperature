<%-- 
    Document   : temperature_outcome
    Created on : 01 May 2025, 7:52:34 PM
    Author     : karabol7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <title>Temperature Outcome - Students Temperature Web Application</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        /* Reset & General Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f8;
            color: #333;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }

        header {
            background-color: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
            box-shadow: 0 2px 8px rgba(0,0,0,0.2);
        }

        header h1 {
            font-size: 2em;
        }

        main {
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
            padding: 40px 20px;
        }

        main h2 {
            font-size: 2em;
            color: #007bff;
            margin-bottom: 20px;
        }

        main p {
            font-size: 1.2em;
            color: #555;
            margin-bottom: 20px;
        }

        footer {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 15px 0;
            font-size: 0.9em;
        }
    </style>
</head>

<body>
    <header>
        <h1>Students Temperature Web Application</h1>
    </header>

    <main>
        <%
            
            String name = (String)request.getAttribute("name"); 
            String status = (String)request.getAttribute("status"); 
        %>
        <h2>Thank You, <%= name %>!</h2>
        <p>Your temperature has been successfully recorded and your status is <%= status %> </p> 
    </main>

    <footer>
        <p>&copy; 2025 Students Temperature Web Application</p>
    </footer>
</body>
</html>
