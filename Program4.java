import java.util.*;
public class Program4 {
    static int sum(int[] a, int x, int y){
        int s = 0;
        for(int i=x;i<=y;i++)
            s+=a[i];
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the starting and ending index : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum : "+sum(a,x,y));
        sc.close();
    }
}
