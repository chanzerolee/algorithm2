import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner stdin=new Scanner(System.in);
        int a=stdin.nextInt();
        for(int i=2;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
                a/=i;
                i--;
            }
        }
    }
}