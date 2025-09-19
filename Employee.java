/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    /*
     * question12
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        int yearstoWait=16-age;
        if(age>=16)
        {
            System.out.println("You can drive.");
            return true;
        }
        else
        {
            System.out.println("you have to wait "+yearstoWait+" year.");
            return false;
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    /*
     * question13
     */
    private double calculatePay(){
        // to be completed

        double subtotal=(hourlyWage*unpaidHours);
        double total=(subtotal-(0.30*subtotal));
        return (total);
    }
    
    /*
     * question11
     */
    public void setValue(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }
    
        /*
     * question11
     */
    public int getValue()
    {
        return this.yearOfBirth;
    }
    
    /*
     * Output the payment record and resets unpaid hours 
     */
    /*
     * question14
     */
    public void paySalary(){
        // to be completed
        double total=calculatePay();
        System.out.println
            (fullname+" had received a wire transfer of "+ total +" CAD.");
        unpaidHours=0;
    }
}