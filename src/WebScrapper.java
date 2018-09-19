import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebScrapper {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static int numofword(String[] strarray, String word) {
        int total = 0;
        for(String item: strarray) {
            if (item.toLowerCase() == word.toLowerCase()) {
                total += 1;
            }
        }
        return total;
    }
    public static int numofuniquewords(String[] strarray){
        List<String> known = new ArrayList<>();
        for (String item: strarray){
            if (!known.contains(item)) {
                known.add(item);
            }
        }
        return known.size();
    }
}
