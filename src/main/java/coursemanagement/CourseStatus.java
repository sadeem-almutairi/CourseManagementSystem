/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagement;

/**
 *
 * @author deema
 */

public enum CourseStatus {
        OFFERED("Offered"),
    NOT_OFFERED("Not Offered"),
    FULL("Full");

    private final String displayName;

    CourseStatus(String displayName) {
        this.displayName = displayName;
    }

    // Converts the ComboBox text into a CourseStatus value
    public static CourseStatus fromString(String value) {

        for (CourseStatus status : CourseStatus.values()) {

            if (status.displayName.equalsIgnoreCase(value)) {
                return status;
            }
        }

        throw new IllegalArgumentException("Invalid course status.");
    }

    // Displays a user-friendly status in the JTable
    @Override
    public String toString() {
        return displayName;
    }
}