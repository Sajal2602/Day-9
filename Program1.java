import java.util.*;
class Program1 {
    public static void remove(int[] a, int r) {
        for (int i=r;i<a.length-1;i++)
            a[i] = a[i+1];
    }
    public static boolean check(int[] a) {
        int s1 = 0, s2 = 0;
        for (int i=0; i<a.length; i++) {
            if (i%2==0)
                s1+=a[i];
            else
                s2+=a[i];
        }
        return s1==s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int s = 0;
        for (int i=0;i<n;i++) {
            int[] c = Arrays.copyOf(a, n);
            remove(c, i);
            c = Arrays.copyOf(c, n-1);
            if (check(c))
                s++;
        }
        System.out.println((s != 0) ? "Number of element to be removed: " + s : "No element found!");
        sc.close();
    }
}