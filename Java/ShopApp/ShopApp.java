import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

public class ShopApp {
    public static void main (String[] args)  {
        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("Pinky", 5);
        System.out.println("Customer name is " + c1.name);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing[] items={item1, item2, item3, item4};
        c1.addItems(items);
        for (Clothing i:items){
            System.out.println("item "+i);
        }
        System.out.println("Total of your purchase is "+c1.getTotalClothingCost());
        System.out.println(c1.getSize());
        
        c1.boughtItems();
        
        System.out.println("El precio mínimo de un producto es "+ Clothing.minP);
        
        // Ejercicio 7.1
        
        double average=20;
        int cant=0;
        
        for (Clothing i:c1.getItems()){
            if (i.size.equals("L")){
                    average=average+i.getPrice();
                    cant++;
            }
        }
        try {
            average=(int)average/cant;
            System.out.println("Total average price is "+average);
        }
        catch(ArithmeticException e){
            System.out.println("No existen prendas de talla L");
        }

        Arrays.sort(c1.getItems());
        for (Clothing i:items){
            System.out.println("item "+i);
        }

        ItemList list = new ItemList(items);
        Routing routing = Routing.builder().get("/items", list).build();
        ServerConfiguration config = ServerConfiguration.builder().port(8888).build();
        WebServer ws=WebServer.create(config, routing);
        ws.start();
        

    }   
}
