//Program Name: Blue Pelican Java Lesson 03 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson03Lesson {
    public static void main(String args[]){
        // ***** CONCATENATION *****
        String mm = "Hello"; // Declares variable "mm" as a string with the initial value of Hello.
        String nx = "Good Buddy"; // Declares variable "nx" as a string with the initial value of Good Buddy".
        String c = mm + nx; // Declares variable "c" as a string concatenating the values of variables "mm" and "nx".
        System.out.println(c); // Outputs value of variable "c". Note no space between the first and second words.
        String d = mm + " " + nx; // Declares variable "d" as a string concatenating the value of variables "mm" and "nx" with a space between them.
        System.out.println(d); // Outputs the value of variable "d". Note that there is now a space between the first and second words.
        
        // ***** LENGTH METHOD OF STRING CLASS *****
        String theName = "Donald Duck"; // Declares variable "theName" as a string with the initial value of Donald Duck.
        int len = theName.length(); // Declares variable "len" as an integer with the initial value calling the LENGTH method to be applied to the "theName" variable 
        System.out.println(len); // Outputs the value of the variable "len". In this case, the output should be 11.
        
        // ***** SUBSTRING METHOD OF STRING CLASS *****
        String myPet = "Sparky the dog"; // Declares variable "myPet" as a string with the initial value of Sparky the Dog.
        String smallPart1 = myPet.substring(4); // Declares variable "smallPart1" as a string with the initial value calling the SUBSTRING method to be applied to the "myPet" variable.
        System.out.println(smallPart1); // Outputs the value of the variable "smallPart1". In this case, the output should be "ky the dog" starting at the 4th index.
        
        String smallPart2 = myPet.substring(4, 12); // Declares variable "smallPart2" as a string with the initial value calling the SUBSTRING method to be applied to the "myPet" variable.
        System.out.println(smallPart2); // Outputs the value of the variable "smallPart2". In this case, the output should be "ky the d" starting at the 4th index and ending at the 12 index.
        
        // ***** TOLOWERCASE METHOD OF STRING CLASS *****
        String bismark = "Dude, where&#039;s MY car?"; // Declares variable "bismark" as a string with the initial value of Dude, where&#039;s MY car?.
        String bismark1 = bismark.toLowerCase(); // Declares the variable "bismark1" as a string with the initial value calling the TOLOWERCASE method to be applied to the "bismark" variable.
        System.out.println(bismark1); // Outputs the value of the variable "bismark1". In this case, the output should be "dude, where&#039;s my car?".
        
        // ***** TOUPPERCASE METHOD OF STRING CLASS *****
        String bismark2 = bismark.toUpperCase(); // Declares the variable "bismark2" as a string with the initial value calling the TOUPPERCASE method to be applied to the "bismark" variable.
        System.out.println(bismark2); // Outputs the value of the variable "bismark2". In this case, the output should be "DUDE, WHERE&#039;S MY CAR?".
        
        // ***** CONCATENATING STRINGS WITH INTS *****
        int x = 27; // Declares the variable "x" as an integer with the initial value of 27.
        String s = "Was haben wir gemacht?"; // Declares the variable "s" as a string with the initial value of Was haben wir gemacht?.
        String combo = s + " " + x; // Declares the variable "combo" as a string with the initial value of variable "s" concatenated with a space and then concatenated with the variable "x".
        System.out.println(combo); // Outputs the value of the variable "combo". In this case, the output should be "Was haben wir gemacht? 27".
        
        // ***** INLINE QUOTE ESCAPE CHARACTER *****
        String inlineQuote = "What \"is\" the right way?"; // Declares the variable "inlineQuote" as a string with the initial value of What \"is\" the right way?.
        System.out.println(inlineQuote); // Outputs the value of the variable "inlineQuote". In this case, the outputs should be "What "is" the right way?".
        
        // ***** LINE BREAK ESCAPE CHARACTER *****
        String multiLine = "Do you think this discussion should be broken onto two lines?\nYes, it should be broken onto two lines."; // Declares the variable "multiLine" as a string with an initial value of Do you think this discussion should be broken onto two lines?\nYes, it should be broken onto two lines.
        System.out.println(multiLine); // Outputs the value of the variable "multiLine". In this case, it should appear on two separate lines.
        
        // ***** BACKSLASH ESCAPE CHARACTER *****
        String fileLocation = "c:\\nerd_file.pdf"; // Declares the variable "fileLocation" as a string with the initial value of c:\\nerd_file.pdf.
        System.out.println(fileLocation); // Outputs the value of the variable "fileLocation". In this cases, it should appear with a single backslash.
        
        // ***** FORWARD SLASH IN A STRING *****
        String webAddress = "http://www.ferrisisd.org"; // Declares the variable "webAddress" as a string with the initial value of http://www.ferrisisd.org.
        System.out.println(webAddress); // Outputs the value of the variable "webAddress". In this case, it should appear as a normal URL.   
    }
}
