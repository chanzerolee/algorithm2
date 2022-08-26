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
		int hap=0;
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        for(int k=j+1;k<n;k++){
		            if(arr[i]+arr[j]+arr[k]>hap&&arr[i]+arr[j]+arr[k]<=m)
		                hap=arr[i]+arr[j]+arr[k];
		        }
		    }
		}
	    
	    System.out.println(hap);
	}
}