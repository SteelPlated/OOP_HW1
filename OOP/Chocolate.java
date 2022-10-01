package OOP;

public class Chocolate extends Product{
    
    private String taste;

    public Chocolate(String name, Double cost, String taste){
        super(name, cost);
        this.taste=taste;
    }
    @Override
    public String toString() {
        return this.getName()+ ", стоимость: "+this.getCost()+ ", вкусы: "+this.taste;
    }
    
}