import java.util.*;
public class Program2 {
    public static int sum(int[] a, int b){
        int ms = 0, cs = 0, j = 0, c=a.length-1;
        for (int i=0;i<b;i++){
            cs += a[i];
            j++;
        }
        ms = cs;
        while(j!=0){
            j--;
            cs=cs-a[j]+a[c];
            c--;
            if(cs>ms)
                ms=cs;   
        }
        return ms;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the number of elements to be added : ");
        int b = sc.nextInt();
        System.out.println("Largest sum : "+sum(a,b));
        sc.close();
    }
}