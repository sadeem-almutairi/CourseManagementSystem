/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teachermanagement;
import java.io.Serializable;

/**
 *
 * @author sadeem
 */
public class Teacher implements Serializable {
    private int teacherId;
    private String teacherName;
    private String phoneNumber;
    private String email;
    private String department;
    private String specialization;
    private TeacherStatus status;

    // constructor
    public Teacher(int teacherId, String teacherName,
                   String phoneNumber, String email,
                   String department, String specialization,
                   TeacherStatus status) {

        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
        this.specialization = specialization;
        this.status = status;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public TeacherStatus getStatus() {
        return status;
    }

    public void setStatus(TeacherStatus status) {
        this.status = status;
    }

    public String getTeacherType() {
        return "Teacher";
    }

    public String toFileString() {
        return teacherId + "," +
               teacherName + "," +
               phoneNumber + "," +
               email + "," +
               department + "," +
               specialization + "," +
               status + "," +
               getTeacherType();
    }

    @Override
    public String toString() {
        return teacherId + " - " + teacherName;
    }
}
