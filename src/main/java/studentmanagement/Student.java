
package studentmanagement;

import java.io.Serializable;

public class Student implements Serializable {
    
    private String studentID;
    private String studentName;
    private String program;
    private String semester;
    private String phone;
    private String email;
    private double cgpa;
    private StudentStatus status;

    public Student() {
    }

    public Student(String studentID, String studentName,
            String program, String semester,
            String phone, String email,
            double cgpa, StudentStatus status) {

        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
        this.semester = semester;
        this.phone = phone;
        this.email = email;
        this.cgpa = cgpa;
        this.status = status;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    } 

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

}

