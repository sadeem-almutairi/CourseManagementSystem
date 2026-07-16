/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courseregistration;

/**
 *
 * @author Hajar Alhajri
 */
import java.io.*;
import java.util.ArrayList;

public class Helpers {

    public static ArrayList<Registration> registrationList = new ArrayList<>();
    public void addRegistration(Registration registration) {

        if (registration != null) {
            registrationList.add(registration);
        }

    }

    public static void writeFile() {

        try {

            String fileName = Helpers.class.getResource("").getPath() + "/course_registrations.txt";

            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(registrationList);

            out.close();
            fileOut.close();

            System.out.println("Registration list written to file successfully.");

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public static void readFile() {

        try {

            String fileName = Helpers.class.getResource("").getPath() + "/course_registrations.txt";

            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            registrationList = (ArrayList<Registration>) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Registration list read from file:");

            for (Registration r : registrationList) {

                System.out.println(r);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
