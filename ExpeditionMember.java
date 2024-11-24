public class ExpeditionMember {
    private String memberName;
    private String studentID;

    public static int member_counter = 0;

    public ExpeditionMember(String memberName, String studentID) {
        if (memberName == null || memberName.trim().isEmpty()) {
            throw new IllegalArgumentException("Member Name cannot be empty");
        }
        this.memberName = memberName;

        if (studentID == null || studentID.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }
        this.studentID = studentID;

        member_counter++;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        if (memberName == null || memberName.trim().isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be empty");
        }
        this.memberName = memberName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if (studentID == null || studentID.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }
        this.studentID = studentID;
    }
}
