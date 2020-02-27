package escuelaing.arep;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        ConcurrentURLReader cur = new ConcurrentURLReader(5);
        cur.start(args);
    }
}