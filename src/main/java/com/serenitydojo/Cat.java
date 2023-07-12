package com.serenitydojo;

public class Cat {

    private String name;
    private String favouriteFood;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }

    public Cat(String name, String favouriteFood, int age) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.favouriteFood = usualFood();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " clean his fur");
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");
    }
}
