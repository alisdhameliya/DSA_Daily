public class _q4_type {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'z';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9945;

        System.out.println(((Object)((f * b) + (i % c) - (d * s))).getClass().getSimpleName());
        // System.out.println(((f * b) + (i % c) - (d * s)));
        char c2 = (char)(i % c);
        System.out.println(c2);
    }
}
