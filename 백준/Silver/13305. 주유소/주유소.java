import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	    int n=Integer.parseInt(bf.readLine());
	    BigInteger s[]=new BigInteger [n-1];
	    BigInteger l[]=new BigInteger [n];
	    StringTokenizer st=new StringTokenizer(bf.readLine());
	    for(int i=0;i<n-1;i++){
	        s[i]=new BigInteger(st.nextToken());
	    }
	    st=new StringTokenizer(bf.readLine());
	    for(int i=0;i<n;i++){
	        l[i]=new BigInteger(st.nextToken());
	        }
	    BigInteger min=l[0];
	    BigInteger count=min.multiply(s[0]);
	    for(int i=1;i<n-1;i++){
	        if(l[i].compareTo(min)<0){
	            count=count.add(l[i].multiply(s[i]));
	            min=l[i];}
	        else {
	            count=count.add(min.multiply(s[i]));
	        }
	    }
	    bw.write(count+"\n");
	    bw.flush();
	    bw.close();
	}
}