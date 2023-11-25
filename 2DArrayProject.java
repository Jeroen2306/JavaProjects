import java.util.*;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("Enter the number of rows for a 2D array: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns for a 2D array: ");
        int columns = input.nextInt();
        
        int[][] table = new int[rows][columns];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) { // columns
                int rand = generator.nextInt(100)+1;
                table[i][j] = rand;
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        
        while (true) {
            System.out.println("1 – Sum of 2D array");
            System.out.println("2 – Average of 2D array");
            System.out.println("3 – Maximum value in the 2D array");
            System.out.println("4 – Minimum value in the 2D array");
            System.out.println("5 – Sum of a Row in the 2D array");
            System.out.println("6 – Sum of a Column in the 2D array");
            System.out.println("7 - Number of Instances of a value in the 2D array");
            System.out.println("0 – Exit");
            int num = input.nextInt();
            
            if (num == 0) {
                System.out.println("Exiting Program...");
                break;
            }
            else if (num == 1) {
                calcSum(table);
            }
            else if (num == 2) {
                calcAvg(table);
            }
            else if (num == 3) {
                 findMax(table);
            }
            else if (num == 4) {
                findMin(table);
            }
            else if (num == 5) {
                rowSum(table);
            }
            else if (num == 6) {
                colSum(table);
            }
            else if (num == 7) {
                int count = countInstances(table);
            }
            else {
                System.out.println("Invalid Entry, please try again");
            }
        }
   
    } // end of main
    
    public static int calcSum (int[][] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) { // rows
            for (int j = 0; j < table[i].length; j++) { // columns
                sum = sum + table[i][j];
            }
        }
        System.out.println("Sum = " + sum);
        return sum;
    } // end of calcSum
    
    public static int calcAvg(int[][] table) {
        int sum = 0;
        int average = 0;
        int divisor = 0; 
        for (int i = 0; i < table.length; i++) { // rows
            for (int j = 0; j < table[i].length; j++) { // columns
                sum = sum + table[i][j];
                divisor = table.length * table[i].length;
                average = sum/divisor;
            }
        }
        System.out.println("Average: " + average);
        return average;
    } // end of calcAvg
    
     public static int findMax(int[][] table) {
        int maxValue = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > maxValue) {
                    maxValue = table[i][j];
                }
            }
        }
        System.out.println("The max value is " + maxValue);
        return maxValue;
    } // end of findMax
     
     public static int findMin(int[][] table) {
         int minValue = 100;
         for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] < minValue) {
                    minValue = table[i][j];
                }
            }
        }
        System.out.println("The min value is " + minValue);
        return minValue;
     } // end of findMin
     
     public static int rowSum(int[][] table) {
         Scanner input = new Scanner(System.in);
         int rows = 0; 
         System.out.println("Which row would you like the sum of? ");
         System.out.println("It starts at row 0");
         int row = input.nextInt();
         if (row < 0 || row > table[0].length) {
             System.out.println("Invalid Entry");
         }
         for (int i = 0; i < table[0].length; i++) {
                rows = rows + table[row][i];
            }
         System.out.println("The row sum is " + rows);
         return rows;
     } // end of rows
     
     public static int colSum(int[][] table) {
         Scanner input = new Scanner(System.in);
         int columns = 0; 
         System.out.println("Which row would you like the sum of? ");
         System.out.println("It starts at row 0");
         int column = input.nextInt();
         if (column < 0 || column > table[0].length) {
             System.out.println("Invalid Entry");
         }
         for (int j = 0; j < table[0].length; j++) {
             columns = columns + table[j][column];
         }
         System.out.println("The column sum is " + columns);
         return columns;
     } // end of columns
     
     public static int countInstances(int[][] table) {
         Scanner input = new Scanner(System.in);
         int count = 0;
         System.out.println("Enter a number between 1-100 for the number of instances");
         int instances = input.nextInt();
         if (instances < 0 || instances > 100) {
             System.out.println("Invalid Entry");
         }
         for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == instances) {
                count++;
                }
            }
         }
         System.out.println("The number of instances is " + count);
         return count;
     } //end of countInstances
} // end of class