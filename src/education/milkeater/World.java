package education.milkeater;

public class World {
    public static void main(String... args) {
        MilkEater[] milkEaters = {
                new Human(10, 11, 29, 100, 100, "Dimasik"),
                new Bear(100, 15, 10, 150, 10, "Grizlik"),
                new Monkey(7, 6, 3, 9, 11, "Chikchik")
        };
        Food[] foods = {
                new Milk(),
                new Pizza(),
                new Fish(),
                new Banan(),
        };
        for (MilkEater milkEater : milkEaters) {
            print(milkEater);
            for (Food food : foods) {
                execute(milkEater, food);
            }
        }
    }

    public static void execute(MilkEater milkEater, Food food) {
        milkEater.eat(food);
        print(milkEater.poop());
    }

    public static void print(PrintDataProvider printDataProvider) {
        System.out.println(printDataProvider.getPrintData());
    }


}
