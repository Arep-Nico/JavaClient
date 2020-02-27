package escuelaing.arep;

import java.io.*;
import java.net.*;

public class URLReader implements Runnable {

    private String[] args;

    public URLReader(String[] args) {
        this.args = args;
    }

    private void process() throws MalformedURLException {
        URL url = new URL(this.args[0]);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    @Override
    public void run() {
        try {
            process();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}