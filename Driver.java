/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

/* This class shows some basic inheritance concepts, including constructor
chaining, method overriding, and abstract methods. */

package dombrowski.cole.jce4;

public class Driver
{
    public static void main(String[] args)
    {
        // First object: An undergrad student object
        Undergrad u1 = new Undergrad("10101111", "Alice",
        'F', 3.50f, "Junior", 1250);

        // Display student info
        u1.describeSelf();

        // Retrieve and display info on undergraduate research
        StringBuilder u1Res = u1.doResearch();
        System.out.println(u1Res);

        // Second object: A doctoral student object
        Doctoral d1 = new Doctoral("10102222", "Eve", 'F', 3.23f, 660, true, "Andy Wu");

        // Display student info
        d1.describeSelf();

        // Retrieve and display info on doctoral research
        StringBuilder d1Res = d1.doResearch();
        System.out.println(d1Res);

        // Third obect: A Master student object
        Master m1 = new Master("10103333", "Bob", 'M', 3.15f, 570,"Cloud Computing");

        // Display student info
        m1.describeSelf();

        // Retrieve and display info on Master's research
        StringBuilder m1Res = m1.doResearch();
        System.out.println(m1Res);
    }
}
