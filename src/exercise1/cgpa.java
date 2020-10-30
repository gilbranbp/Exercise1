package exercise1;

public class cgpa 
{
    double cgpa;
    double[] gpa = new double[4];
    double sum;
    double finalCgpa;
    
    cgpa()
    {
        this.cgpa = 2.16;
        this.gpa = new double[] {2.78, 3.01, 0.7};
        this.sum = 0;
        this.finalCgpa = 0;        
    }
    
    public void printCGPA()
    {
        System.out.println("CGPA                    : " + cgpa);
    }
    
    public void printGPA()
    {
        for(int i = 0; i < gpa.length; i++)
        {
            System.out.println("Sem "+ (i+1) +"                   : "+ gpa[i]);
        }
    }
    
    public double calculateCGPA()
    {
        for(int i=0; i<gpa.length; i++) 
        {
            sum+=gpa[i];
        }
        finalCgpa = sum/gpa.length;
	return finalCgpa;
    }
}
