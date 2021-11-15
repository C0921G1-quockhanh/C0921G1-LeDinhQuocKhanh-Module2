package ss11_stack_queue_java.bai_tap.bai2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        //Compare Year
        if (p1.getYear() > p2.getYear())
            return 1;
        if (p1.getYear() < p2.getYear())
            return -1;

        //Compare Month
        if (p1.getMonth() > p2.getMonth())
            return 1;
        if (p1.getMonth() < p2.getMonth())
            return -1;

        //Compare Day
        if (p1.getDay() > p2.getDay())
            return 1;
        if (p1.getDay() < p2.getDay())
            return -1;
        return 0;
    }
}
