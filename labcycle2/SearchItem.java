import java.util.*;

class SearchItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Beema Salim");
         System.out.println("23MCA024"); 
         System.out.println("26/02/24");
         System.out.println("2.Search an element in an array.");
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) { // Corrected loop start index
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to search:");
        int toSearch = in.nextInt();
        int flag = 0;
        int i;
        for (i = 0; i < size; i++) { // Corrected loop start index
            if (arr[i] == toSearch) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(toSearch + " found at position " + (i + 1)); // Corrected position
        } else {
            System.out.println("Element not found");
        }
    }
}
