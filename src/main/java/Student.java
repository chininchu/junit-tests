import java.util.ArrayList;
import java.util.RandomAccess;

public class Student {


    private String name;
    private long id;

    private ArrayList<Integer> grades;


    public Student(String name, long id, ArrayList<Integer> grades) {

        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {

        double average = 0;


        for (double grade : grades) {

            average += grade;


        }

        return average / grades.size();


    }
}
