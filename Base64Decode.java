class Base64Decode {
    private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String decode(String s) {

        // remove/ignore any characters not in the base64 characters list
        // or the pad character -- particularly newlines
        s = s.replaceAll("[^" + base64chars + "=]", "");
