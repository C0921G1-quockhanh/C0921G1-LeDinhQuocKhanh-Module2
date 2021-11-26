package ss21_creational_design_pattern.thuc_hanh.bai1;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("Wolf");
        System.out.println("The sound of animal 1 is " + animal1.makeSound());

        Animal animal2 = animalFactory.getAnimal("Meow");
        System.out.println("The sound of animal 2 is " + animal2.makeSound());
    }
}
