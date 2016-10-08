//Program Name: While & Do While Loops Lesson
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
public class while_do_while
{
	public static void main (String[] args)
  {
    // ***** WHILE LOOP EXAMPLE ****
    int myWalkingCounter = 0;
    int myWalkingCounterStart = 4;
    myWalkingCounter = myWalkingCounter + myWalkingCounterStart;
    while (myWalkingCounter <= 3)
    {
      myWalkingCounter++;
    }
	  System.out.println("Stop! You have walked " + myWalkingCounter + " times!");

    // ** Adjust line 10 to an initial value of 4 and run **
    
    // **** DO WHILE LOOP EXAMPLE ****
    int myWalkingCounterZ = 0;
    int myWalkingCounterStartZ = 4;
    myWalkingCounterZ = myWalkingCounterZ + myWalkingCounterStartZ;
    do
    {
      myWalkingCounterZ++;
    }while (myWalkingCounterZ <= 3);
    System.out.println("Stop! You have walked " + myWalkingCounterZ + " times!");
    
    // ** Adjust line 24 to an initial value of 4 and run **
    }
}
