/* Daniel Fitzgerald 27/02/2020
* Group A
* Lab Eam
*
* Student class for creating student objects with the fields: name and email
* */
package student.com;

public class Student {

    private String name;
    private String email;

    public Student(String name, String email) {
        if (name.equalsIgnoreCase("")) {
            throw new IllegalArgumentException();
        } else if (email.equalsIgnoreCase("")) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
