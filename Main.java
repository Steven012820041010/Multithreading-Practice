import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String [] urls = {"https://example.com", "https://example.com", "https://example.com", "https://example.com", "https://example.com", "https://example.com"};
        ExecutorService executor = Executors.newFixedThreadPool(5);
        int index = 1;
        for (int i = 0; i < 1000; i++) {
            String url = urls[0];
            CrawlerTask task = new CrawlerTask(url, index++);
            executor.execute(task);
        }

        executor.shutdown();
    }
}