/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teachermanagement;

/**
 *
 * @author sadeem
 */
public class Coordinator extends Teacher {
     public Coordinator(int teacherId, String teacherName, String phoneNumber, String email,
                       String department, String specialization,
                       TeacherStatus status) {
         
        // super to call Teacher constructor (parent constructor)
        super(teacherId, teacherName, phoneNumber, email,
              department, specialization, status);
    }

    @Override
    public String getTeacherType() {
        return "Coordinator";
    }
    
}
