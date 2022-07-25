import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        int h,m,t;
        Scanner stdin=new Scanner(System.in);
        h=stdin.nextInt();
        m=stdin.nextInt();
        t=stdin.nextInt();
        m+=t;
        if(m>59){
            h+=(m/60);
            m%=60;
        }
        if(h>23)
            h-=24;
        System.out.println(h+" "+m);
    }
}