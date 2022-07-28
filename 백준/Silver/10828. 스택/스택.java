import java.util.Scanner;
public class Main
{   public static int size=0;
    public static int s[];
    public static void push(int i){
        s[size]=i;
        size++;
    }
    public static int pop(){
        if(size<=0)
            return -1;
        else{
            size--;
            int res=s[size];
            s[size]=0;
            return res;
        }
            
    }
    public static int empty(){
        if(size==0)
            return 1;
        else
        return 0;
    }
    public static int size(){
        return size;
    }
    public static int top(){
        if(size==0)
            return -1;
        return s[size-1];
    }
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    StringBuilder ss=new StringBuilder();
	    s=new int[n];
	    String s;
	    for(int i=0;i<n;i++){
            s=stdin.next();
	        switch (s){
	            case "push":
	                push(stdin.nextInt());
	                break;
	           case "pop":
	               ss.append(pop()).append('\n');
	               break;
	           case "size":
	               ss.append(size()).append('\n');
	               break;
	           case "empty":
	               ss.append(empty()).append('\n');
	               break;
	           case "top":
	               ss.append(top()).append('\n');
	               break;
	        }
	    }
	    System.out.println(ss);
	}
}