import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        String s=stdin.next();
        Stack <Character> stack=new Stack<>();
        int count=0;
        int su=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                stack.push(s.charAt(i));
                }
            else{
                if(s.charAt(i-1)==')'){
                count--;
                su+=1;
                stack.pop();
                continue;
                }
                count--;
                su+=count;
                stack.pop();
            }
        }
        System.out.println(su);
	}
}