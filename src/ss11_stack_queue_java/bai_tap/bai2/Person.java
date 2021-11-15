package ss11_stack_queue_java.bai_tap.bai2;

public class Person {
    private String name;
    private String sex;
    private int day;
    private int month;
    private int year;

    public Person(String name, String sex, int day, int month, int year) {
        this.name = name;
        this.sex = sex;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", sex: " + this.sex + " and date of birth: " + this.day + " / " + this.month + " / " + this.year;
    }
}
