import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		String s=stdin.next();
		int bool=-1;
		int arr[]=new int[50];
		for(int i=0;i<s.length();i++){
		    arr[s.charAt(i)-'A']++;
		}
		s="";
		String a="";
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==0)
		        continue;
		    if(arr[i]%2==1){
		        bool++;
		        a+=(char)(i+65);
		    }
		    if(bool>0){
		        s="I'm Sorry Hansoo";
		        break;
		    }
		    for(int j=0;j<arr[i]/2;j++){
		        s+=(char)(i+65);
		    }
		}
		if(s=="I'm Sorry Hansoo")
		    System.out.println(s);
		else{
		    String b=s+a;
		    for(int i=s.length()-1;i>=0;i--){
		        b+=s.charAt(i);
		    }
		    System.out.println(b);
		}
	    }
}