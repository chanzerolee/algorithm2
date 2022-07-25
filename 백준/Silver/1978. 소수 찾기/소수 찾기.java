import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    int a=stdin.nextInt();
	   	int count=0;
	    for(int i=0;i<a;i++){
	   	   int n=stdin.nextInt();
	   	   if(n==1) {
	   	     continue;
	   	   }
	   	   int z=0;
	   	   for(int j=2;j<n;j++){
	   	       if(n%j==0){
	   	           z++;
	   	           break;
	   	       }
	   	   }
	   	   if(z==1)
	   	        continue;
	   	   count++;
	    }
	    System.out.println(count);
	}
}