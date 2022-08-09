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
	    if(a%2==1){
	        System.out.println(arr[a/2]);
	    }else{
	        System.out.println(arr[a/2-1]);}
	    }
}