public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coldbrewPrice = 4.25;
        double frapaccinoPrice = 3.75;
        double hotchocolatePrice = 2.85;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri, your order will be ready shortly "
        System.out.println(generalGreeting + customer2 + pendingMessage);
        System.out.println(generalGreeting + customer3 + pendingMessage);
        System.out.println(generalGreeting + customer4 + pendingMessage);
    	// ** Your customer interaction print statements will go here ** //

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + coldbrewPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(customer2 + displayTotalMessage + (mochaPrice * 2));
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (frapaccinoPrice - hotchocolatePrice));
    }
}