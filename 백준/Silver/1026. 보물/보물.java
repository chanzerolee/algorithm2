import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    int arr1[]=new int[n];
	    int arr2[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr1[i]=stdin.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        arr2[i]=stdin.nextInt();
	    }
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    int S=0;
	    for(int i=0;i<arr1.length;i++){
	        S+=arr1[i]*arr2[n-1];
	    n--;
	    }
	    
	    
	    System.out.println(S);
	}
}