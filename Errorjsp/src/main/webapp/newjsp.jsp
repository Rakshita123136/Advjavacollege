<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%> 
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Division Result</title>
</head>
<body>
    <%
        // Fetch two numbers
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");

        try {
            // Converting String to Integer
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);

            // Check for division by zero
            if (b != 0) {
                int c = a / b;
                out.println("<h1>Result is: " + c + "</h1>");
            } else {
                throw new ArithmeticException("Division by zero is not allowed");
            }
        } catch (Exception e) {
            throw e; // Redirect to error.jsp
        }
    %>
</body>
</html>
