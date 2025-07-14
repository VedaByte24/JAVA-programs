import java.util.Scanner;
class revNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String nstr = new String(sb);
        int nInt = Integer.parseInt(nstr);
        System.out.println(nInt);
    }
}