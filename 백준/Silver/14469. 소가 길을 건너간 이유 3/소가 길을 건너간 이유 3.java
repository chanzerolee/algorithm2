import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int a=stdin.nextInt();
	    int arr[][]=new int[a][2];
	    for(int i=0;i<a;i++){
	        arr[i][0]=stdin.nextInt();
	        arr[i][1]=stdin.nextInt();
	    }
	    Arrays.sort(arr,new Comparator<int []>(){
	        @Override
	        public int compare(int [] o1,int [] o2){
	            if(o1[0]==o2[0]){
	            return o1[1]-o2[1];
	        }else{
	            return o1[0]-o2[0];
	        }}});
	    int hap=0;
	    for(int i=0;i<a;i++){
	        if(hap>arr[i][0]){
	            hap+=arr[i][1];
	            continue;
	        }
	            
	        hap=arr[i][0]+arr[i][1];
	        
	    }
	    System.out.println(hap);
	}
}