/*
* File: States.java
* Author: John Kucera
* Date: February 27, 2019
* Purpose: This class accompanies the StatesDataEntry class in order to pull data
* from the stateInfo array.
*/

public class States {
      // creating flower and bird variables
      private final String flower;
      private final String bird;
      // constructor for getting state information
      public States (String flower, String bird) {
            this.flower = flower;
            this.bird = bird;
      } // end of constructor

      // getter methods
      public String getFlower() {
            return this.flower;
      } // end of method

      public String getBird() {
            return this.bird;
      } // end of method

} // end of class
