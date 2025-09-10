package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("BMW");
        cart.add("Audi");
        cart.add(1, "포카칩");
        cart.add(2, "꼬북칩");
        System.out.println(cart.get(0));
        cart.remove(1);
        System.out.println(cart.size());
        System.out.println(cart.isEmpty());
    }
}
