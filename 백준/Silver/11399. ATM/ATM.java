import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=stdin.nextInt();
        }
        Arrays.sort(arr);
        int hap=0;
        int a=0;
        for(int i=n-1;i>=0;i--){
            hap+=arr[a]*(i+1);
            a++;
        }
        System.out.println(hap);
	}
}
