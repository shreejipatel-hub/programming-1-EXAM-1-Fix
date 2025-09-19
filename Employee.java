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
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age>=16)
        {
            print="You can drive.";
        }
        else
        {
            print ("you have to wait "+(16-age)+" year.";
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        double subtotal=(hourlyWage*unpaidHours);
        double total=(subtotal-(0.30*subtotal));
        print total;
    }
    
    private int setValue()
    {
        Birthyear=yearOfBirth;
        Birthyear.setValue;
    }
    
    private int getValue()
    {
        Birthyear.getValue();
    }
    
    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        print (fullname+" had received a wire transfer of "+total+" CAD.")
        unpaidHours=0;
    }
}