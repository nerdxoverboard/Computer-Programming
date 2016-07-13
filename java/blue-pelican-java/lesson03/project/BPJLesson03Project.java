//Program Name: Blue Pelican Java Lesson 03 (Project)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson03Project {
    public static void main(String args[]){
        // ***** DECLARING AND INITIALIZING VARIABLES *****
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        // ***** USING LENGTH METHOD OF STRING CLASS TO DETERMINE LENGTH OF EACH STRING *****
        int s1Length = s1.length();
        int s2Length = s2.length();
        int s3Length = s3.length();
        // ***** DETERMINE ENDING INDEX OF EACH STRING *****
        int s1EndIndex = s1Length - 3;
        int s2EndIndex = s2Length - 3;
        int s3EndIndex = s3Length - 3;
        // ***** USING SUBSTRING METHOD OF STRING CLASS TO GENERATE OUTPUT *****
        String s1Truncated = s1.substring(2,s1EndIndex);
        String s2Truncated = s2.substring(2,s2EndIndex);
        String s3Truncated = s3.substring(2,s3EndIndex);
        // ***** OUTPUT FINAL REQUESTED INFORMATION *****
        System.out.println(s1 + ">>>" + s1Truncated);
        System.out.println(s2 + ">>>" + s2Truncated);
        System.out.println(s3 + ">>>" + s3Truncated);
    }
}
