package grademanagement;
import java.util.ArrayList;
public class GradeManagement {
   private ArrayList<Grade> grades;
   public GradeManagement() {
       grades = new ArrayList<>();
   }
   public void addGrade(Grade grade) {
       grades.add(grade);
   }
   public ArrayList<Grade> getAllGrades() {
       return grades;
   }
   public Grade searchGrade(String gradeID) {
       for (Grade g : grades) {
           if (g.getGradeID().equals(gradeID)) {
               return g;
           }
       }
       return null;
   }
   public void deleteGrade(String gradeID) {
       Grade g = searchGrade(gradeID);
       if (g != null) {
           grades.remove(g);
       }
   }
}
