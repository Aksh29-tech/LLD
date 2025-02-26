//interface RestaurantEmployee {
//    void washDishes();
//    void serveCustomers();
//    void cookFood();
//}
//class waiter implements RestaurantEmployee {
//    @Override
//    public void washDishes() {
//        //not my job
//    }
//    @Override
//    public void serveCustomers() {
//        //yes and here is my implementation
//        System.out.println("Serving the customer");
//    }
//    @Override
//    public void cookFood() {
//        //not my job
//    }
//}

//here client (waiter) is unnecessarily implementing the unwanted functions. so we can split interfaces in smaller part
//to avoid this.

interface WaiterInterface {
    void serveCustomer();
    void takeOrder();
}
interface ChefInterface {
    void cookFood();
    void decideMenu();
}

class waiter implements WaiterInterface {
    @Override
    public void serveCustomer() {
        System.out.println("Serving the customer");
    }
    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }
}
public class InterfaceSegmentedPrinciple {
    public static void main(String[] args) {

    }
}
