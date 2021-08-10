import java.util.Scanner;
public class Qes2 {
    public static void main(String[] args) {
        int odd=0,even=0,n,rem=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=n;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(rem%2==0)
                even=even+rem;
            else
                odd=odd+rem;
        }
        if(even==odd)
            System.out.println(m+" is a probable topper number");
        else
            System.out.println(m+" is not a probable topper number");

    }
}
