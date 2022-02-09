import java.util.ArrayList;

public class TestOrdersAndItems {
    public static void main(String[] args){


        Order order1 = new Order();
        Order order2 = new Order("Dianne");
        Order order3 = new Order("Austin");
        Order order4 = new Order("Aileen");
        Order order5 = new Order("Sunny");
        Order order6 = new Order("Lou");

        Item item1 = new Item("mocha", 5.5);
        Item item2 = new Item("latte", 4.5);
        Item item3 = new Item("drip coffee", 3.5);
        Item item4 = new Item("capuccino", 5.5);

        order1.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item1);
        order4.addItem(item1);
        order5.addItem(item2);
        order6.addItem(item4);

        order1.setIsReady(true);
        order2.setIsReady(false);
        order3.setIsReady(true);
        order4.setIsReady(false);
        order5.setIsReady(true);
        order6.setIsReady(false);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());
        System.out.println(order6.getStatusMessage());


        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());
        System.out.println(order6.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        order6.display();
    }
}