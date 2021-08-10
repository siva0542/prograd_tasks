import java.util.Scanner;
public class Qes3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hours = new int[7];
        int totalHours = 0;
        double salary = 0;
        for(int i=0;i<hours.length;i++){
            hours[i] = sc.nextInt();
            totalHours += hours[i];
        }
        for(int i=0;i<hours.length;i++){
            salary = salary+hours[i]*100;
            if(hours[i]>8 && i<6)
                salary = salary+(hours[i]-8)*15;
        }
        if(totalHours>40) salary=salary+(totalHours-40)*25;
        else{
            for(int i=5;i<7;i++) {
                if (i == 0)
                    salary = salary + (hours[i] * 100 * 0.5);
                if (i == 6)
                    salary = salary + (hours[i] * 100 * 0.25);
            }
        }
        System.out.println(salary);
    }
}
