package OOP;

public class Cookieeeee extends Product{
    
    private Double weight;

    public Cookieeeee(String name, Double cost, Double weight){
        super(name, cost); 
        this.weight=weight;
    }
    @Override
    public String toString() {
        return this.getName()+ ", стоимость: "+this.getCost()+ ", вес: "+this.weight;
    }
    
}