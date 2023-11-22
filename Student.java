/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

 /* This is the superclass sitting at the top of the inheritance hierarchy
 * in our example. It has two immediate subclasses - Undergrad and Graduate.
 */
package dombrowski.cole.jce4;

public abstract class Student
{
    //***** Static Variable *****//
    static int studentCount;

    //***** Instance Variables *****//
    private String untId;
    private String name;
    private char gender;
    private float gpa;

    // Full-initialization constructor
    public Student(String i, String n, char g, float gpa)
    {
        // Initializes instance variables of the new object 
        untId = i;
        name = n;
        gender = g;
        this.gpa = gpa;

        // Add 1 to the static variable for object count
        studentCount++;
    }

    // Default contructor
    public Student()
    {
        // No instance variables are initialized
        // Still should add 1 to the count of objects since
        // this DOES create a new object
        studentCount++;
    }

    // Partial initialization constructor
    public Student(String i, String n)
    {
        // Initializes only two of the four instance variables.
        untId = i;
        name = n;

        // Add 1 to the static variable for object count
        studentCount++;
    }

    // ***** Instance Method *****//
    public void describeSelf()
    {
        String msg = "=========================================\n";
        msg += "Output of describeSelf() in Student Class\n";
        msg += untId + "\t" + name + "\t" + gpa;

        System.out.println(msg);
    }

    public abstract StringBuilder doResearch();
    

    // ***** Setters and Getters *****//
    // For UNT ID //
    public void setUNTID(String id)
    {
        untId = id;
    }

    public String getUNTID()
    {
        return untId;
    }

    // For Name //
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    // For Gender //
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public char getGender()
    {
        return gender;
    }

    // For GPA //
    public void setGPA(float gpa)
    {
        this.gpa = gpa;
    }

    public float getGPA()
    {
        return gpa;
    }

    // ***** Static Methods *****//
    public static void addToCount()
    {
        studentCount++;
    }

    public static int readStudentCount()
    {
        return studentCount;
    }
}
