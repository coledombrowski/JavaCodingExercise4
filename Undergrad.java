/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

 /* This is the template for undergraduate student objects. It is a subclass
   of the Student class. */

package dombrowski.cole.jce4;

public class Undergrad extends Student
{
    // Instance variables unique to undergraduates
    private String level;
    private int sat;

    // Non-default contructor to initialize all variables
    // This is the non-default contructor
    // It first calls the constructor in the superclass (Student)
    // to initialize those variables that are defined in the
    // superclass. It then initializes those variables that are
    // defined in this subclass.
    // Note that the parameter list includes all pieces of
    // information, for both those superclass-defined variables
    // and subclass-defined variables.
    public Undergrad(String i, String n, char g, float gpa,
            String l, int s)
    {
        // Call the superclass constructor by passing input it needs
        super(i, n, g, gpa);

        // Initializes variables defined in this subclass
        level = l;
        sat = s;
    }

    // This method overRIDEs describeSelf() in the superclass
    // In this subclass we build upon the version done in the superclass
    public void describeSelf()
    {
        // Call the superclass version
        super.describeSelf();

        // Staring the subclass-specific output
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Output from part of describeSelf() in");
        System.out.println("Undergrad unique to the Undergrad class");

        String info = "Level: " + level;
        info += "\nSAT Score:" + sat;

        System.out.println(info);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }

    /* Implement the abstract method */
    // An instance method to display how research is done by an object created
    // out of this class. This method overrides the doResearch() method declared
    // in the Student superclass.
    public StringBuilder doResearch()
    {
        StringBuilder b = new StringBuilder();

        b.append("===================================================================\n");
        b.append("    Bachelor's Research: Output from doResearch() in Undergrad\n");
        b.append("===================================================================\n");

        b.append(
                "In our program, we require Bachelor's students to do research\n"
                + "in the form of a term paper to be completed within one semester.\n"
                + "Students use books, magazines, websites, Google, and other public\n"
                + "sources to write a report that is about 15-20 pages long.\n\n");

        return b;
    }

    // Setters and getters for instance variables defined in this subclass
    // For level
    public void setLevel(String l)
    {
        level = l;
    }

    public String getLevel()
    {
        return level;
    }

    // For sat
    public void setSAT(int s)
    {
        sat = s;
    }

    public int getSAT()
    {
        return sat;
    }
}
