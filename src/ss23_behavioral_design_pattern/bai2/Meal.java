package ss23_behavioral_design_pattern.bai2;

//template method pattern
public abstract class Meal {
    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();
    public abstract void cook();

    public void eat() {
        System.out.println("Mmm, that's good!");
    }

    public abstract void cleanUp();
}
