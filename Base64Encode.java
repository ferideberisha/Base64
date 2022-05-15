class Base64Encode {
    private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String encode(String s) {

        
        String r = "", p = "";
        int c = s.length() % 3;
        if (c > 0) {
            for (; c < 3; c++) {
                p += "=";
                s += "\0";
            }
        }
        for (c = 0; c < s.length(); c += 3) {

            if (c > 0 && (c / 3 * 4) % 76 == 0)
                r += "\r\n";

            int n = (s.charAt(c) << 16) + (s.charAt(c + 1) << 8)
                    + (s.charAt(c + 2));

            int n1 = (n >> 18) & 63, n2 = (n >> 12) & 63, n3 = (n >> 6) & 63, n4 = n & 63;

            r += "" + base64chars.charAt(n1) + base64chars.charAt(n2)
                    + base64chars.charAt(n3) + base64chars.charAt(n4);
        }

        return r.substring(0, r.length() - p.length()) + p;
    }
}
