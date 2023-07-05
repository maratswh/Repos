package education.milkeater;

public abstract class Food {
    private String name;
    private int weight;




    public Food(String name,int weight){
        this.name=name;
        this.weight=weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
}
