import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {

    private final Map<String, String> timeZones = new HashMap<>();

    @Override
    public void init() throws ServletException {
        super.init();
        timeZones.put("/minsk", "Europe/Minsk");
        timeZones.put("/washington", "America/New_York");
        timeZones.put("/beijing", "Asia/Shanghai");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();
        String timeZone = timeZones.get(path);

        if (timeZone != null) {
            ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(timeZone));
            response.setContentType("text/plain");
            response.getWriter().println("Текущее время в " + path.substring(1) + ": " + currentTime);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Указанный URL не найден");
        }
    }
}