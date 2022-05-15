import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type string to encode: ");
        String toencode = input.nextLine();

        Base64Encode b64e = new Base64Encode();
        String s = b64e.encode(toencode);
        System.out.print("Encoded string: ");
        System.out.println(s);

        Base64Decode b64d = new Base64Decode();
        String d = b64d.decode(s);
        System.out.print("Decoded string: ");
        System.out.println(d);

    }
}
