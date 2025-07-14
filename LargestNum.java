import java.util.Scanner;
public class LargestNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lgn=0;//243879
        while(n!=0){
            int d = n%10;
            if(lgn<d){
                lgn=d;
            }
            n = n/10;
        }
        System.out.println("Largest Number is "+lgn);
    }
}
