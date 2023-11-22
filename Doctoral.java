/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

 /* This is the template for doctoral student objects. It is a subclass
   of the Graduate class, which itself is a subclass of Student in turn. */

package dombrowski.cole.jce4;

public class Doctoral extends Graduate
{
    private boolean candidate;
    private String dissertationChair;

    // Full-initialization constructor
    public Doctoral(String i, String n, char g, float gpa,
            int gmat, boolean c, String d)
    {
        // Call the constructor in Graduate superclass
        super(i, n, g, gpa, gmat);

        // Initialize instance variable unique in this subclass
        candidate = c;
        dissertationChair = d;
    }
    
    /* Implement the Abstract Method */
    public StringBuilder doResearch()
    {
        StringBuilder d = new StringBuilder();

        d.append("======================================================================\n");
        d.append("       Doctoral Research: Output from doResearch() in Doctoral\n");
        d.append("======================================================================\n");

        d.append(
                "Doctoral students are required to design and implement a sophisticated \n"
                + "academic study after they pass the Comprehensive Exams and become a\n"
                + "doctoral candidate. They should do this under the supervision of their\n"
                + "dissertation chairs and their doctoral study should contribute new\n"
                + "findings to our knowledge about the discipline in which their research\n"
                + "done. The dissertation typically takes two years to complete and its\n"
                + "length typically runs from 100 to 300 pages.\n\n");

        return d;
    }
    
    
    // An instance method to display how research is done by an object created
    // out of this class. This method overrides the doResearch() method declared
    // in the Student superclass.
    public void setCandidate(boolean c)

    {
        candidate = c;
    }
    
    public boolean isCandidate()
    {
        return candidate;
    }
    // Setters and getters for instance variables unique in this subclass
    // For candidate


    // For dissertationChair
    public void setDissertationChair(String d)
    {
        dissertationChair = d;
    }

    public String getDissertationChair()
    {
        return dissertationChair;
    }
    
}
