package ss11_stack_queue_java.bai_tap.bai2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;


public class ClientAgeComparator {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Person("Khanh","male",2,9,1997);
        people[1] = new Person("Hung", "male", 13,1,1997);
        people[2] = new Person("Van", "female", 21,2,1999);
        people[3] = new Person("Diep", "female", 18,1,1970);
        people[4] = new Person("Vong", "male", 1,11,1964);
        people[5] = new Person("Huyen", "female", 16,2,1996);
        people[6] = new Person("Lam", "female", 8,8,1995);
        people[7] = new Person("Nhi", "female", 21,9,2002);
        people[8] = new Person("Tung", "male", 2,2,1999);
        people[9] = new Person("Hieu", "male", 15,7,1994);

        System.out.println("Pre-sorted: ");
        for (Person person: people) {
            System.out.println(person);
        }

        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(people,ageComparator);

        System.out.println("After-sorted: ");
        for (Person person: people) {
            System.out.println(person);
        }

        //Break line
        System.out.println();
        System.out.println();

        //Put the elements on the corresponding queue
        Queue<Person> female = new ArrayDeque<>();
        Queue<Person> male = new ArrayDeque<>();

        for (Person person: people) {
            if (person.getSex().equals("female")) {
                female.add(person);
            } else if (person.getSex().equals("male")) {
                male.add(person);
            }
        }

        //Count male elements
        int countMale = 0;
        for (Person person: people) {
            if (person.getSex().equals("male")) {
                countMale += 1;
            }
        }

        //Add male into female queue
        Person maleElement;
        for (int i = 0; i < countMale; i++) {
            maleElement = male.remove();
            female.add(maleElement);
        }

        //Display final queue
        for (int i = 0; i < people.length; i++) {
            System.out.println(female.remove());
        }
    }
}
