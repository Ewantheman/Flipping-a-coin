package UI;

import Model.coin;

public class main {
    public static void main(String[] args) {
        coin test = new coin("Tails");
        test.flip();
        System.out.println(test.checkstate());
    }
}

