//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Pizza cost: " + pizza.cost());
    }
}