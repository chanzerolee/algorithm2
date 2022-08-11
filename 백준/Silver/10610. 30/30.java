import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
	    String a=stdin.next();
	    int arr[]=new int[a.length()];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=Character.getNumericValue(a.charAt(i));
	    }
	    Arrays.sort(arr);
	    int count=0;
	    String s="";
	    for(int i=0;i<arr.length;i++){
	        count+=arr[i];
	    }
	    for(int i=arr.length-1;i>=0;i--){
	        s+=arr[i];
	    }
	    if(arr[0]!=0||count%3!=0){
	        System.out.println(-1);
	    }else{
	        System.out.println(s);
	    }
	}
}