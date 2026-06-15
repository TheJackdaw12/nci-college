package RecursiveLinear;

import java.util.Scanner;
import java.util.Random;


public class GuessingGame {

//Recursive Linear Search Method
public static boolean linearSearch(int[] arr, int guess, int index){

    if (index >= arr.length) {
        return false;
    }

    if (arr[index] == guess){
        return true;
    }
    
    return linearSearch(arr, guess, index + 1);    
}    

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    
    
int [] magicNumbers = new int[10];
for (int i = 0; i < magicNumbers.length; i++) {
magicNumbers[i] = rand.nextInt(100) + 1;
}

System.out.print("Welcome to the Magic Number Game ");
for (int n : magicNumbers)
{}
System.out.println("\n");


System.out.print("Guess a number 1-100: ");
int guess = scanner.nextInt();


boolean found = linearSearch(magicNumbers, guess, 0);


if (found) {
    System.out.println("Congratulations! " + guess + " is a magic number!");
} else {
    System.out.println("Sorry, " + guess + " is not a magic number");
}

scanner.close();
}
}
