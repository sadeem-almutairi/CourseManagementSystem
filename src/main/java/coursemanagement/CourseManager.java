
package coursemanagement;

import java.util.ArrayList;

public class CourseManager implements Reportable {

    // Adds a new course to the course list
    public void addCourse(Course course) {
        Helpers.courses.add(course);
    }

    // Deletes a course using its course ID
    public boolean deleteCourse(int courseId) {

        for (int i = 0; i < Helpers.courses.size(); i++) {

            if (Helpers.courses.get(i).getCourseId() == courseId) {
                Helpers.courses.remove(i);
                return true;
            }
        }

        return false;
    }

    // Updates a course using its original course ID
    public boolean updateCourse(int originalCourseId, Course updatedCourse) {

        for (int i = 0; i < Helpers.courses.size(); i++) {

            if (Helpers.courses.get(i).getCourseId()
                    == originalCourseId) {

                Helpers.courses.set(i, updatedCourse);
                return true;
            }
        }

        return false;
    }

    // Searches by ID, code, title, department, or status
    public ArrayList<Course> searchCourses(String keyword) {

        ArrayList<Course> results = new ArrayList<>();

        for (Course course : Helpers.courses) {

            if (String.valueOf(course.getCourseId()).equals(keyword)
                    || course.getCourseCode()
                            .equalsIgnoreCase(keyword)
                    || course.getCourseTitle().toLowerCase()
                            .contains(keyword.toLowerCase())
                    || course.getDepartment().toLowerCase()
                            .contains(keyword.toLowerCase())
                    || course.getStatus().toString()
                            .equalsIgnoreCase(keyword)) {

                results.add(course);
            }
        }

        return results;
    }

    // Checks whether a course ID already exists
    public boolean courseIdExists(int id) {

        for (Course course : Helpers.courses) {

            if (course.getCourseId() == id) {
                return true;
            }
        }

        return false;
    }

    // Returns all stored courses
    public ArrayList<Course> getAllCourses() {
        return Helpers.courses;
    }

    // Generates a simple course report
    @Override
    public String generateReport() {
        return "Total Courses: " + Helpers.courses.size();
    }
}