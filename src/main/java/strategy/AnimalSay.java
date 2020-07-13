package strategy;

public class AnimalSay {

    Animal animal;

    public AnimalSay(Animal animal) {
        this.animal = animal;
    }

    public void say() {
        this.animal.say();
    }

    public static void doTheJob(String animalType) {
        Animal animalObject = null;
        switch (animalType) {
            case "dog":
                animalObject = new Dog();
                break;
            case "cat":
                animalObject = new Cat();
                break;
            default:
                System.out.println("Your choice is wrong");
                break;
        }
        animalObject.say();
    }



    public static void main(String[] args) throws Exception {
      doTheJob("cat");

    }
}
