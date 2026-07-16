
package studentmanagement;

import java.io.*;
import java.util.ArrayList;

public class Helpers {

    static ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        if (s != null) {
            students.add(s);
        }
    }

    public static void writeFile(ArrayList<Student> studentsList) {

        try {
            String fileName = Helpers.class.getResource("").getPath() + "/students.txt";

            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(studentsList);

            out.close();
            fileOut.close();

            System.out.println("Students saved successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Student> readFile() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            String fileName = Helpers.class.getResource("").getPath() + "/students.txt";

            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            students = (ArrayList<Student>) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Students loaded successfully.");

        } catch (Exception e) {
        }

        return students;
    }
}