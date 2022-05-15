class Base64Encode {
    private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String encode(String s) {

        
        String r = "", p = "";
        int c = s.length() % 3;
