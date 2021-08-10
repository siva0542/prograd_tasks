import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] seat=new int[3];
        int n,sol=0;
        boolean res=false;
        Scanner sc=new Scanner(System.in);
        int m=Integer.MAX_VALUE;
        for(int i=0;i<3;i++)
            seat[i]=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<3;i++){
            if(n <= seat[i] && seat[i] - n < m){
                m=seat[i]-n;
                sol=i+1;
                res=true;
            }
        }
        if(res)
            System.out.println("Lab "+sol+" is best suitable");
        else
            System.out.println("No Labs are suitable");
    }
}
