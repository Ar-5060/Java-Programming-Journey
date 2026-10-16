public class Method {
    static void change(int a) {
        a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
}
