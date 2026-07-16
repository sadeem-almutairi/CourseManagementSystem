/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courseregistration;
/**
 *
 * @author Hajar Alhajri
 */
import java.io.Serializable;
public class Registration implements Serializable {
    private String registrationId;
    private String studentId;
    private String studentName;
   private int courseId;
    private String courseCode;
    private String semester;
    private String registrationDate;
    private String registrationStatus;

    public Registration() {
    }

      public Registration(String registrationId, String studentId, String studentName, int courseId,  String courseCode, String semester, String registrationDate, String registrationStatus) {
        this.registrationId = registrationId;
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.semester = semester;
        this.registrationDate = registrationDate;
        this.registrationStatus = registrationStatus;
    }
      public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
}
