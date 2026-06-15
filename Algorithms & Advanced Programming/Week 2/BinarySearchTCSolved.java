import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


class BinarySearchTC{

    public static boolean binarySearch(int[] data, int target, int low, int high){
       //check the base case
            //return statement
        if (low > high) {
            return false;
        } else{
                //get the mid value
                int mid = (low + high +1) / 2;
                if (target == data[mid])
                    return true;
                else if(target < data[mid])
                    return binarySearch(data, target, low, (mid - 1));
                else {
                    return binarySearch(data, target, mid + 1, high);
                }
                    //recursive call

            }
     }

     public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            SecureRandom generator = new SecureRandom();

            int[] data = generator.ints(9, 1, 99).sorted().toArray();
            System.out.printf("%s%n", Arrays.toString(data));

            System.out.println("Please enter an integer value(-1 to quit)");
            int searchInt = input.nextInt();

            while(searchInt != -1){
            
            boolean result = binarySearch(data, searchInt, 0, data.length - 1);
            
                if(result) {
                    System.out.printf("%d was found %n%n", searchInt);
                } else {
                    System.out.printf("%d was not found%n", searchInt);
                }
                System.out.println("Please enter an integer value(-1 to quit)");
                searchInt = input.nextInt();
            }
     }
}
            
            
     
                
                
            
