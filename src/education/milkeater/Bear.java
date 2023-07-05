package education.milkeater;

public class Bear extends MilkEater {

    public Bear(float weight, float height, int age, int hp, int mana, String name) {
        super(weight, height, age, hp, mana, name);

        System.out.println("Bear created");

    }

    @Override
    protected boolean isGoodFood(Food food) {
        return super.isGoodFood(food) || food instanceof Fish;
    }
}
