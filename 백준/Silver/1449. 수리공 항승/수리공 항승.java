import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
	    int l=stdin.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=stdin.nextInt();
	    }
	    Arrays.sort(arr);
	    int t=l;
	    int r=arr[0];
	    int count=1;
	    for(int i=1;i<n;i++){
	        if(t>arr[i]-r){
	            t-=arr[i]-r;
	        }
	        else{
	            count++;
	            t=l;
	        }
	        r=arr[i];
	    }
	    System.out.println(count);
		}
}