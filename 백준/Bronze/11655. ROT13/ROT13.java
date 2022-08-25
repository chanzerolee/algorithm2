import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        String n=stdin.nextLine();
        String s="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)>96&&n.charAt(i)<123){
                if(n.charAt(i)+13>122){
                    s+=(char)(n.charAt(i)-13);
                    continue;
                }
                s+=(char)(n.charAt(i)+13);
            }
            else if(n.charAt(i)>64&&n.charAt(i)<91){
                if(n.charAt(i)+13>90){
                    s+=(char)(n.charAt(i)-13);
                    continue;
                }
                s+=(char)(n.charAt(i)+13);
            }
            else{
                s+=n.charAt(i);
                continue;}
        }
        System.out.println(s);
	}
}
