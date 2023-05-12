package task.three.employee;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/12 19:07
 * @注释
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    abstract void earnings();

    @Override
    public String toString() {
        return "name:" + this.name +
                ", number: " + this.number +
                ", birthday:" + this.birthday;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return
                "year=" + year +
                ", month=" + month +
                ", day=" + day;
    }
}