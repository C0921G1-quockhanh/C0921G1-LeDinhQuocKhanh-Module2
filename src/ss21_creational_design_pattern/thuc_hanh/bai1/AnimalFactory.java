package ss21_creational_design_pattern.thuc_hanh.bai1;

public class AnimalFactory {
    public Animal getAnimal(String sound) {
        if ("Wolf".equals(sound))
            return new Dog();
        else
            return new Cat();
    }
}
