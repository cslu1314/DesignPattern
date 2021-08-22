package String_;

public class LastStringlen {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
        System.out.println("=========================");
        String s1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s1));
        System.out.println("===================");
        String s2 = "  ";
        System.out.println(lengthOfLastWord(s2));
        System.out.println("=========================");
        String s3 = "";
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}
