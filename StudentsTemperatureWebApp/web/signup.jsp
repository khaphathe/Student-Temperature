<%-- 
    Document   : signup
    Created on : 08 May 2025, 9:31:45 AM
    Author     : karabol7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Signup Page</title>
        <style>
            /* General Body Styling */
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                background-color: #f4f7fc;
                color: #333;
            }

            /* Main Section Styling */
            main {
                max-width: 600px;
                margin: 30px auto;
                padding: 20px;
                background-color: #fff;
                border-radius: 8px;
                box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
            }

            h2 {
                text-align: center;
                color: #007bff;
                margin-bottom: 20px;
            }

            p {
                text-align: center;
                color: #777;
                margin-bottom: 20px;
            }

            /* Form Styling */
            form {
                display: flex;
                flex-direction: column;
            }

            label {
                font-size: 14px;
                margin-bottom: 5px;
                color: #555;
            }

            input[type="text"], input[type="password"], input[type="name"] {
                padding: 10px;
                margin-bottom: 15px;
                border: 1px solid #ccc;
                border-radius: 4px;
                font-size: 14px;
                outline: none;
            }

            input[type="text"]:focus, input[type="password"]:focus {
                border-color: #4caf50;
            }

            .btn {
                padding: 10px;
                background-color: #007bff;
                color: white;
                border: none;
                border-radius: 4px;
                font-size: 16px;
                cursor: pointer;
                transition: background-color 0.3s;
            }

            .btn:hover {
                background-color: #45a049;
            }

            .footer {
                text-align: center;
                padding: 10px;
                background-color: #333;
                color: white;
                position: fixed;
                bottom: 0;
                width: 100%;
            }

            /* Responsive Design */
            @media (max-width: 600px) {
                main {
                    padding: 15px;
                }

                input[type="text"], input[type="password"], input[type="name"] {
                    padding: 8px;
                }

                .btn {
                    padding: 8px;
                }
            }
        </style>
    </head>
    <body>
    

        <main>
            <h2>Enter The details Below To LogIn</h2>
            <form action="AdminSignUpServlet.do" method="POST">
                <label for="name">Name:</label>
                <input type="text" name="name" id="name" required>

                <label for="surname">Surname:</label>
                <input type="text" name="surname" id="surname" required>

                <label for="email">Email:</label>
                <input type="text" name="email" id="email" required>

                <label for="contact">Contact:</label>
                <input type="text" name="contact" id="contact" required>

                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required>

                <input type="submit" value="Sign Up" class="btn">
                <p>Already have an account?  <a href="admin_login.html" >Yes To Login</a></p>
            </form>
        </main>

        <footer class="footer">
            <p>&copy; 2025 Students Temperature Web Application</p>
        </footer>
    </body>
</html>
