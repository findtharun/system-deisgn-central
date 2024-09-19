package different_shorturl_for_user;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class Pair{
    String LongUrl;
    String ShortUrl;

    Pair(String LongUrl, String ShortUrl){
        this.LongUrl = LongUrl;
        this.ShortUrl = ShortUrl;
    }
}
public class URLShortener {
    private Map<Long, URLEntry> idToURLEntry = new HashMap<>();
    private Map<String, Pair> userMap = new HashMap<>();
    private AtomicLong idGenerator = new AtomicLong(1); // Generates unique IDs for URLs
    private static final String BASE_DOMAIN = "https://short.url/";

    /**
     * If Long Url Does not Exist in User Mapping, We Call Shorten Url Service
     * We Generate ID and Store in Table
     * If we get Short Url, Decode and then Fetch Long Url based on ID from Databse
     */
   
}
