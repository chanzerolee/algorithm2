import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args){
        Scanner stdin=new Scanner(System.in);
        String x=stdin.next();
        String y=stdin.next();
        BigInteger a=new BigInteger(x);
        BigInteger b=new BigInteger(y);
        System.out.println(a.add(b));    }
}