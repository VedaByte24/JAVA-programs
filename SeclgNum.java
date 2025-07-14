import java.util.Scanner;
public class SeclgNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lg=0, sl=0;
        while(n!=0){
            int d = n%10;
            if(d>lg){
                lg=d;
            }
            else if(d<lg && sl<d){
                sl=d;
            }
            n = n/10;
        }
        System.out.println("Second largest No. "+sl);
    }
}
