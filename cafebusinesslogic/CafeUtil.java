import java.util.ArrayList;

class CafeUtil {

    int getStreakGoal() {
        int[] weeks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : weeks){
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[] prices){
        double sum = 0;
        for (double i : prices) {
            sum += i;
        }
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems){
        int i = 0;
        for (String item : menuItems){
            System.out.println(i + "" + item);
            i++;
        }
    }

    ArrayList<String> addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello " + userName);
        System.out.println("There are " + (customers.size()-1) + " people in front of you");
        return customers;
    }

}
