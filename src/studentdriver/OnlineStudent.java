package studentdriver;

public class OnlineStudent extends StudentFees {

    private int noOfMonths;
    private final double MONTHLY_FEE = 1245.25;

    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentID);
    }
}
