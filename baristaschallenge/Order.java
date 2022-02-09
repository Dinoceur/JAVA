import java.util.ArrayList;

public class Order {
    private String name; 
    private boolean ready; 
    private ArrayList<Item> items; 


    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(ready){
            return "your order is ready.";
        } else {
            return "thank you for waiting. your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for(int i = 0; i < getItems().size(); i++){
            total += getItems().get(i).getItemPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + getName());
        for(int i = 0; i < getItems().size(); i++){
            System.out.println(getItems().get(i).getItemName() + " - $" + getItems().get(i).getItemPrice());
        }
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }


    public boolean getIsReady(){
        return ready;
    }


    public void setIsReady(boolean ready){
        this.ready = ready;
    }


    public ArrayList<Item> getItems(){
        return items;
    }


    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}