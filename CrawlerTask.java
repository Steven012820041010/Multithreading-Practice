import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class CrawlerTask implements Runnable {
    private String url;
    private int index;
    public CrawlerTask(String url, int index) {
        this.url = url;
        this.index = index;
    }

    public void run() {
        System.out.printf("Crawler %d started: \n", index);
        
        try {
            Document doc = WebScraper.fetchHTML(url);
            String title = DataExtractor.extractTitle(doc);
            System.out.println("Title: " + index + " "  + title);
            // Elements pTag = document.select("p");
            // System.out.println(pTag);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 