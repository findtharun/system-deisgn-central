
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class URLShortener {

    private AtomicLong idGenerator = new AtomicLong(128123021); // Generates unique IDs for URLs
    private static final String BASE_DOMAIN = "https://short.url/";
    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private Map<String, URLEntry> longUrlToEntry = new HashMap<>(); // longURL to UrlEntry
    private Map<String, URLEntry> shortUrlToEntry = new HashMap<>(); // shortURL to UrlEntry

    // Inner class to store the long URL and short URL as a pair

    // Method to shorten a URL
    public String shortenURL(String longURL) {
        // Check if the long URL already has an entry
        if (longUrlToEntry.containsKey(longURL)) {
            return BASE_DOMAIN + longUrlToEntry.get(longURL).getEncodedString();
        }

        // Generate unique ID and encode it as Base64
        long id = idGenerator.getAndIncrement();
        String encodedString = encodeBase62(id);
        // Create a new UrlEntry and store it in both maps
        URLEntry entry = new URLEntry(id, longURL, encodedString);

        longUrlToEntry.put(longURL, entry);
        shortUrlToEntry.put(encodedString, entry);

        return BASE_DOMAIN + encodedString;
    }

    // Method to retrieve the long URL from a short URL
    public String getLongURL(String shortURL) {
        String encodedString = shortURL.substring(shortURL.lastIndexOf("/") + 1);
        if (shortUrlToEntry.containsKey(encodedString)) {
            return shortUrlToEntry.get(encodedString).getLongURL();
        } else {
            return "Short URL not found";
        }
    }

    // Method to encode the unique ID using Base64
    private String encodeBase62(long id) {
        StringBuilder sb = new StringBuilder();
        do {
            int rem = (int) (id % 62);
            sb.append(BASE62.charAt(rem));
            id = id / 62;
        } while (id > 0);
        return sb.reverse().toString();
    }

    // Method to decode Base64 to get the original ID (not needed in this case but
    // can be helpful for future use)
    private long deecodeBase62(String encodedString) {
        long id = 0;
        for (int i = 0; i < encodedString.length(); i++) {
            id = id * 62 + BASE62.indexOf(encodedString.charAt(i));
        }
        return id;
    }
}
