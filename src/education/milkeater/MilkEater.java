package education.milkeater;

public class MilkEater implements PrintDataProvider{
    private float weight, height;
    private int age, hp, mana;
    private String name;

    private Poop poop;

    public void eat(Food food) {
        if (isGoodFood(food)) {
            onGoodFood(food);
        } else {
            onBadFood(food);
        }

    }

    protected boolean isGoodFood(Food food){
        return food instanceof Milk;
    }

    public Poop poop() {
        Poop result = this.poop;
        this.poop = null;
        return result;
    }

    public void walk() {
    }


    public MilkEater() {
    }



    public MilkEater(float weight, float height, int age, int hp, int mana, String name) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.hp = hp;
        this.mana = mana;
        this.name = name;
    }

    public void onGoodFood(Food food) {
        this.poop = new Poop("malina", food.getWeight() / 2, false);
        this.hp += food.getWeight() + 3;
    }

    public void onBadFood(Food food) {
        this.poop = new Poop("govna", food.getWeight(), true);
        this.hp = food.getWeight() - 2;
    }

    @Override
    public String getPrintData() {
        return weight + "-Вес " + height + "-Рост " + age + "-Возраст " + hp + "-Здоровье " + mana + "-Сила " + name + "a";
    }
}
