/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagement;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author deema
 */
public class Helpers {
    //stores all course objects used by the application
    public static ArrayList<Course> courses = new ArrayList<>();
    //saves the complete course list to courses.txt
    public static void writeFile() {
    try {
        String fileName =Helpers.class.getResource("").getPath() + "/courses.txt";

        FileOutputStream fileOut =new FileOutputStream(fileName);

        ObjectOutputStream out =new ObjectOutputStream(fileOut);

        out.writeObject(courses);

        out.close();
        fileOut.close();

        System.out.println(
                "Courses list written to file successfully."
        );

    } catch (Exception e) {
        System.out.println(e);
    }
}//reads the saved course list from courses.txt
 public static void readFile() {
    try {
        String fileName =
                Helpers.class.getResource("").getPath() + "/courses.txt";

        FileInputStream fileIn =
                new FileInputStream(fileName);

        ObjectInputStream in =
                new ObjectInputStream(fileIn);

        courses = (ArrayList<Course>) in.readObject();

        in.close();
        fileIn.close();

        System.out.println("Courses read from file:");

        for (Course course : courses) {
            System.out.println(course);
        }

    } catch (FileNotFoundException e) {
    courses = new ArrayList<>();
    System.out.println("No courses file found. Starting with an empty list.");

} catch (Exception e) {
    System.out.println("Error reading courses file: " + e.getMessage());
}
}   
}
