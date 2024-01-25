package com.green.day83;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGBoxList = new FruitBox();
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitGBoxList);
        System.out.println("j1: " + j1);

        FruitBox<Apple> appleGBoxList = new FruitBox();
        appleGBoxList.add(new Apple());
        appleGBoxList.add(new Apple());

        Juice j3 = Juicer.makeJuice(appleGBoxList);
        System.out.println("j3: " + j3);

        /*
        FruitBox<Toy> toyGBoxList = new FruitBox();
        toyGBoxList.add(new Toy());
        toyGBoxList.add(new Toy());
        */
        //Juice j2 = Juicer.makeJuice(toyGBoxList);
    }
}

class Juice {
    private String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return this.name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String temp = "";
        for(Fruit f : box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}