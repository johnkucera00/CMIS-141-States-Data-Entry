/*
* File: TestStatesDataEntry.java
* Author: John Kucera
* Date: February 27, 2019
* Purpose: This test class demonstrates the functions of the StatesDataEntry class.
*/

// import necessary java classes
import java.util.Scanner;

public class TestStatesDataEntry {
      public static void main(String[] args) {

      // creating array for summary
      String [] summary = new String[100];
      int x = 0;

      // welcome Title
      System.out.println("Welcome to our State Information Website!\n");

      // creating Scanner object
      Scanner input = new Scanner(System.in);

      // printing state data
      while (true) {
            System.out.println("Please enter a State or 'None' to exit:");
            String stateName = input.nextLine();
            if (stateName.trim().equalsIgnoreCase("None")) { // print when  user entered None
                  System.out.println("***** Thank you *****");
                  System.out.println("A summary report on each State, Bird, and Flower is:");
                  for(int i = 1; i <= x; i++) {
                        System.out.println(summary[i]);
                  } // end of for loop
                  System.out.println("Please visit our site again!");
                  System.exit(0);
            } // end of if statement
            else {
                  States entry = StatesDataEntry.getState(stateName);
                        if (entry == null) { // print when entry did not match a state
                              System.out.println("Your entry was not a valid State. Please try again.");
                        } // end of inner if
                        else { // print when entry matched a state
                              System.out.printf("Bird: %s \nFlower: %s \n",
                              entry.getBird(), entry.getFlower());
                                    // putting into summary
                                    ++x;
                                    summary[x] = stateName + ", " + entry.getBird() + ", " + entry.getFlower();
                        } // end of inner else
            } // end of outer else
      } // end of while
      } // end of main method
} // end of class
