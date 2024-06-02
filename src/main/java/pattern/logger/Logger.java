package pattern.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger Instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (Instance == null) ;
        {
            Instance = new Logger();
        }
        return Instance;
    }

    public void classLogg(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String timeStamp = new SimpleDateFormat("dd.MM.yy").format(new Date());
        String logMessage = "Log info: " + timeStamp + " - " + className + " - " + info;
        System.out.println(logMessage);
    }


}
