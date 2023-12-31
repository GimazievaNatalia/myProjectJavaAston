package org.example.gimazieva;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat("Барсик", false, 8);
        //создание массива котов
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Рыжик", false, 22);
        catArray[1] = new Cat("Мурзик", false, 5);
        catArray[2] = new Cat("Зевс", false, 3);



        dog.run(200);
        dog.swim(30);
        cat.run(1000);
        cat.swim(100);
        for (Cat kote : catArray) {
            cat.eatBoul();
        }
        cat.eatBoul();
        cat.addFood();
    }

}



//public void eatFromBowl(int foodAmount) {
//        // Кот ест из миски, уровень голода уменьшается
//        if (foodAmount > 0) {
//            hungerLevel--;
//            System.out.println(name + " поел из миски.");
//        } else {
//            System.out.println(name + " не смог поесть из пустой миски.");
//        }
//    }
//
//    public int getHungerLevel() {
//        return hungerLevel;
//    }
//}
//
//public class CatFeedingSimulation {
//    public static final int BOWL_INITIAL_FOOD_AMOUNT = 10;
//
//    public static void main(String[] args) {
//        // Создаем котов
//        Cat[] cats = {
//                new Cat("Barsik", 5),
//                new Cat("Murzik", 5),
//                new Cat("Tom", 5)
//        };
//
//        // Количество еды в миске
//        int bowlFoodAmount = BOWL_INITIAL_FOOD_AMOUNT;
//
//        // Каждый кот пытается поесть из миски
//        for (Cat cat : cats) {
//            cat.eatFromBowl(bowlFoodAmount);
//        }
//
//        // Выводим информацию о сытости каждого кота
//        for (Cat cat : cats) {
//            System.out.println(cat.getHungerLevel());
//        }
//    }
