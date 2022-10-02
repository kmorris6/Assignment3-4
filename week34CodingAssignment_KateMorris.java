package week4Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class week34CodingAssignment_KateMorris {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
  int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

//    a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
// (i.e. do not use ages[7] in your code). Print the result to the console.  
  int subtractFirstFromLast = ((ages[ages.length -1]) - (ages[0]));
  ages[ages.length - 1] = subtractFirstFromLast;
  System.out.println(Arrays.toString(ages));
  
//    b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
  int n = ages.length;
  int i = 10;
  int[] newAges = new int[n + 1];
  
  for(int integer = 0; integer < n; integer++) {
    newAges[integer] = ages[integer];
  }
  newAges[n] = 10;
  System.out.println(Arrays.toString(newAges));
  
//    c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
  double sumOfAges = 0;
  
  for(int x = 0; x < newAges.length; x++) {
    sumOfAges = sumOfAges + newAges[x];
  }
  double avgOfAges = sumOfAges / newAges.length;
  System.out.println(avgOfAges);
  
// Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
  String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
  
//    a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
  int sumOfLetters = 0;
  for(String name : names) {
    sumOfLetters += name.length();
    //System.out.println(name.length());
  }
  // System.out.println(sumOfLetters); this prints the sum of all the letters
  // System.out.println(names.length); this prints the total number of names
  
  double avgOfLetters = sumOfLetters / names.length;
  System.out.println(avgOfLetters);
  
//    b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the 
// result to the console.
  for(String N : names) {
    System.out.printf(N + " ");
  }
  System.out.println(" "); // to separate this problem to the next that prints in the output
  
// How do you access the last element of any array?
    /* The last element of any array can be accessed by saying -1 the length of that array.
     * Example: array[array.length - 1];
     */
  
// How do you access the first element of any array?
    /* The first element of any array can be access by using the first place holder 0.
     * Example: array[0];
     */
  
// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of 
// each name to the nameLengths array.
  
  int[] nameLengths = new int[names.length];
  for(int d = 0; d < names.length; d++){
      nameLengths[d] = names[d].length();
  }
  System.out.println(Arrays.toString(nameLengths));
  
// Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. 
  int sum = 0;
  for(int inte = 0; inte < nameLengths.length; inte++) {
    sum += nameLengths[inte];
  }
  System.out.println(sum);

  }
// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
// (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    public static String repeatWord(String word, int nTimes) {
      
      String newStr = "";
      for (int i = 0; i < nTimes; i++) {
          newStr += word;
      }
      return newStr;
    }
    public static void main1(String[] args) {
      int nTimes;
      String word;
      word = "Hello";
      nTimes = 3;
      System.out.println(repeatWord(word,nTimes));
    }
      
// Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the 
// last name as a String separated by a space).
    static String fullName(String firstName, String lastName) {
      return firstName + " " + lastName;
    }
    public static void main2(String[] args) {
      String firstName = "Sally";
      String lastName = "Smith";
      System.out.println(firstName + lastName);
    }
// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    static boolean greaterThanHundred(int[] numbers) {
      int sumOfAll = 0;
     
      for(double number : numbers) {
        sumOfAll += number;
      }
      if(sumOfAll > 100) {
        return true;
      }
      return false;
    }
  
// Write a method that takes an array of double and returns the average of all the elements in the array.
    public static double findAverage(double[] arr) {
       double sum = 0;
       for (double number : arr) {
        sum += number;
       }
       return sum / arr.length;
       }
    
// Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than 
// the average of the elements in the second array.
    static boolean avgArr(double[] arr1, double[] arr2) {
      double sum1 = 0; 
      for(double number1 : arr1) {
        sum1 += number1;
      }
      
      double sum2 = 0;
      for(double number2 : arr2) {
        sum2 += number2;
      }
      
      double avg1 = sum1 / arr1.length;
      double avg2 = sum2 / arr2.length;
      
      if(avg1 > avg2) {
        return true;
      }
      return false;
    }
  
// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot 
// outside and if moneyInPocket is greater than 10.50.
    @SuppressWarnings("unused")
    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      boolean isHotOut = true;
      double numb = 0;
      
      if(isHotOut = true && numb > 10.50) {
        return true;
      }
      return false;
    }
  
// Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    
    static boolean passwordsUpdateTooOften(String pass) { // this method is used to see if your password meets the basic requirements.
      if (pass.length() >= 10 &&                          // I'm a nurse and have to update my password every 3 months and it requires 
          (pass.contains("!") ||                          // getting creative with how to submit something new, remember it, and have
           pass.contains("$") &&                          // it meet all the requirements. Plus, it can't be repeated for 3 years.
           pass.contains("%") ||                          // However, I couldn't figure out how to code that in there with the timing of 3 yrs. 
           pass.contains("&"))) {                         // At first when I tried it was a list of passwords I had used to say if the pass
               return true;                               // contains words from this list return false, but was unsure how to put the time
           }                                              // constraint in there. 
      return false;
    }



}


