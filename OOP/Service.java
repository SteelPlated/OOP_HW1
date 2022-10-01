package OOP;

public class Service {
    public static void main(String[]args){
        VendingMachine vm=new VendingMachine();
        System.out.println(vm.getProductByName("Doshirac"));
        System.out.println(vm.getProductByName("snickers"));
        System.out.println(vm.getBotlleOfTea("aqua", 10.0, 0.5));
        System.out.println(vm.getCookieeeee("nyam", 10.0, 0.25));
        System.out.println(vm.getChocolate("Mr.Brown", 10.0, "srawberry"));



    }
}
