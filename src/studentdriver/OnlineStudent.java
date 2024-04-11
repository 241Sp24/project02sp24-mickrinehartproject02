package studentdriver;

public class OnlineStudent extends StudentFees {

    //instance variables
    private int noOfMonths;
    private final double MONTHLY_FEE = 1245.25;

    //constructor
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }

    //getter
    public double getPayableAmount() {
        return noOfMonths * MONTHLY_FEE;
    }

    //toString
    @Override
    public String toString() {
        return "\n" + super.toString() + "\nNo of months: " + noOfMonths + "\nPayable amount: " + getPayableAmount();
    }

}
