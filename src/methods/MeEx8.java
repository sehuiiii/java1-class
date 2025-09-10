package methods;

public class MeEx8 {
    public static void main(String[] args) {
        print("Hello world", 3);
        print("짱구보단", 5);
        print("맹구!", 7);
    }

    public static void print(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
