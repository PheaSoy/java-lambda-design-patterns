package strategy;

import java.util.function.Function;

public class AnimalSayLambdaStyle {
    Animal animal;

    public AnimalSayLambdaStyle(Animal animal) {
        this.animal = animal;
    }

    public void say() {
        this.animal.say();
    }

    public static void main(String[] args) throws Exception {
        Function<String, Animal> dog = (a) -> {
            if (a.equals("dog")) return new Dog();
            else return new Cat();
        };
        dog.apply("cat").say();

        Function<String,Animal> trySortFunctionStyle = (a) -> {return new Dog();};
        trySortFunctionStyle.apply("dog").say();
    }
}
