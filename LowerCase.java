public class LowerCase {
    public static void main(String[] args) {
        String s = args[0];
        String new_s = "";
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                new_s = new_s + (char)(s.charAt(i) + 32);
            } else {
                new_s = new_s + (char)(s.charAt(i));
            }
        }
        System.out.println(new_s);
    }
}
