

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class URLShortener {

    private AtomicLong idGenerator = new AtomicLong(1); // Generates unique IDs for URLs
    private static final String BASE_DOMAIN = "https://short.url/";

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
        String encodedString = encodeBase64(id);
        // Create a new UrlEntry and store it in both maps
        URLEntry entry = new URLEntry(id, longURL, encodeBase64(id));
        
        longUrlToEntry.put(longURL, entry);
        shortUrlToEntry.put(encodedString, entry);

        return  BASE_DOMAIN + encodedString;
    }

    // Method to retrieve the long URL from a short URL
    public String getLongURL(String shortURL) {
        String encodedString = shortURL.substring(shortURL.lastIndexOf("/")+1);
        if (shortUrlToEntry.containsKey(encodedString)) {
            return shortUrlToEntry.get(encodedString).getLongURL();
        } else {
            return "Short URL not found";
        }
    }

    // Method to encode the unique ID using Base64
    private String encodeBase64(long id) {
        return Base64.getUrlEncoder().encodeToString(String.valueOf(id).getBytes());
    }

    // Method to decode Base64 to get the original ID (not needed in this case but
    // can be helpful for future use)
    private long decodeBase64(String encodedString) {
        String decodedString = new String(Base64.getUrlDecoder().decode(encodedString));
        return Long.parseLong(decodedString);
    }

}
