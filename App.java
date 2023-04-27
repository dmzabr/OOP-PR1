import Products.HotDrink;
import Products.Product;
import Products.BottleOfWater;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(new Product("Cola",88.0));
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachin.addProduct(new HotDrink("Espresso", 120.0, 80));
        itemMachin.addProduct(new HotDrink("Capuccino", 250.0, 65));


        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
    }
}
