package creational.singleton;

public class Logger {

    // Eager initialization.
    // JVM class initialization is thread-safe.
    private static final Logger instance = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

}
