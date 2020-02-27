import org.junit.jupiter.api.*;
import student.com.Student;
import student.com.StudentList;

public class StudentListTest {
    private StudentList studentList;
    private Student student;

    @BeforeAll
    static void printStart() {
        System.out.println("Starting StudentList tests...");
    }

    @AfterAll
    static void printComplete() {
        System.out.println("Tests complete");
    }

    @BeforeEach
    void setup() {
        studentList = new StudentList();
        student = new Student("Daniel", "dan@email.com");
    }

    @DisplayName("Testing add student method")
    @Test
    void testAddStudentToStudentList() {
        studentList.addStudent(student);
        Assertions.assertTrue(studentList.getStudentList().contains(student));
    }

    @DisplayName("Testing search student method")
    @Test
    void testSearchStudentInStudentList() {
        studentList.addStudent(student);
        Assertions.assertEquals(student, studentList.searchStudent("Daniel"));
    }

    @DisplayName("Testing search student method")
    @Test
    void testSearchStudentInStudentListNotFound() {
        Assertions.assertNull(studentList.searchStudent("Daniel"));
    }
}
