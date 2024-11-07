package generics;

public class BagListExample {
    public static void main(String[] args) {
        BagList<String> bag = new BagList<>();
        bag.addItem("Apple");
        bag.addItem("Lemon");
        bag.addItem("Cucumber");
        bag.removeItem("Apple");

        BagList<Integer> bag2 = new BagList<>();
        bag2.addItem(2);
        bag2.addItem(3);
        bag2.addItem(4);
        bag2.removeItem(3);
    }
}
