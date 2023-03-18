package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
  public static void twisters(){

    for (int i = 11 ; i<= 110 ; i++){
      if (i%2 == 0){
        System.out.print("Tweetle");}
      else { System.out.print(i);}
        if (i%4==0){
          System.out.print("Beetle");}
        else { System.out.print(i);}
          
          if (i%6==0){
            System.out.print("Poodle");}
          else { System.out.print(i);}
      
            
            

            
          
            
          

    }
        }

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
   public static String phoneKeypad(String s){
    s = s.toLowerCase();
    int l = s.length();
    String eh = "";
    for (int i = 0; i< l; i++){
      if (s.charAt(i) == 'a'|| s.charAt(i) == 'b'||s.charAt(i) == 'c'){eh +="2";}

            if (s.charAt(i) == 'd'|| s.charAt(i) == 'e'||s.charAt(i) == 'f'){eh +="3";}

            if (s.charAt(i) == 'g'|| s.charAt(i) == 'h'||s.charAt(i) == 'i'){eh +="4";}

            if (s.charAt(i) == 'j'|| s.charAt(i) == 'k'||s.charAt(i) == 'l'){eh +="5";}

            if (s.charAt(i) == 'm'|| s.charAt(i) == 'n'||s.charAt(i) == 'o'){eh +="6";}

            if (s.charAt(i) == 'p'|| s.charAt(i) == 'q'||s.charAt(i) == 'r' || s.charAt(i)=='s'){eh +="7";}

            if (s.charAt(i) == 't'|| s.charAt(i) == 'u'||s.charAt(i) == 'v'){eh +="8";}

            if (s.charAt(i) == 'w'|| s.charAt(i) == 'x'||s.charAt(i) == 'y'||s.charAt(i)=='z'){eh +="9";}
      continue;
    }
    return eh;
      

      
    }
    public static void main(String [] args) {
      Scanner in = new Scanner(System.in);

        
        

        /* Write your code here */
     
       //call method twisters()
       twisters();
       //prompt user to enter a string 
       System.out.print("Enter a string : ");
       String stringo = in.nextLine();

       
       //call method phoneKeypad(string)
       System.out.print(phoneKeypad(stringo));


    }

}
