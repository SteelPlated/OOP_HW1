package OOP;

public class BotlleOfTea extends Product{
    private Double volume;

    public BotlleOfTea(String name, Double cost,Double volume){
        super(name, cost); 
        this.volume=volume;
    }
    @Override
    public String toString() {
        return this.getName()+ ", стоимость: "+this.getCost()+ ", обьем: "+this.volume;
    }
}
