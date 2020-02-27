package student.com;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student searchStudent(String studentName) {
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(studentName)) {
                return student;
            }
        }

        return null;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
