

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;

class LinearSearchTC{

    public static int linearSearch(int data[], int searchKey){
        for(int i=0; i<data.length; i++){
            //checks if the current data element is equal to the search key{
                return i;
            }
        }
        //return -1
    }

    //main method
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        //declares an array of integers, called data of size 10
        
        for(int i=0; i<data.length; i++){
            data[i] = 10 + generator.nextInt(90);
        }
         
        System.out.printf("%s", Arrays.toString(data));
        
        System.out.println("Please enter an integer value (-1 to end): " );
        int searchInt = input.nextInt();
        
        //while searchInt is not -1{
            int position = //make a call to the linearsearch method passing the array and search int
            //if the position is -1
                System.out.printf("%d was not found %n%n", searchInt);
            else
                System.out.printf("%d was found in position %d%n%n", searchInt, position);
        
            System.out.println("Please enter an integer value (-1 to end): " );
            //get the next input
        }
    }
}