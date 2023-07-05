package education.milkeater;

public class Human extends MilkEater {
    public Human(float weight, float height, int age, int hp, int mana, String name) {
        super(weight, height, age, hp, mana, name);
        System.out.println("Human created");


    }

    @Override
    protected boolean isGoodFood(Food food) {

        return super.isGoodFood(food) || food instanceof Pizza;
    }
}
