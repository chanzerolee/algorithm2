import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int a=stdin.nextInt();
	    int b=stdin.nextInt();
	    String arr[]=new String[a];
	    for(int i=0;i<a;i++)
	        arr[i]=stdin.next();
	    String s="";
	    int hap=0;
	    for(int i=0;i<b;i++){
	        int al[]=new int[4];
	        for(int j=0;j<a;j++){
	            if(arr[j].charAt(i)=='T'){
	                al[3]++;
	            }else if(arr[j].charAt(i)=='A'){
	                al[0]++;
	            }else if(arr[j].charAt(i)=='C'){
	                al[1]++;
	            }else{
	                al[2]++;
	            }
	        }
	        int max=al[0];
	        int index=0;
	        for(int j=1;j<al.length;j++){
	            if(max<al[j]){
	                max=al[j];
	                index=j;
	            }
	        }
	        if(index==0)
	            s+="A";
	        else if(index==1)
	            s+="C";
	        else if(index==2)
	            s+="G";
	        else
	            s+="T";
	        hap+=a-max;
	    }
	    System.out.println(s+"\n"+hap);
	}
}