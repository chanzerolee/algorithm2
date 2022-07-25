import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner stdin=new Scanner(System.in);
        int a=stdin.nextInt();
        int b=stdin.nextInt();
        boolean c[]=new boolean[b];
        c[0]=true;
        for(int k=0;k<c.length;k++){
            c[k]=false;
        }
        int count=-1;
        for(int i=2;i<=b;i++){
            count++;
            if(c[count])
                continue;
            for(int j=2;j<=b;j++){
                if(j*i<=b){
                c[i*j-2]=true;
                }
                else{
                    break;
                }
            }
        }
        if(a==1)
            a=2;
        for(int i=a;i<=c.length;i++){
            if(!c[i-2])
                System.out.println(i);
        }
    }
}