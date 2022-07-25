import java.util.Scanner;
public class Main
{
    static int fv(int a,int b,int c){
        if(a!=0){
            int temp=c;
            c+=b;
            b=temp;
            a--;
            return fv(a,b,c);
        }else{
        return c;}
    }
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int x=stdin.nextInt();
	    int y=0,z=1;
	    if(x==0)
	        System.out.println("0");
	   else
	    System.out.println(fv(x-1,y,z));
	}
}
