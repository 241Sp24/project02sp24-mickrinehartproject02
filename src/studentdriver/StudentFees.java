package studentdriver;

public abstract class StudentFees extends StudentDriver {

    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private final int CREDITS_PER_COURSE = 3;
    private final double PER_CREDIT_FEE = 543.50;

    //constructor
    public StudentFees(String studentName, int studentID, boolean isEnrolled) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
    }

    //getters
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public boolean isIsEnrolled() {
        return isEnrolled;
    }

    public int getCREDITS_PER_COURSE() {
        return CREDITS_PER_COURSE;
    }

    public double PER_CREDIT_FEE() {
        return PER_CREDIT_FEE;
    }

    //setters
    public void setStudenName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    //payable amount
    public double getPayableAmount() {
        return CREDITS_PER_COURSE * PER_CREDIT_FEE;
    }

    //toString
    @Override
    public String toString() {
        return "Student Name: " + studentName + "\nStudent id: " + studentID + "\nEnrolled: " + isEnrolled;
    }
}
