import java.util.Scanner;
public class Main{
    public static void main(String [] args){
    	int count=0;
    	Scanner stdin=new Scanner(System.in);
    	int a=stdin.nextInt();
    	count=hansu(a);
    	System.out.println(count);
    }
public static int hansu(int i) {
	int count=0;
	if(i/100!=0)
		while(i>=100) {
			if((i/100)-((i%100)/10)==((i%100)/10)-(i%10)) {
				count++;}
			i--;
		}
	return count+i;
}
}