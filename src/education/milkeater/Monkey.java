package education.milkeater;

public class Monkey extends MilkEater {
    public Monkey(float weight, float height, int age, int hp, int mana, String name) {
        super(weight, height, age, hp, mana, name);
        System.out.println("Monkey created");

    }

    @Override
    protected boolean isGoodFood(Food food) {
        return super.isGoodFood(food) || food instanceof Banan;
    }
}
