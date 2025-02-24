package calcservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S2</title>");
            out.println("</head>");
            out.println("<body>");

            int nn1 = Integer.parseInt(request.getParameter("n1"));
            int nn2 = Integer.parseInt(request.getParameter("n2"));

            int p = nn1 * nn2;

            int sum = (int)request.getAttribute("sum");
            // Forwarding request to request dispatcher
            out.println("<h1>");
            out.println("Sum is = " + sum);
            out.println("Product is = " + p);
            out.println("</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
