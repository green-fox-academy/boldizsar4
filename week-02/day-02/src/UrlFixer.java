public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("ots", "odds");

        url = (new StringBuilder(url)).insert(5, ":").toString();
        System.out.println(url);
    }
}
