package escuelaing.arep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ConcurrentURLReader
 */
public class ConcurrentURLReader {

    private int size;
    private final ExecutorService es;

    public ConcurrentURLReader(int poolSize) {
        es = Executors.newFixedThreadPool(poolSize);
        size = poolSize;
    }

    public void start(String[] args) {
        for (int i = 0; i < size; i++) {
            es.execute(new URLReader(args));
        }
    }

}