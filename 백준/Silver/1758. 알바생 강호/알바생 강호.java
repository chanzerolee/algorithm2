import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
	    int a=stdin.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=stdin.nextInt();
	    }
	    Arrays.sort(arr);
	    int m=0;
	    long count=0;
	    for(int i=a-1;i>=0;i--){
	        if(arr[i]-m>0){
	            count+=arr[i]-m;
	            m++;
	        }
	    }
	    System.out.println(count);
	    }
}