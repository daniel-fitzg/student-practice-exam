/* Daniel Fitzgerald 27/02/2020
 * Group A
 * Lab Eam
 *
 * StudentList class for creating and modifying and List of student objects
 * */

package student.com;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList;

    // Test comment

    public StudentList() {
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Search the list of students for an entry using a student name
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
