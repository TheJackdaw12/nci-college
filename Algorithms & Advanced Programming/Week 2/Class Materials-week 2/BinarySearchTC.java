import java.security.SecureRandom;
//import Arrays class
//import Scanner class


class BinarySearchTC{

    public static boolean binarySearch(int[] data, int target, int low, int high){
       //check the base case
            //return statement
        else{
                //get the mid value
                if (target == data[mid])
                    return true;
                else if(target < data[mid])
                    //recursive call
                else
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
                //method call
                if(result)
                    System.out.printf("%d was found %n%n", searchInt);
                else
                    System.out.printf("%d was not found%n", searchInt);

                System.out.println("Please enter an integer value(-1 to quit)");
                searchInt = input.nextInt();

            }
        }
}