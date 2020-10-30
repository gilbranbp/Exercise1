package exercise1;

public class Biodata 
{
    String name;
    String age;
    String dateOfBirth;                                             
    String placeOfBirth;
    
    Biodata()
    {
    this.name = "Muhammad Sri Gilbran";
    this.age = "19 years old";
    this.dateOfBirth = "14 December 2000";
    this.placeOfBirth = "Dr. Hasan Sadikin Central General Hospital, Jakarta, Indonesia";    
    }
    
    public void printName()
    {
        System.out.println("Name                    : " + name);
        System.out.println("Age                     : " + age);
        System.out.println("Date of birth           : " + dateOfBirth);
        System.out.println("Place of birth          : " + placeOfBirth);
    }
}
