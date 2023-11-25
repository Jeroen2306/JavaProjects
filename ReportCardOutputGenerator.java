/*
* Name: Jeroen Emmanuel
* Date: November 10, 2023
* Description: Report Card for each student
* Notes: Outputs each students average mark and course average
*/
import java.util.*;
import java.io.*;
public class AQ2Q {
    public static void main(String[] args) throws IOException {
        
    ArrayList<String> firstName = new ArrayList<String>();
    
    ArrayList<String> lastName = new ArrayList<String>();
    
    ArrayList<Integer> mathematics = new ArrayList<Integer>();
    
    ArrayList<Integer> english = new ArrayList<Integer>();
    
    ArrayList<Integer> science = new ArrayList<Integer>();
    
    ArrayList<Integer> arts = new ArrayList<Integer>();  
    
    ArrayList<Integer> studentAvg = new ArrayList<Integer>();  

    ArrayList<Integer> courseAvg = new ArrayList<Integer>();  

    readFile(firstName, lastName, mathematics, english, science, arts);
    
    calcAvgStudent(mathematics, english, science, arts, studentAvg);
    
    calcAvgCourse(mathematics, english, science, arts, courseAvg);
    
    reportCard(firstName, lastName, mathematics, english, science, arts, studentAvg, courseAvg);
    
    System.out.println("Report Card has been created for every student in a file");

    } // end of main
    
    public static void readFile(ArrayList<String> firstName,ArrayList<String> lastName, ArrayList<Integer> mathematics, ArrayList<Integer> english, ArrayList<Integer> science, ArrayList<Integer> arts) throws IOException {
        Scanner reader = new Scanner(new File("raw_marks.txt"));
        reader.nextLine();
        
        while(reader.hasNext()) {
            String first = reader.next();
            String last = reader.next();
            int math = reader.nextInt();
            int eng = reader.nextInt();
            int sci = reader.nextInt();
            int art = reader.nextInt();
            firstName.add(first);
            lastName.add(last);
            mathematics.add(math);
            english.add(eng);
            science.add(sci);
            arts.add(art);
        }
     
    } // end of readFile
    
    public static void calcAvgStudent(ArrayList<Integer> mathematics, ArrayList<Integer> english, ArrayList<Integer> science, ArrayList<Integer> arts, ArrayList<Integer> studentAvg) {
        
        int studentSum = 0;
        int studentAverage = 0;
        
        for (int i = 0; i < mathematics.size(); i++) {
            studentSum = mathematics.get(i) + english.get(i) + science.get(i) + arts.get(i);
            studentAverage = studentSum/4;
            studentAvg.add(studentAverage);
        }
        
    } // end of calcAvgStudent
    
   public static void calcAvgCourse(ArrayList<Integer> mathematics, ArrayList<Integer> english, ArrayList<Integer> science, ArrayList<Integer> arts, ArrayList<Integer> courseAvg) {
       
       int MathSum = 0;
       int MathAverage = 0;
       int EnglishSum = 0;
       int EnglishAverage = 0;
       int ScienceSum = 0;
       int ScienceAverage = 0;
       int ArtSum = 0;
       int ArtAverage = 0;
     
       for (int i = 0; i < mathematics.size(); i++) {
                MathSum = MathSum + mathematics.get(i);
                
                MathAverage = MathSum/mathematics.size();
            } // end of loop
       
       for (int i = 0; i < english.size(); i++) {
                EnglishSum = EnglishSum + english.get(i);
                EnglishAverage = EnglishSum/english.size();

            } // end of loop
       
       for (int i = 0; i < science.size(); i++) {
                ScienceSum = ScienceSum + arts.get(i);
                ScienceAverage = ScienceSum/science.size();
            } // end of loop
       
       for (int i = 0; i < arts.size(); i++) {
                ArtSum = ArtSum + arts.get(i);
                ArtAverage = ArtSum/arts.size();
            } // end of loop
       
       courseAvg.add(MathAverage);
       courseAvg.add(EnglishAverage);
       courseAvg.add(ScienceAverage);
       courseAvg.add(ArtAverage);

       
   } // end of calcAvgCourse
    
   public static void reportCard(ArrayList<String> firstName,ArrayList<String> lastName, ArrayList<Integer> mathematics, ArrayList<Integer> english, ArrayList<Integer> science, ArrayList<Integer> arts, ArrayList<Integer> studentAvg, ArrayList<Integer> courseAvg) throws IOException {
        
        for (int i = 0; i < mathematics.size(); i++) {
            PrintWriter writer = new PrintWriter(new File(lastName.get(i) + " .txt"));
            writer.println();
            writer.println("Student Name: " + lastName.get(i) + ", " + firstName.get(i));
            writer.println("Average Mark: " + studentAvg.get(i));
            writer.println();
            writer.println("Course:\t\t\t\tFinal Mark:\tCourse Average:");
            writer.println("=======                         ===========     ===============");
            writer.println("Math\t\t\t\t" + mathematics.get(i) + "\t\t" + courseAvg.get(0));
            writer.println("English\t\t\t\t" + english.get(i) + "\t\t" + courseAvg.get(1));
            writer.println("Science\t\t\t\t" + science.get(i) + "\t\t" + courseAvg.get(2));
            writer.println("Art\t\t\t\t" + arts.get(i) + "\t\t" + courseAvg.get(3));
            writer.close();
        }
   } // end of reportCard
} // end of class
