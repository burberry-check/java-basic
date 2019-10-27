package study.burberrycheck.oop;

import study.burberrycheck.oop.abstact.Order;

public class Main {
    public static void main(String[] args) {
        Order abstactOrder = new Order();
        abstactOrder.cancel(true);

        study.burberrycheck.oop.noabstact.v3.Order v3Order = new study.burberrycheck.oop.noabstact.v3.Order();
        v3Order.cancel(true);
    }
}
