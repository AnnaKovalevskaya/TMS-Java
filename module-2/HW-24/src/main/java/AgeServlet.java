import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/checkAge")
public class AgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ageParam = request.getParameter("age");

        if (ageParam != null) {
            try {
                int age = Integer.parseInt(ageParam);
                response.setContentType("text/plain");

                if (age >= 18) {
                    response.getWriter().println("Вы совершеннолетний.");
                } else {
                    response.getWriter().println("Вы несовершеннолетний.");
                }
            } catch (NumberFormatException e) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Некорректный возраст.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Возраст не указан.");
        }
    }
}
