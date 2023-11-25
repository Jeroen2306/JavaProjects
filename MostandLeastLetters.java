/*
* Name: Jeroen Emmanuel
* Date: November 10, 2023
* Description: The top 5 and bottom 5 letters
* Notes: Outputs the top 5 letters that are more frequent in the file and outputs the bottom 5 letters that rarely found in the file
*/
import java.util.*;
import java.io.*;
public class A2Q1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> frequency = new ArrayList<Integer>();
        ArrayList<String> list = new ArrayList<String>();

        readsFile(list);
        numberOfInstances(list, frequency);
        frequencies(list, frequency);
       
    } // end of main
    
    public static void readsFile(ArrayList<String> list) throws IOException {
        Scanner reader = new Scanner(new File("scarlet.txt"));
 
        while(reader.hasNext()) {
            String word = reader.next();
            list.add(word); 
        }
        System.out.println("frequencies.txt has been created");
    } // end of readsFile
    
    public static void numberOfInstances(ArrayList<String> list, ArrayList<Integer> frequency) {

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;
        int countH = 0;
        int countI = 0;
        int countJ = 0;
        int countK = 0;
        int countL = 0;
        int countM = 0;
        int countN = 0;
        int countO = 0;
        int countP = 0;
        int countQ = 0;
        int countR = 0;
        int countS = 0;
        int countT = 0;
        int countU = 0;
        int countV = 0;
        int countW = 0;
        int countX = 0;
        int countY = 0;
        int countZ = 0;

        for (int i = 0; i < list.size(); i++) {
                String word = list.get(i);
           
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                        
                if (letter == 'a' || letter == 'A') {
                    countA = countA + 1;
                }
                else if (letter == 'b' || letter == 'B') {
                    countB = countB + 1;
                }
                else if (letter == 'c' || letter == 'C') {
                    countC = countC + 1;
                } 
                else if (letter == 'd' || letter == 'D') {
                    countD = countD + 1;
                } 
                else if (letter == 'e' || letter == 'E') {
                    countE = countE + 1;
                } 
                else if (letter == 'f' || letter == 'F') {
                    countF = countF + 1;
                } 
                else if (letter == 'g' || letter == 'G') {
                    countG = countG + 1;
                } 
                else if (letter == 'h' || letter == 'H') {
                    countH = countH + 1;
                } 
                else if (letter == 'i' || letter == 'I') {
                    countI = countI + 1;
                } 
                else if (letter == 'j' || letter == 'J') {
                    countJ = countJ + 1;
                } 
                else if (letter == 'k' || letter == 'K') {
                    countK = countK + 1;
                } 
                else if (letter == 'l' || letter == 'L') {
                    countL = countL + 1;
                } 
                else if (letter == 'm' || letter == 'M') {
                    countM = countM + 1;
                } 
                else if (letter == 'n' || letter == 'N') {
                    countN = countN + 1;
                } 
                else if (letter == 'o' || letter == 'O') {
                    countO = countO + 1;
                } 
                else if (letter == 'p' || letter == 'P') {
                    countP = countP + 1;
                } 
                else if (letter == 'q' || letter == 'Q') {
                    countQ = countQ + 1;
                } 
                else if (letter == 'r' || letter == 'R') {
                    countR = countR + 1;
                } 
                else if (letter == 's' || letter == 'S') {
                    countS = countS + 1;
                } 
                else if (letter == 't' || letter == 'T') {
                    countT = countT + 1;
                } 
                else if (letter == 'u' || letter == 'U') {
                    countU = countU + 1;
                } 
                else if (letter == 'v' || letter == 'V') {
                    countV = countV + 1;
                } 
                else if (letter == 'w' || letter == 'W') {
                    countW = countW + 1;
                } 
                else if (letter == 'x' || letter == 'X') {
                    countX = countX + 1;
                } 
                else if (letter == 'y' || letter == 'Y') {
                    countY = countY + 1;
                } 
                else if (letter == 'z' || letter == 'Z') {
                    countZ = countZ + 1;
                } 
            }
        }
        
    frequency.add(countA);
    frequency.add(countB);
    frequency.add(countC);
    frequency.add(countD);
    frequency.add(countE);
    frequency.add(countF);
    frequency.add(countG);
    frequency.add(countH);
    frequency.add(countI);
    frequency.add(countJ);
    frequency.add(countK);
    frequency.add(countL);
    frequency.add(countM);
    frequency.add(countN);
    frequency.add(countO);
    frequency.add(countP);
    frequency.add(countQ);
    frequency.add(countR);
    frequency.add(countS);
    frequency.add(countT);
    frequency.add(countU);
    frequency.add(countV);
    frequency.add(countW);
    frequency.add(countX);
    frequency.add(countY);
    frequency.add(countZ);

    
    } // end of numberOfInstances
    
    public static void frequencies(ArrayList<String> list, ArrayList<Integer> frequency) throws IOException {
        PrintWriter writer = new PrintWriter(new File("frequencies.txt"));
        ArrayList<String> letter = new ArrayList<String>();

        int top1 = 0;
        int top2 = 0;
        int top3 = 0;
        int top4 = 0;
        int top5 = 0;
        String letters1 = "";
        String letters2 = "";
        String letters3 = "";
        String letters4 = "";
        String letters5 = ""; 
       
        letter.add("A");
        letter.add("B");
        letter.add("C");
        letter.add("D");
        letter.add("E");
        letter.add("F");
        letter.add("G");
        letter.add("H");
        letter.add("I");
        letter.add("J");
        letter.add("K");
        letter.add("L");
        letter.add("M");
        letter.add("N");
        letter.add("O");
        letter.add("P");
        letter.add("Q");
        letter.add("R");
        letter.add("S");
        letter.add("T");
        letter.add("U");
        letter.add("V");
        letter.add("W");
        letter.add("X");
        letter.add("Y");
        letter.add("Z");

        for (int i = 0; i < frequency.size(); i++) {
            writer.println(letter.get(i) + ":" + frequency.get(i));
        }

        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) > top1) {
                top1 = frequency.get(i);
                letters1 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) > top2 && frequency.get(i) < top1) {
                top2 = frequency.get(i);
                letters2 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) > top3 && frequency.get(i) < top2) {
                top3 = frequency.get(i);
                letters3 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) > top4 && frequency.get(i) < top3) {
                top4 = frequency.get(i);
                letters4 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) > top5 && frequency.get(i) < top4) {
                top5 = frequency.get(i);
                letters5 = letter.get(i);
            }
        }
            
        int bottom1 = top1;
        int bottom2 = top1;
        int bottom3 = top1;
        int bottom4 = top1;
        int bottom5 = top1;
        String letters6 = "";
        String letters7 = "";
        String letters8 = "";
        String letters9 = "";
        String letters10 = ""; 
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) < bottom1) {
                bottom1 = frequency.get(i);
                letters6 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) < bottom2 && frequency.get(i) > bottom1) {
                bottom2 = frequency.get(i);
                letters7 = letter.get(i);
            }
        } 
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) < bottom3 && frequency.get(i) > bottom2) {
                bottom3 = frequency.get(i);
                letters8 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) < bottom4 && frequency.get(i) > bottom3) {
                bottom4 = frequency.get(i);
                letters9 = letter.get(i);
            }
        }
        
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) < bottom5 && frequency.get(i) > bottom4) {
                bottom5 = frequency.get(i);
                letters10 = letter.get(i);
            }
        }
      
        writer.println("Top 5 letters: ");
        writer.println(letters1 + " = " + top1);
        writer.println(letters2 + " = " + top2);
        writer.println(letters3 + " = " + top3);
        writer.println(letters4 + " = " + top4);
        writer.println(letters5 + " = " + top5);

        writer.println("Bottom 5 letters: ");
        writer.println(letters10 + " = " + bottom5);
        writer.println(letters9 + " = " + bottom4);
        writer.println(letters8 + " = " + bottom3);
        writer.println(letters7 + " = " + bottom2);
        writer.println(letters6 + " = " + bottom1);
        
        writer.close();

    } // end of frequencies
} // end of class 
