package task.five;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/6/4 11:26
 * @注释
 */
public class Main {

    public static void main(String[] args) {
//        testInsert();
//        testQuery();

//        testDelete();
//        testQuery();

//        testQueryById();

//        testUpdate();
//        testQuery();
    }

    public static void testInsert() {
        Student studentA = new Student("s001","老大","计算机学院",20);
        Student studentB = new Student("s002","老二","计算机学院",19);
        Student studentC = new Student("s003","老三","计算机学院",18);
        Student studentD = new Student("s004","老四","计算机学院",17);
        StudentDao sd = new StudentDao();

        try {
            sd.insertStudent(studentA);
            sd.insertStudent(studentB);
            sd.insertStudent(studentC);
            sd.insertStudent(studentD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void testQuery() {
        StudentDao sd = new StudentDao();
        try {
            for (Student student : sd.queryAll()) {
                System.out.println(student);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void testDelete() {
        StudentDao sd = new StudentDao();
        try {
            sd.deleteStudentById("s004");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void testQueryById() {
        StudentDao sd = new StudentDao();
        try {

            System.out.println(sd.selectStudentById("s003"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void testUpdate() {
        StudentDao sd  = new StudentDao();
        try {
            sd.updateStudentById("s001");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
