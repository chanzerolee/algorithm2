import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        int a,b,c;
        Scanner stdin=new Scanner(System.in);
        a=stdin.nextInt();
        b=stdin.nextInt();
        c=stdin.nextInt();
        if(a==b&&a==c)
            System.out.println(10000+a*1000);
        else if(a==b)
            System.out.println(1000+a*100);
        else if(a==c)
            System.out.println(1000+c*100);
        else if(b==c)
            System.out.println(1000+b*100);
        else if(a>b&&a>c)
            System.out.println(a*100);
        else if(b>a&&b>c)
            System.out.println(b*100);
        else
            System.out.println(c*100);
     
    }
}