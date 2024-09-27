import java.util.Scanner;
public class CompatibleArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        
        while (--n1 >= 0)
            nums1[n1] = sc.nextInt();            

        int n2 = sc.nextInt();

        if (n1 != n2) {
            System.out.println("Incompatible");
            return;
        }
        
        int[] nums2 = new int[n2];
        
        while (--n2 >= 0)
            nums2[n2] = sc.nextInt();

    


    }
}
