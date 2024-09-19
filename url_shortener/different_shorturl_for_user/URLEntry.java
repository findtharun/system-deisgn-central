package different_shorturl_for_user;

public class URLEntry {
    private long id;
    private String shortUrl;
    private String longUrl;
    private String userId;

    public URLEntry(long id, String shortUrl, String longUrl, String userId) {
        this.id = id;
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public String getUserId() {
        return userId;
    }
}
