package escuelaing.arep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ConcurrentURLReader
 */
public class ConcurrentURLReader {

    private boolean running;
    private final ExecutorService es;

    public ConcurrentURLReader(int poolSize) {
        es = Executors.newFixedThreadPool(poolSize);
        running = true;
    }

    public void start(String[] args){
        while (running) {
            es.execute(new URLReader(args));
        }
    }

}