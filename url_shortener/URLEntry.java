

public class URLEntry {
    private long id;
    private String longURL;
    private String encodedString;

    public URLEntry(long id, String longURL, String encodedString) {
        this.id = id;
        this.longURL = longURL;
        this.encodedString = encodedString;
    }

    public long getId() {
        return id;
    }

    public String getLongURL() {
        return longURL;
    }

    public String getEncodedString() {
        return encodedString;
    }
}
