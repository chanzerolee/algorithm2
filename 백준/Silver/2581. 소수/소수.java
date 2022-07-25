import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    int m=stdin.nextInt();
        int n=stdin.nextInt();
        int sum=0;
	   	int min=0;
	   	int count=0;
	   	for(int i=m;i<=n;i++){
	   	    int b=0;
	   	    for(int j=2;j<i;j++){
	   	        if(i%j==0){
	   	            b++;
	   	            break;
	   	        }}
	   	    if(b==1||i==1){
	   	        continue;}
	   	        sum+=i;
	   	        count++;
	        if(count==1)
	            min=i;
	   	}
	   	if(min==0)
	   	    System.out.println(-1);
	   	else{
	   	System.out.println(sum);
	   	System.out.println(min);
	}}
}