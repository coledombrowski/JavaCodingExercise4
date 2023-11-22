/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

 /* This is the template for master's student objects. It is a subclass
   of the Graduate class, which itself is a subclass of Student in turn. */

package dombrowski.cole.jce4;

public class Master extends Graduate
{
    private String thesisTitle;

    // Constructor to initialize all six properties: ID, name, gender, GPA, GMAT, thesisTitle
    public Master(String i, String n, char g, float gpa, int gmat, String t)
    {
        super(i, n, g, gpa, gmat);
        thesisTitle = t;
    }

    /* Implement the abstract method */
    // An instance method to display how research is done by an object created
    // out of this class. This method overrides the doResearch() method declared
    // in the Student superclass.
    public StringBuilder doResearch()
    {
        StringBuilder m = new StringBuilder();

        m.append("====================================================================\n");
        m.append("       Master's Research: Output from doResearch() in Master\n");
        m.append("====================================================================\n");

        m.append(
                "In our program, Master students are expected to design and implement\n"
                + "a simple academic study. In addition to books, magazines, websites, \n"
                + "Google, and other public sources, students also need to utilize some\n"
                + "academic literature. The thesis study is to be completed within two\n"
                + "semesters and contains 30-50 pages, excluding bibliography, tables, \n"
                + "figures, data, and other supporting materials.\n\n");

        return m;
    }

    // Setter and getter for instance variable unique in this subclass
     public void setThesisTitle(String t)
    {
        thesisTitle = t;
    }

    public String getThesisTitle()
    {
        return thesisTitle;
    }
}
