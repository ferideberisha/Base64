class Base64Decode {
    private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String decode(String s) {
        
        s = s.replaceAll("[^" + base64chars + "=]", "");
 
        String p = (s.charAt(s.length() - 1) == '=' ?
                (s.charAt(s.length() - 2) == '=' ? "AA" : "A") : "");
        String r = "";
        s = s.substring(0, s.length() - p.length()) + p;

      
        for (int c = 0; c < s.length(); c += 4) {
           
            int n = (base64chars.indexOf(s.charAt(c)) << 18)
                    + (base64chars.indexOf(s.charAt(c + 1)) << 12)
                    + (base64chars.indexOf(s.charAt(c + 2)) << 6)
                    + base64chars.indexOf(s.charAt(c + 3));

           
            r += "" + (char) ((n >>> 16) & 0xFF) + (char) ((n >>> 8) & 0xFF)
                    + (char) (n & 0xFF);
        }

       
        return r.substring(0, r.length() - p.length());
    }
}       
