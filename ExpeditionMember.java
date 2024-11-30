public class ExpeditionMember {
    // Private fields for member's name and student ID
    private String memberName;
    private String studentID;

    public static int member_counter = 0;

    // Constructor to initialise fields and increment member_counter
    public ExpeditionMember(String memberName, String studentID) {

        this.memberName = memberName;
        this.studentID = studentID;

        member_counter++;
    }

    // Getter for memberName
    public String getMemberName() {
        return memberName;
    }

    // Setter for memberName
    public void setMemberName(String memberName) {

        this.memberName = memberName;
    }

    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }

    // Setter for studentID
    public void setStudentID(String studentID) {

        this.studentID = studentID;
    }
}
