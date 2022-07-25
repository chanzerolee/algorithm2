import java.util.Scanner;
public class Main{
    static int factorial(int n){
        if(n>0)
            return n*factorial(n-1);
        else 
            return 1;}
	public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int x=stdin.nextInt();
        System.out.println(factorial(x));
	    
	}
}
