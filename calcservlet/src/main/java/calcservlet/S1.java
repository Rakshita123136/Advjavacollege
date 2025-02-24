package calcservlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");
            out.println("</head>");
            out.println("<body>");
            String n1 = request.getParameter("n1");
            String n2 = request.getParameter("n2");

            int nn1 = Integer.parseInt(n1);
            int nn2 = Integer.parseInt(n2);

            int s = nn1 + nn2;

            request.setAttribute("sum", s);
            // Forwarding request to request dispatcher
            RequestDispatcher rd = request.getRequestDispatcher("s2");
            rd.forward(request, response);
            out.println("</body>");
            out.println("</html>");
        }
    }
}

