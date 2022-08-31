 import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s=bf.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int arr[]=new int[m];
	    for(int i=0;i<m;i++){
	        arr[i]=Integer.parseInt(bf.readLine());
	    }
	    Arrays.sort(arr);
	    int max=0;
	    int index=0;
	    int result;
	    for(int i=0;i<m;i++){
	        if(m-i<n)
	            result=arr[i]*(m-i);
	        else
	            result=arr[i]*(n);
	        if(max<result){
	            max=result;
	            index=arr[i];
	        }
	    }
	    bw.write(index+" "+max);
	    bw.flush();
	    bw.close();
	}
}