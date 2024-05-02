import java.util.*;

class SortString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Beema Salim");
         System.out.println("23MCA024"); 
         System.out.println("26/02/24");
         System.out.println("1.Program to Sort strings\n");
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        String[] str = new String[size];
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            str[i] = in.next();
        }
        Arrays.sort(str);
        System.out.println("Sorted strings:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(str[i]);
        }
     
    }
}

