/*package OOP;

public class VendingMachine {
    public static void main(String[]args){
        Product p = new Product("Doshirac",40.0);
        Product p1 = new Product("snickers",30.0);
        p.setName("twix");
        System.out.println(p.getName());
        System.out.println(p1.getName());
    }
}*/

package OOP;

import java.util.ArrayList;

public class VendingMachine {
    
    public VendingMachine (){
        products.add (new Product("Doshirac",40.0));
        products.add (new Product("snickers",30.0));
    }

    public Product getProductByName(String name){
        for (Product product : products) {
            if(product.getName().equals(name))return product;
        }
        return null;
    }
    public Product getProductByCost(Double cost){
        for (Product product : products) {
            if(product.getCost().equals(cost))return product;
        }
        return null;
    }

    public BotlleOfTea getBotlleOfTea(String name, Double cost,Double volume){
        return new BotlleOfTea(name,cost,volume);
    }
    public Chocolate getChocolate(String name, Double cost, String taste){
        return new Chocolate(name,cost, taste);
    }
    public Cookieeeee getCookieeeee(String name, Double cost, Double weight){
        return new Cookieeeee(name,cost, weight);
    }


    public Product getProductByCost(String string_cost){
        for (Product product : products) {
            if(product.getCost().equals(Double.valueOf(string_cost)))
                return product;
        }
        return null;
    }

    ArrayList<Product> products =new ArrayList<>();
}
