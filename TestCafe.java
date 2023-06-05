import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();
        
        // Testing getStreakGoal()
        System.out.println("Purchases needed by week 10: " + cafeUtil.getStreakGoal());
        
        // Testing getOrderTotal()
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.println("Order total: $" + cafeUtil.getOrderTotal(lineItems));
        
        // Testing displayMenu()
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafeUtil.displayMenu(menu);
        
        // Testing addCustomer()
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            cafeUtil.addCustomer(customers);
            System.out.println();
        }
        
        // Testing printPriceChart()
        cafeUtil.printPriceChart("Columbian Coffee Grounds", 15.0, 3);
        
        // Testing overloaded displayMenu()
        ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(1.50, 3.50, 4.50, 3.50));
        boolean success = cafeUtil.displayMenu(menu, prices);
        System.out.println("Menu displayed successfully: " + success);
    }
}
