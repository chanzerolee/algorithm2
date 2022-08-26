import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n=stdin.nextInt();
		int m=stdin.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=stdin.nextInt();
		}
		int max=0;
	    int a=0;
	    int b=1;
	    int c=2;
	    while(a<n-3){
	        if(b==n-2){
	            a++;
	            b=a+1;
	            c=b+1;
	        }
	        else if(c==n-1){
	            b++;
	            c=b+1;
	        }
	        if(arr[a]+arr[b]+arr[c]<=m&&max<arr[a]+arr[b]+arr[c]){
	            max=arr[a]+arr[b]+arr[c];
	        }
	        c++;
	    }
	    System.out.println(max);
	}
}