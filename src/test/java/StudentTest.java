import org.junit.jupiter.api.*;
import student.com.Student;

public class StudentTest {
    private Student student;

    @BeforeAll
    static void printStart() {
        System.out.println("Starting Student tests...");
    }

    @AfterAll
    static void printComplete() {
        System.out.println("Tests complete");
    }

    @DisplayName("Testing create student with valid args method")
    @Test
    void testCreateStudentWithValidArgs() {
        Assertions.assertDoesNotThrow(() -> {
            new Student("Daniel", "dan@email.com");
        });
    }

    @DisplayName("Testing create student with invalid args method")
    @Test
    void testCreateStudentWithInvalidArgs() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student("", "");
        });
    }

    @DisplayName("Testing create student with invalid name method")
    @Test
    void testCreateStudentWithInvalidName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student("", "dan@email.com");
        });
    }

    @DisplayName("Testing create student with invalid args method")
    @Test
    void testCreateStudentWithInvalidEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Student("Daniel", "");
        });
    }
}
