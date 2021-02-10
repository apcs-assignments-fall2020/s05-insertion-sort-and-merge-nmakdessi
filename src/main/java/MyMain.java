import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++){
            int temp = list.at(i);
            if (list.isEmpty() == true){
                sorted.add(temp);
            }
            else{
                for (int j = 0; j < sorted.size(); j++){
                    if (temp < sorted.at(j)){
                        sorted.add(j, temp);
                        break;
                    }
                    else if (j == sorted.size()-1){
                        sorted.add(temp);
                        break;
                    }
                }
            }
        }

        return sorted;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] arr3 = new int[arr1.length + arr2.length];
        int count1 = 0;
        int count2 = 0;
        while (count1 < arr1.length && count2 < arr1.length){
            
            if (arr1.length == count1){
                arr3[count1 + count2] = arr2[count2];
                count2++;
            }
            else if (arr2.length == count2){
                arr3[count1 + count2] = arr1[count1];
                count1++;
            }        
            else if (arr1[count1] <= arr2[count2]){
                arr3[count1 + count2] = arr1[count1];
                count1++;
            }
            else if (arr1[count1] > arr2[count2]){
                arr3[count1 + count2] = arr2[count2];
                count2++;
            }

        }
        return arr3; 
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
