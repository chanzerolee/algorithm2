import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		String s=stdin.next();
	    Stack <Character> stack=new Stack<>();
	    for(int i=0;i<s.length();i++){
            if(s=="P")
                break;
	        stack.push(s.charAt(i));
	        if(s.charAt(i)=='A'){
	            if(stack.size()>=3){
	                stack.pop();
	                stack.pop();
	                stack.pop();
	            }
	            else{
	                s="NP";
	            }
	        }
	        if(i==s.length()-1&&s.charAt(i)=='P'){
	            stack.pop();
	        }
            else if(i==s.length()-1&&s.charAt(i)!='P'){
	            s="NP";
	            break;
	        }
	        }
	    if(s=="NP") 
	        System.out.println("NP");
	    else if(stack.isEmpty())
	        System.out.println("PPAP");
	    else 
	        System.out.println("NP");
		}
}