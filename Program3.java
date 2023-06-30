import java.util.*;
public class Program3 {
    public static int Operations(int[] a){
        int c = 0, x = 0, y = a.length - 1;
        while(x<=y){
            if(a[x]==a[y]){
                x++;
                y--;
            }
            else{
                a[x]+=1;
                a[y]-=1;
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=(2*i)+1;
        System.out.println("There will be "+Operations(a)+" numbers of operations.");
        sc.close();
    }
}
