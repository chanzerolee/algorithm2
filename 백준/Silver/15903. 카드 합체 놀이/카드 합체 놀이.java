import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    int add=stdin.nextInt();
	    long arr[]=new long[n];
	    for(int i=0;i<n;i++){
	        arr[i]=stdin.nextInt();
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<add;i++){
	        long a=arr[0]+arr[1];
	        arr[0]=a;arr[1]=a;
	        Arrays.sort(arr);
	    }
	    long count=0;
	    for(long i:arr){
	        count+=i;
	    }
	    System.out.println(count);
	}
}