import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CohortTest {

    public Student student;

    public Cohort cohort;


    @Before

    public void setUp() {

        this.student = new Student("Andrew", 90033);
        this.cohort = new Cohort();


    }


    @Test

    public void testaddStudent() {

        cohort.addStudent(student);
        assertNotNull(cohort.getStudents().get(0));


    }

    @Test

    public void testGetStudents() {
        cohort.getStudents();
        assertNotNull(cohort.getStudents());

    }

    @Test

    public void testGetAverage() {

        Student student1 = new Student("Mary", 12345);
        Student student2 = new Student("John", 89080);

        student1.addGrade(20);
        student2.addGrade(30);
        cohort.addStudent(student1);
        cohort.addStudent(student2);


        assertEquals(cohort.getCohortAverage(), 25.0, 0);


    }


}
