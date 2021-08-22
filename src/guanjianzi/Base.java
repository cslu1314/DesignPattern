package guanjianzi;

public final class Base {
    public int i = 1;
    protected String a = "11";
    long b = 1L;
    private double c = 3;

    public static void main(String[] args) {
//        String a = "ab";
//        String b = "cd";
//        String c = "abcd";
//        String d = a + b;
//        String e = "fd"; String f = e;
//        System.out.println(f == e);
//        System.out.println(f.hashCode());
//        System.out.println(e.hashCode());
//        e = e + "f";
//        System.out.println(e.hashCode());
//        System.out.println(f == e);
//        System.out.println(d == c);

        String str = null;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb.toString());
        sb.append("hello");
        System.out.println(sb.toString());
//        System.out.println(sb.length());
    }
}
