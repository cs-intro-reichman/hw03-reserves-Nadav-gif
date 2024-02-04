public class UniqueChars {
    public static void main(String[] args) {
        String s = args[0];
        String new_s = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = new_s.indexOf(c);
            if (c == ' ') {
                new_s = new_s + ' ';
                continue;
            }
            if (n == -1) {
                new_s = new_s + s.charAt(i);
            }
        }
        System.out.println(new_s);
    }
}
