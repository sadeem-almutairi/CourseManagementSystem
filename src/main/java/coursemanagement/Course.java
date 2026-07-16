
package coursemanagement;
import java.io.Serializable;
/**
 *
 * @author deema
 */
public class Course implements Serializable{
    private int courseId;
    private String courseCode;
    private String courseTitle;
    private int creditHours;
    private String department;
    private int maxSeats;
    private int level;
    private CourseStatus status;
    
    public Course(int courseId, String courseCode, String courseTitle,
        int creditHours, String department, int maxSeats,
        int level, CourseStatus status) {

       this.courseId = courseId;
       this.courseCode = courseCode;
       this.courseTitle = courseTitle;
       this.creditHours = creditHours;
       this.department = department;
       this.maxSeats = maxSeats;
       this.level = level;
       this.status = status;
}
    public int getCourseId() {
        return courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getDepartment() {
        return department;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getLevel() {
        return level;
    }

    public CourseStatus getStatus() {
        return status;
    }

    // Setters
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStatus(CourseStatus status) {
        this.status = status;
    }
 
}
