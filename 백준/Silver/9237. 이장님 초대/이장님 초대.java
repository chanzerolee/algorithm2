import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();//묘목 개수
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=stdin.nextInt();   
	    Arrays.sort(arr);
	    int count=0;
	    int index=0;
	    int a=1;
	    int max=arr[n-1];
	    for(int i=n-2;i>=0;i--){
	        count++;
	        if(arr[i]>=max-a){
	            max=arr[i];
	            index=count;
	            a=1;
                continue;
	        }a++;
	    }
	    System.out.println(index+2+max);
	}
}
