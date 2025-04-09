import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/NewRegisterServlet")
public class NewRegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET requests (redirect to register.html)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("register.html");  // Redirect to the registration form
    }

    // Handle POST requests (form submission)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");

        // Simulating a successful registration response
        response.setContentType("text/html");
        response.getWriter().println("<h2>Registration Successful!</h2>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Gender: " + gender + "</p>");
        response.getWriter().println("<p>Country: " + country + "</p>");
    }
}
