import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
        stdin.nextLine();
        for(int i=0;i<n;i++){
            String s=stdin.nextLine();
            String z="";
            StringBuffer r=new StringBuffer();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    z+=r.reverse().toString();
                    r.delete(0,r.length());
                    z+=' ';
                    continue;
                }
                r.append(s.charAt(j));
            }
            z+=r.reverse().toString();
            r.delete(0,r.length());
            System.out.println(z);
        }
	}
}