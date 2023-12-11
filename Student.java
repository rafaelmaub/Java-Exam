import java.util.ArrayList;
import java.util.Random;

public class Student 
{
    private String _studentID;
    private String _studentName;
    private int _studentAge;
    private ArrayList<String> _courses = new ArrayList<String>();

    public String GetID()
    {
        return _studentID;
    }

    public String GetName()
    {
        return _studentName;
    }

    public int GetAge()
    {
        return _studentAge;
    }
    
    public void SetAge(int newAge)
    {
        _studentAge = newAge;
    }

    public ArrayList<String> GetAllCourses()
    {
        return _courses;
    }

    public void AddCourse(String courseName)
    {
        _courses.add(courseName);
    }

    public Student(String id, String name, int age)
    {
        _studentName = name;
        _studentAge = age;
        _studentID = id;

    }

    @Override
    public String toString() 
    {
        String student = "Student name: " + _studentName + "\nID: " + _studentID + "\nAge: " + _studentAge + "\nCourses: \n";
        for (String string2 : _courses) 
        {
            student += string2 + "\n";
        }
        student += "\n";
        return student;
    }
}
