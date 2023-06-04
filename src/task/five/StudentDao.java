package task.five;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/6/4 11:25
 * @注释
 */
public class StudentDao {

    public void insertStudent(Student student) throws Exception {
        Connection conn = DBUtil.connectDB();
        String sql = "INSERT INTO student(SNO, name, age, college) "
                + " VALUES(?, ?, ?, ?)";

        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1,student.getSNO());
        p.setString(2,student.getName());
        p.setInt(3,student.getAge());
        p.setString(4,student.getCollege());

        p.execute();
    }

    public List<Student> queryAll() throws Exception {
        Connection conn = DBUtil.connectDB();
        String sql = "Select * from student";
        List<Student> list = new ArrayList<>();

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            Student s =
                    new Student(rs.getString("SNO"), rs.getString("name"), rs.getString("college"), rs.getInt("age"));

            list.add(s);
        }

        return list;
    }

    public void deleteStudentById(String id) throws Exception {
        Connection con = DBUtil.connectDB();
        String sql = "Delete from student where SNO = ?";

        PreparedStatement p =  con.prepareStatement(sql);
        p.setString(1,id);

        p.execute();
    }

    public Student selectStudentById(String id) throws Exception {
        Connection con = DBUtil.connectDB();
        String sql = "select * from student where SNO = ?";
        PreparedStatement p =  con.prepareStatement(sql);
        p.setString(1,id);
        ResultSet rs = p.executeQuery();
        Student s = null;
        while (rs.next()) {
             s = new Student(rs.getString("SNO"), rs.getString("name"), rs.getString("college"), rs.getInt("age"));
        }
        return s;
    }

    public void updateStudentById(String id) throws Exception{
        Connection con = DBUtil.connectDB();
        String sql = "update student set college = '通信学院' where SNO = ?";
        PreparedStatement p =  con.prepareStatement(sql);
        p.setString(1,id);
        p.execute();
    }
}
