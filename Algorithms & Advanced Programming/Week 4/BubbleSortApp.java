class BubbleSortApp{
    
    public static void bubbleSort(int[] array){  
        int n = array.length;  
	int temp = 0;  
        boolean swapped;
        
	for(int i=0; i < n; i++){  
            swapped = false;
            System.out.println("Sort Pass Number "+(i+1)); 
            for(int j=1; j < (n-i); j++){  
		System.out.print("Compare "+ array[j-1]+ " and " + array[j]);    
		if(array[j-1] > array[j]){   
                    System.out.println(", incorrect order, Swap");  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp; 
                    swapped = true;
				    
                    System.out.println("Array After Swap");
                    printArray(array);
		}
                else{       
                    System.out.println(", correct order");     
                }  
            }  
            
            if (!swapped) {
            System.out.println("No swaps");
            break;}
	}
    } 
 		
    public static void printArray(int[] array){  
        for(int i=0; i < array.length; i++){  
            System.out.print(array[i] + " ");  
	} 
	System.out.println();
    }

    public static void main(String[] args){  
	int arr[] ={13, 4, 24, 10, 3, 33, 28, 52, 6}; 
                 
	System.out.println("---Array BEFORE Bubble Sort---"); 
	printArray(arr);
 
	bubbleSort(arr);
 
	System.out.println("---Array AFTER Bubble Sort---");  
		
	printArray(arr); 
 
    }  
}
