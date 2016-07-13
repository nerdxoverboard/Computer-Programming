//Program Name: Blue Pelican Java Lesson 14 (Project)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
public class BPJLesson14Project {
	public static void main (String[] args) throws java.lang.Exception
	{
        int j = 65;
        char letter = 'A';
        System.out.println("Decimal     Binary           Octal        Hex         Character");
        while(j <= 90)
        {
            System.out.println(j + "          " + Integer.toBinaryString(j) + "          " + Integer.toOctalString(j) + "          " + Integer.toHexString(j) + "          " + letter);
            j ++;
            letter ++;
        }
    }
}
