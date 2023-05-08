import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class StudentTest {

    public Student student;


    @Before

    public void setUp() {
        this.student = new Student("Andrew", 900338310, null);


    }


    @Test

    public void testConstructor() {
        assertNotNull(student.getName());
        assertNotNull(student.getId());
        assertNotNull(student.getGrades());


    }


    @Test

    public void testAddGrade() {
        student.addGrade(80);
        assertNotNull(student.getGrades().get(0));


    }


    // Write the test
    // Write the code in Student.java


}




