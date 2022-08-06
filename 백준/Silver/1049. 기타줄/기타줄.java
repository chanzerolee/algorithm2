import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        int su=stdin.nextInt();
        int n=stdin.nextInt();
        int sixmin=10000,onemin=10000;
	    for(int i=0;i<n;i++){
	        int six=stdin.nextInt();
	        int one=stdin.nextInt();
	        if(sixmin>six)
	            sixmin=six;
	        if(onemin>one)
	            onemin=one;
	    }
	    int count=0;
	    while(su>0){
	        if(su*onemin>sixmin&&onemin*6>sixmin){
	            su-=6;
	            count+=sixmin;
	        }
	        else{
	            count+=su*onemin;
	            break;
	        }
	            }System.out.println(count);
	    }
}