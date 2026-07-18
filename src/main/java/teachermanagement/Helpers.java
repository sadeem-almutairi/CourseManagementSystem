/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teachermanagement;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author sadeem
 */
public class Helpers {
 
    public static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void writeFile() {

        try {
            String fileName = "teachers.txt";

            FileOutputStream fileOut = new FileOutputStream(fileName);

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(teachers);

            out.close();
            fileOut.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {

        try {
            String fileName = "teachers.txt";
            
            File file = new File(fileName);
            if (!file.exists()) {
               return;
            }
            
            FileInputStream fileIn =
                    new FileInputStream(fileName);

            ObjectInputStream in =
                    new ObjectInputStream(fileIn);

            teachers = (ArrayList<Teacher>) in.readObject();

            in.close();
            fileIn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

