import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class DataExtractor {
    public static String extractTitle(Document doc) {
        return doc.title();
    }
}