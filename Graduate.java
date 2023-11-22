/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

 /* This is the template for graduate student objects. It is a subclass
   of the Student class. */

package dombrowski.cole.jce4;

public abstract class Graduate extends Student
{
    // Instance variables specific to this subclass
    private int gmat;

    // This is the non-default contructor
    // It first calls the constructor in the superclass (Student)
    // to initialize those variables that are defined in the
    // superclass. It then initializes those variables that are
    // defined in this subclass.
    // Note that the parameter list includes all pieces of
    // information, for both those superclass-defined variables
    // and subclass-defined variables.
    public Graduate(String i, String n, char g, float gpa, int gmat)
    {
        super(i, n, g, gpa);
        this.gmat = gmat;
    }

    // This method overRIDEs describeSelf() in the superclass
    // Unlike in Undergrad, this method doesn't call the superclass version
    // to generate part of its output. Everything is done from scratch.
     public void describeSelf()
    {
        // Notice that the superclass-defined variables are
        // accessible here by calling their getter methods
        String infoStr = "\nUNTID: " + this.getUNTID();
        infoStr += "\nName: " + this.getName();
        infoStr += "\nGender: " + this.getGender();
        infoStr += "\nGPA: " + this.getGPA();

        // Now, retrieve values of those variables defined in this class
        // They are directly accessible (no need to call getter methods
        infoStr += "\nGMAT Score: " + gmat;

        System.out.println("*****************************************");
        System.out.println("Output from describeSelf() in Graduate");
        System.out.println("It doesn't include output from Student");
        System.out.println(infoStr);
        System.out.println("*****************************************\n");
    }

    /* Pass the buck for the abstract method */
     public abstract StringBuilder doResearch ();
     
     
    // Getter and setter for instance variable defined in this subclass
    public void setGMAT(int g)
    {
        gmat = g;
    }
    
    public int getGMAT()
    {
        return gmat;
    }
}
