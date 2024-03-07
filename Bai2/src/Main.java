public class Main {

    public static boolean isValidURL(String url) {
        return url.matches("^(https?://)?(www\\.)?([a-z0-9]+)\\.(.[a-z]{2,6})(.*)$");
    }

    public static void main(String[] args) {
        String url1 = "https://tiki.com.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        String url2 = "http://www.google.com";
        String url3 = "invalidurl";

        System.out.println(url1 + " - " + isValidURL(url1));
        System.out.println(url2 + " - " + isValidURL(url2));
        System.out.println(url3 + " - " + isValidURL(url3));
    }
}
