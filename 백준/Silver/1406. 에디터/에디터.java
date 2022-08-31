import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack <Character> stack=new Stack<>();
        String n=bf.readLine();
        int a=Integer.parseInt(bf.readLine());
        for(int i=0;i<n.length();i++)
            stack.push(n.charAt(i));
        StringBuffer b=new StringBuffer("");
        for(int i=0;i<a;i++){
            String s =bf.readLine();
            switch (s.charAt(0)){
                case 'L':
                    if(stack.empty())
                        continue;
                    b.insert(b.length(),stack.pop());
                    break;
                case 'D':
                    if(b.length()==0)
                        continue;
                    stack.push(b.charAt(b.length()-1));
                    b.deleteCharAt(b.length()-1);
                    break;
                case 'P':
                    stack.push(s.charAt(2));
                    break;
                case 'B':
                    if(stack.empty())
                        continue;
                    stack.pop();                        
                    break;
            }
        }
        while(!stack.empty()){
            b.insert(b.length(),stack.pop());
        }b.reverse();
        System.out.println(b);
	}
}