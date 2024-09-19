public class Main {
    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();

        // Shorten a URL
        String shortURL = urlShortener.shortenURL("https://www.example.com/long-url-1");
        System.out.println("Short URL: " + shortURL);

        // Retrieve the original URL using the short URL
        String longURL = urlShortener.getLongURL(shortURL);
        System.out.println("Original URL: " + longURL);
    }
}
