package company22;

public class Main {

    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.println(a + " ");
        System.out.println(b + " ");
        for (int i = 3; i <= 11; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

        // write your code here
    }
}
