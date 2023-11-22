/* JCE on Inheritance
   Fall 2023
   Student: Cole Dombrowski
   Date: 10/19/2023
 */

/* This class shows the use of polymorphism */

package dombrowski.cole.jce4;

public class Driver2
{
    public static void main (String[] args)
    { 
        // Create a Student array with 100 elements
        Student[] sa = new Student[100];
        
        // Create student objects (Undergrad, Master, or Doctoral) one by one
        // and as it is created, save the object to the next available element
        // in the Student array that is not yet occupied by an object we created.
        
        // First object: An Undergrad object
        Undergrad u1 = new Undergrad("10101111", "Alice",
                'F', 3.5f, "Junior", 1250);
        sa[0] = u1;

        // Second object: A Doctoral object
        Doctoral d1 = new Doctoral("10102222", "Eve",
                'F', 3.23f, 660, true, "Andy Wu");
        sa[1] = d1;
        
        // Third object: A Master object
        Master m1 = new Master("10103333", "Bob",
                'M', 3.15f, 570, "Cloud Computing");
        sa[2] = m1;
        
        // Fourth object: Another Master object
        Master m2 = new Master("10104444", "Jane",
                'F', 3.8f, 620, "Blockchain");
        sa[3] = m2;

        // Fifth object: Another Undergrad object
        Undergrad u2 = new Undergrad("10105555", "Steve",
                'M', 3.5f, "Senior", 1180);
        sa[4] = u2;
        
        // Sixth object: Yet another Undergrad object
        Undergrad u3 = new Undergrad("10106666", "Mandy",
                'F', 3.2f, "Senior", 1220);  
        sa[5] = u3;
        
        // Seventh object: Another Doctoral object
        Doctoral d2 = new Doctoral("10107777", "John",
                'M', 3.7f, 595, false, "TBD");  
        sa[6] = d2;  
               
        // Looping through the array elements to which a particular subclass
        // object has been stored. Note that we call the readStudentCount()
        // static method in the Student class to retrieve the number of objects
        // that we have created.
        for (int i = 0; i < Student.readStudentCount(); i++)
        {
            System.out.println("Iteration " + (i + 1));
            sa[i].describeSelf();      
        }
    }
}
