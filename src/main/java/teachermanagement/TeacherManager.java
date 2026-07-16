/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teachermanagement;
import java.util.ArrayList;

/**
 *
 * @author sadeem
 */

public class TeacherManager {
      private ArrayList<Teacher> teachers;

      public TeacherManager() {
        Helpers.readFile();
        teachers = Helpers.teachers;
}

    
    // Add new teacher -> form panel
    public boolean addTeacher(Teacher teacher) {

        // to make sure the teacher doesnt already exist
        if (searchTeacherById(teacher.getTeacherId()) != null) {
            return false;
        }

        teachers.add(teacher);
        Helpers.writeFile();
        return true;
    }
    
    // Update teacher details -> form panel
    public boolean updateTeacher(int teacherId, String teacherName, String phoneNumber,
                                 String email, String department, String specialization,
                                 TeacherStatus status) {

        Teacher teacher = searchTeacherById(teacherId);

        if (teacher == null) { // if teacher doesnt exist u cant update his info
            return false;
        }

        teacher.setTeacherName(teacherName);
        teacher.setPhoneNumber(phoneNumber);
        teacher.setEmail(email);
        teacher.setDepartment(department);
        teacher.setSpecialization(specialization);
        teacher.setStatus(status);
        Helpers.writeFile();
        return true;
    }

    // View all teachers -> table panel
    public ArrayList<Teacher> getAllTeachers() {
        return teachers;
    }

    // methods for searching panel -> id, name, dep, specialization, status
    // Searching by ID
    public Teacher searchTeacherById(int teacherId) {

        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    // Searching by name
    public ArrayList<Teacher> searchTeacherByName(String teacherName) {

        ArrayList<Teacher> results = new ArrayList<>();// temporary list if multiple teachers have the same name

        for (Teacher teacher : teachers) {
            // to make the search not sensitive to higer or lower case leetters
            if (teacher.getTeacherName().equalsIgnoreCase(teacherName)) {
                results.add(teacher);
            }
        }

        return results;
    }

    // Searching by department
    public ArrayList<Teacher> searchTeacherByDepartment(String department) {

        ArrayList<Teacher> results = new ArrayList<>();

        for (Teacher teacher : teachers) {

            if (teacher.getDepartment().equalsIgnoreCase(department)) {
                results.add(teacher);
            }
        }

        return results;
    }

    // Searching by specialization
    public ArrayList<Teacher> searchTeacherBySpecialization(
            String specialization) {

        ArrayList<Teacher> results = new ArrayList<>();

        for (Teacher teacher : teachers) {

            if (teacher.getSpecialization().equalsIgnoreCase(specialization)) {
                results.add(teacher);
            }
        }

        return results;
    }

    // Searching by status
    public ArrayList<Teacher> searchTeacherByStatus(TeacherStatus status) {

        ArrayList<Teacher> results = new ArrayList<>();

        for (Teacher teacher : teachers) {

            if (teacher.getStatus() == status) {
                results.add(teacher);
            }
        }

        return results;
    }

    

    // Updating teacher status -> status update panel
    public boolean updateTeacherStatus(int teacherId, TeacherStatus status) {

        Teacher teacher = searchTeacherById(teacherId);

        if (teacher == null) {
            return false;
        }

        teacher.setStatus(status);
         Helpers.writeFile();
        return true;
    }

    // Deleting teacher record 
    public boolean deleteTeacher(int teacherId) {

        Teacher teacher = searchTeacherById(teacherId);

        if (teacher == null) {
            return false;
        }

        teachers.remove(teacher);
         Helpers.writeFile();
        return true;
    }

    // Get total number of teachers -> report panel
    public int getTotalTeachers() {
        return teachers.size();
    }

    // Count teachers by status -> report panel
    public int countTeachersByStatus(TeacherStatus status) {

        int count = 0;

        for (Teacher teacher : teachers) {

            if (teacher.getStatus() == status) {
                count++;
            }
        }

        return count;
    }

    // Count teachers by department -> report panel
    public int countTeachersByDepartment(String department) {

        int count = 0;

        for (Teacher teacher : teachers) {

            if (teacher.getDepartment().equalsIgnoreCase(department)) {
                count++;
            }
        }

        return count;
    }

    // report panel 
    public String generateReport() {

        return "Total Teachers: " + getTotalTeachers() + "\n"
            + "Available Teachers: " + countTeachersByStatus(TeacherStatus.AVAILABLE) + "\n"
            + "Busy Teachers: " + countTeachersByStatus(TeacherStatus.BUSY) + "\n"
            + "Teachers On Leave: " + countTeachersByStatus(TeacherStatus.ON_LEAVE) + "\n"
            + "Inactive Teachers: " + countTeachersByStatus(TeacherStatus.INACTIVE) + "\n"
            + "Math Department: " + countTeachersByDepartment("Math") + "\n"
            + "Cyber Security Department: " + countTeachersByDepartment("Cyber security") + "\n"
            + "English Department: " + countTeachersByDepartment("English");
    }
}
