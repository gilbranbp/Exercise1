package exercise1;

public class Exercise1 {

    public static void main(String[] args) 
    {
    Biodata b = new Biodata();                                       //Declare biodata object  
    cgpa c = new cgpa();                                             //Declare cgpa object 
    results r = new results();                                       //Declare results object
    talents t = new talents();                                       //Declare talents object
    workExperiences w = new workExperiences();                       //Declare Work Experiences object
    skills s = new skills();                                         //Declare Work Skills object    
    
    b.printName();                                                   //Print out biodata object            
    
    System.out.println("");                                          //Gap between object
    
    c.printCGPA();                                                   //Print CGPA
    c.printGPA();                                                    //Print GPA
    System.out.println("Final Gpa\t        : " + c.calculateCGPA()); //Print Final Gpa
    
    System.out.println("");                                          //Gap between object                                        
    
    r.printResults();                                                //Print results object
    
    System.out.println("");                                          //Gap between object            
    
    t.printTalents();                                                //Print talents object
    
    System.out.println("");                                          //Gap between object
    
    w.printExp();                                                    //Print Work Experience object
    
    System.out.println("");                                          //Gap between object
    
    s.printSkills();                                                 //Print Work Skills object
    }
    
}
