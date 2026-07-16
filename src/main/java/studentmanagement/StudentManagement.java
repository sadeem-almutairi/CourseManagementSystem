
package studentmanagement;

import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students;

    public StudentManagement() {
        students = Helpers.readFile();
    }

    public boolean addStudent(Student student) {

        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(student.getStudentID())) {
                return false;
            }
        }

        students.add(student);
        Helpers.writeFile(students);

        return true;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student searchStudent(String studentID) {

        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(studentID)) {
                return s;
            }
        }

        return null;
    }

    public boolean deleteStudent(String studentID) {

        Student student = searchStudent(studentID);

        if (student != null) {
            students.remove(student);
            Helpers.writeFile(students);
            return true;
        }

        return false;
    }

    public boolean updateStudent(Student student) {

        Student oldStudent = searchStudent(student.getStudentID());

        if (oldStudent != null) {

            oldStudent.setStudentName(student.getStudentName());
            oldStudent.setProgram(student.getProgram());
            oldStudent.setSemester(student.getSemester());
            oldStudent.setPhone(student.getPhone());
            oldStudent.setEmail(student.getEmail());
            oldStudent.setCgpa(student.getCgpa());
            oldStudent.setStatus(student.getStatus());

            Helpers.writeFile(students);

            return true;
        }

        return false;
    }

}