import java.util.*;
public class Program6 {
    static int[] pro(int[] a){
        int[] p = new int[a.length];
        for(int i=0;i<a.length;i++){
            p[i]=1;
            for(int j=0;j<i;j++)
                p[i]*=a[j];
            for(int j=i+1;j<a.length;j++)
                p[i]*=a[j];
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements :");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Product : ");
        for(int i : pro(a))
            System.out.print(i+" ");
        sc.close();
    }
}
