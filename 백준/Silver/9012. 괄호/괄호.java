import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        int n=stdin.nextInt();
        String a="";
        for(int i=0;i<n;i++){
        int count=0;
        Stack<Character> stack=new Stack<>();
            String s=stdin.next();
            for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='('){
                count++;
                stack.push(s.charAt(j));
            }
            else{
                count--;
                if(count<0){
                    break;
                }
                stack.pop();
            }
        }
        if(count!=0){
            a="NO";
        }
        else
            a="YES";
        while(!stack.isEmpty()){
            stack.pop();
        }
        System.out.println(a);
        }
	}
}