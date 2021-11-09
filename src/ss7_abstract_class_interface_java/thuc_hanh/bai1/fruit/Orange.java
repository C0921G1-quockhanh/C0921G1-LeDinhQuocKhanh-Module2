package ss7_abstract_class_interface_java.thuc_hanh.bai1.fruit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "orange could be juiced!";
    }
}
