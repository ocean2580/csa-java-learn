package task.five;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/6/4 11:20
 * @注释
 */
public class Student {
    private String SNO;
    private String name;
    private String college;
    private int age;

    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SNO='" + SNO + '\'' +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String SNO, String name, String college, int age) {
        this.SNO = SNO;
        this.name = name;
        this.college = college;
        this.age = age;
    }

    public Student() {
    }
}
