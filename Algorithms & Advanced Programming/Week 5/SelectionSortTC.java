class SelectionSortTC{
    public static void sort(//include rquired paramters){
      
        int temp=0;
        for (int i = 0; i < //boolean expression; i++){
            
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (//condition)
                    minIndex = //?;
            }
            
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            //missing assignment statement

            System.out.println("After pass: " + (i+1));
            //make a call to the printArray method
        }
    }
 
    public static void printArray(int arr[]){
        
        for (int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
    public static void main(String args[]){
        
        int arr[] = {13,4,24,10,3, 33, 28, 52, 6};
        System.out.print("Unsorted array: ");
        printArray(arr);
        
        //make a call to the selection sort method

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}