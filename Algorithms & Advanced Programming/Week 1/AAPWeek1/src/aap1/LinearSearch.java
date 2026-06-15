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
import java.security.SecureRandom;
import java.util.Arrays;

public class LinearSearch {

    public static int linearSearch(int data[], int searchKey){
        for(int i = 0; i < data.length; i++){
            //checks if the current data element is equal to the search key{
            if(data[i] == searchKey){
                return i;
            }
        }
        return -1;
    }
    
    //main method
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        
        //declares an array of integers, called data of size 10
        int data [] = new int[10];
        
        for(int i=0; i<data.length; i++){
            data[i] = 10 + generator.nextInt(90);
        }
         
        System.out.printf("%s%n", Arrays.toString(data));
        
        System.out.println("Please enter an integer value (-1 to end): " );
        int searchInt = input.nextInt();
        
        while (searchInt != -1){
            //make a call to the linearsearch method passing the array and search int
            int position = linearSearch(data, searchInt);
            
            //if the position is -1
            if(position == -1)
                System.out.printf("%d was not found %n%n", searchInt);
            else
                System.out.printf("%d was found in position %d%n%n", searchInt, position);
        
            System.out.println("Please enter an integer value (-1 to end): " );
            //get the next input
            searchInt = input.nextInt();
        }
        System.out.println("Adios, you entered -1, Good Bye");
    }
}
    

