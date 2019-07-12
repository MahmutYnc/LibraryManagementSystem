package Library;

public class IssueBooks {
    private int ID, studentID, studentContact;
    private String bookCallNo, studentName, issueddate;

    public IssueBooks(int ID, String bookCallNo, int studentID, String studentName, int studentContact, String issueddate) {
        this.ID = ID;
        this.studentID = studentID;
        this.studentContact = studentContact;
        this.bookCallNo = bookCallNo;
        this.studentName = studentName;
        this.issueddate = issueddate;
    }

    public int getID() {
        return ID;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getStudentContact() {
        return studentContact;
    }

    public String getBookCallNo() {
        return bookCallNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getIssueddate() {
        return issueddate;
    }
}
