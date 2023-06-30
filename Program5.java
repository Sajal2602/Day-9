import java.util.*;
public class Program5 {
    static int equal(int[] a){
        int s = -1;
        if(a.length<=1)
            return a.length;
        for(int i=1;i<a.length;i++){
            int s1 = 0, s2 = 0;
            for(int j=0;j<i;j++)
                s1+=a[j];
            for(int j=i+1;j<a.length;j++)
                s2+=a[j];
            if(s1==s2)
                s=i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(equal(a)==-1?"There is no equilibrum point.":"The equilibrum index is : "+equal(a));
        sc.close();
    }
}
