package grademanagement;

public class Grade {

    private String studentID;

    private String gradeID;

    private String courseID;

    private double grade;

    private String semester;

    public Grade(String studentID, String gradeID, String courseID, double grade, String semester) {

        this.studentID = studentID;

        this.gradeID = gradeID;

        this.courseID = courseID;

        this.grade = grade;

        this.semester = semester;

    }

    public String getStudentID() {

        return studentID;

    }

    public void setStudentID(String studentID) {

        this.studentID = studentID;

    }

    public String getGradeID() {

        return gradeID;

    }

    public void setGradeID(String gradeID) {

        this.gradeID = gradeID;

    }

    public String getCourseID() {

        return courseID;

    }

    public void setCourseID(String courseID) {

        this.courseID = courseID;

    }

    public double getGrade() {

        return grade;

    }

    public void setGrade(double grade) {

        this.grade = grade;

    }

    public String getSemester() {

        return semester;

    }

    public void setSemester(String semester) {

        this.semester = semester;

    }

}
 