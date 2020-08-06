/*
* File: StatesDataEntry.java
* Author: John Kucera
* Date: February 27, 2019
* Purpose: This Java program prompts the user to enter a US State (or None to exit),
* and prints the State bird and flower for the entered State. A multi-dimensional array
* is used to store the State data.
* Sources:
* FLOWER DATA: https://www.teleflora.com/floral-facts/what-is-my-state-flower
* BIRD DATA: https://www.50states.com/bird/
*/

public class StatesDataEntry {
      // create array to hold data
      private static String[][] stateInfo = new String[][] {
              {"ALABAMA","Yellowhammer","Camellia"},
              {"ALASKA","Willow Ptarmigan","Forget-me-not"},
              {"ARIZONA","Cactus Wren","Saguaro Cactus Blossom"},
              {"ARKANSAS","Mockingbird","Apple Blossom"},
              {"CALIFORNIA","California Valley Quail","California Poppy"},
              {"COLORADO","Lark Bunting","Rocky Mountain Columbine"},
              {"CONNECTICUT","Robin","Mountain Laurel"},
              {"DELAWARE","Blue Hen Chicken","Peach Blossom"},
              {"FLORIDA","Mockingbird","Orange Blossom"},
              {"GEORGIA","Brown Thrasher","Cherokee Rose"},
              {"HAWAII","Nene","Hibiscus"},
              {"IDAHO","Mountain Bluebird","Mock Orange"},
              {"ILLINOIS","Cardinal","Purple Violet"},
              {"INDIANA","Cardinal","Peony"},
              {"IOWA","Eastern Goldfinch","Wild Prairie Rose"},
              {"KANSAS","Western Meadowlark","Sunflower"},
              {"KENTUCKY","Cardinal","Goldenrod"},
              {"LOUISIANA","Eastern Brown Pelican","Magnolia"},
              {"MAINE","Chickadee","White Pine Tassel and Cone"},
              {"MARYLAND","Baltimore Oriole","Black-eyed Susan"},
              {"MASSACHUSETTS","Chickadee","Mayflower"},
              {"MICHIGAN","Robin","Apple Blossom"},
              {"MINNESOTA","Common Loon","Pink and White Ladyslipper"},
              {"MISSISSIPPI","Mockingbird","Magnolia"},
              {"MISSOURI","Bluebird","Hawthorn"},
              {"MONTANA","Western Meadowlark","Bitterroot"},
              {"NEBRASKA","Western Meadowlark","Goldenrod"},
              {"NEVADA","Mountain Bluebird","Sagebrush"},
              {"NEW HAMPSHIRE","Purple Finch","Purple Lilac"},
              {"NEW JERSEY","Eastern Goldfinch","Violet"},
              {"NEW MEXICO","Roadrunner","Yucca"},
              {"NEW YORK","Bluebird","Rose"},
              {"NORTH CAROLINA","Cardinal","Flowering Dogwood"},
              {"NORTH DAKOTA","Western Meadowlark","Wild Prairie Rose"},
              {"OHIO","Cardinal","Scarlet Carnation"},
              {"OKLAHOMA","Scissor-tailed Flycatcher","Mistletoe"},
              {"OREGON","Western Meadowlark","Oregon Grape"},
              {"PENNSYLVANIA","Ruffed Grouse","Mountain Laurel"},
              {"RHODE ISLAND","Rhode Island Red","Violet"},
              {"SOUTH CAROLINA","Great Carolina Wren","Yellow Jessamine"},
              {"SOUTH DAKOTA","Ring-necked Pheasant","Pasque Flower"},
              {"TENNESSEE","Mockingbird","Iris"},
              {"TEXAS","Mockingbird","Texas Bluebonnet"},
              {"UTAH","Common American Gull","Sego Lily"},
              {"VERMONT","Hermit Thrush","Red Clover"},
              {"VIRGINIA","Cardinal","Flowering Dogwood"},
              {"WASHINGTON","Willow Goldfinch","Coast Rhododendron"},
              {"WEST VIRGINIA","Cardinal","Rhododendron"},
              {"WISCONSIN","Robin","Violet"},
              {"WYOMING","Western Meadowlark","Indian Paintbrush"},
      }; // end of array

      // Getter method
      public static States getState(String stateName) {
            for (int i = 0; i < stateInfo.length; i++) {
                  if (stateInfo[i][0].equalsIgnoreCase(stateName)) {
                        return new States (stateInfo[i][2], stateInfo[i][1]);
                  } // end of if
            } // end of for
            return null;
      } // end of method
} // end of class
