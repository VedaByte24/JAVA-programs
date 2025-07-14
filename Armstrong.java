import java.util.Scanner;//1^3 + 5^3 + 3^3 = 153
public class Armstrong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0, temp=num,sum=0;
        while(num!=0){
           count++;
           num = num/10;
        }
        num=temp;
        while(num!=0){
            int d = num%10;
            sum = sum + (int)Math.pow(d,count);
            num = num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
