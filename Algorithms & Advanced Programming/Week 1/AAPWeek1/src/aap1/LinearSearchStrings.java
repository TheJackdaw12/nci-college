/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aap1;

/**
 *
 * @author jcanning
 */
    

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchStrings {

    public static int linearSearchStrings(String data[], String searchKey){
        for(int i = 0; i < data.length; i++){
            //checks if the current data element is equal to the search key{
            if(data[i].equalsIgnoreCase(searchKey)) { //case sensitive
                return i;
            }
        }
        return -1;
    }
    
    //main method
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        //declares an array of integers, called data of size 10
        String data [] = {"Anna", "Bob", "Charlie", "David", "Enda", "Frank"};
        
        //Print list
        System.out.printf("Guest List: %s%n", Arrays.toString(data));
        
        //Ask for a name         
        System.out.println("Please enter an name to check if it is on the Guest List");
        String searchStr = input.next();
        
        
            //Call the search
            int position = linearSearchStrings(data, searchStr);
            
            //Output
            if(position == -1)
                System.out.printf("%s was not found, Sorry you are not invited.%n", searchStr);
            else
                System.out.printf("%s was found in position %s. Congratulations - you are on the guest list!%n", searchStr, position);
        
            }
            
        }
    
    

