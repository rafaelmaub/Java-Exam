import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class Main 
{
    public static ArrayList<Student> AllStudents = new ArrayList<Student>();
    public static void main(String[] args) 
    {
        Random ran = new Random();
        Student stu0 = new Student(Integer.toString(ran.nextInt(9999)), "Rafael", 22);
        stu0.AddCourse("MATH");
        stu0.AddCourse("GEO");
        stu0.AddCourse("HIST");
        Student stu1 = new Student(Integer.toString(ran.nextInt(9999)), "Lucas", 21);
        stu1.AddCourse("MATH");
        stu1.AddCourse("PROG");
        stu1.AddCourse("ENG");
        Student stu2 = new Student(Integer.toString(ran.nextInt(9999)), "Pedro", 23);
        stu2.AddCourse("HIST");
        stu2.AddCourse("PROG");
        stu2.AddCourse("CALC");
        Student stu3 = new Student(Integer.toString(ran.nextInt(9999)), "Albert", 25);
        stu3.AddCourse("PROG");
        stu3.AddCourse("NET");
        stu3.AddCourse("CALC");
        Student stu4 = new Student(Integer.toString(ran.nextInt(9999)), "Chris", 27);
        stu4.AddCourse("MATH");
        stu4.AddCourse("GEO");
        stu4.AddCourse("HIST");

        AllStudents.add(stu0);
        AllStudents.add(stu1);
        AllStudents.add(stu2);
        AllStudents.add(stu3);
        AllStudents.add(stu4);

        AllStudents.stream().forEach(System.out::print);

        AllStudents.stream().filter(s -> s.GetAllCourses().contains("PROG")).forEach(System.out::print);

        AllStudents.stream().peek(s -> 
        {
            if(s.GetAge() <= 21)
            {
                s.SetAge(21 + 1);
            }
        }).forEach(System.out::print);

        OptionalDouble averageAge = AllStudents.stream().mapToInt(s -> s.GetAge()).average();
        System.out.println("Average age is " + averageAge.getAsDouble());

        
    }
}
