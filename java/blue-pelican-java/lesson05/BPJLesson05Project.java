//Program Name: Blue Pelican Java Lesson 05 (Project)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson05Project {
    public static void main(String args[]){
        // ** Initialization of Variables **
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;
        
        // ** Problem #1 = 57.2 * (i1 / i2) + 1 **
            // Step 1. problem1 = 57.2 * (i1 / i2) + 1
            // Step 2. problem1 = 57.2 * (12 / 18) + 1
            // Step 3. problem1 = 57.2 * (0) + 1
            // Step 4. problem1 = 0 + 1
            // Step 5. problem1 = 1
        double problem1 = 57.2 * (i1 / i2) + 1; // Answer = 1.0
        System.out.println("Problem 1: " + problem1);
        
        // ** Problem #2 = 57.2 * ((double)i1 / i2) + 1 **
            // Step 1. problem2 = 57.2 * (i1 / i2) + 1
            // Step 2. problem2 = 57.2 * (12.0 / 18) + 1
            // Step 3. problem2 = 57.2 * (0.66666) + 1
            // Step 4. problem2 = 38.133333 + 1
            // Step 5. problem2 = 39.133333
        double problem2 = 57.2 * ((double)i1 / i2) + 1; // Answer = 39.33333
        System.out.println("Problem 2: " + problem2);
        
        // ** Problem #3 = 15 - i1 * (d1 * 3) + 4 **
            // Step 1. problem3 = 15 - i1 * (d1 * 3) + 4
            // Step 2. problem3 = 15 - 12 * (37.9 * 3) + 4
            // Step 3. problem3 = 15 - 12 * 113.7 + 4
            // Step 4. problem3 = 15 - 1364.4 + 4
            // Step 5. problem3 = -1349.4 + 4
            // Step 6. problem3 = -1345.4
        double problem3 = 15 - i1 * (d1 * 3) + 4;
        System.out.println("Problem 3: " + problem3); // Answer = -1345.39999

        // ** Problem #4 = 15 - i1 * (int)(d1 * 3) + 4 **
            // Step 1. problem4 = 15 - i1 * (int)(d1 * 3) + 4
            // Step 2. problem4 = 15 - 12 * (int)(37.9 * 3) + 4
            // Step 3. problem4 = 15 - 12 * (int)(113.7) + 4
            // Step 4. problem4 = 15 - 12 * 113 + 4
            // Step 5. problem4 = 15 - 1356 + 4
            // Step 6. problem4 = -1341 + 4
            // Step 7. problem4 = -1337
        int problem4 = 15 - i1 * (int)(d1 * 3) + 4;
        System.out.println("Problem 4: " + problem4); // Answer = -1337
        
        // ** Problem #5 = 15 - i1 * ((int)d1 * 3) + 4 **
            // Step 1. problem5 = 15 - i1 * ((int)d1 * 3) + 4
            // Step 2. problem5 = 15 - 12 * ((int)37.9 * 3) + 4
            // Step 3. problem5 = 15 - 12 * (37 * 3) + 4
            // Step 4. problem5 = 15 - 12 * 111 + 4
            // Step 5. problem5 = 15 - 1332 + 4
            // Step 6. problem5 = -1317 + 4
            // Step 7. problem5 = -1313
        int problem5 = 15 - i1 * ((int)d1 * 3) + 4;
        System.out.println("Problem 5: " + problem5); // Answer = -1313
    }
}
