package OOP;
public class Product{
    private String name;
    private Double cost;

    public Product(String name,Double cost){
        this.cost=cost;
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public Double getCost(){
        return cost;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCost(Double cost){
        this.cost=cost;
    }

    @Override
    public String toString() {
        return name+ ", стоимость: "+cost;
    }
    
}