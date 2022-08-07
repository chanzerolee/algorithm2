import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        //나의 마일리지와 과목수를 알려준다.
        int topping=stdin.nextInt();
        int dprice=stdin.nextInt();
        int tprice=stdin.nextInt();
        int dy=stdin.nextInt();
        int arr[]=new int[topping];
        for(int i=0;i<topping;i++)
            arr[i]=stdin.nextInt();
        Arrays.sort(arr);
        int one=dy/dprice;
        int totalprice=dprice;
        int totalkcal=dy;
        for(int i=0;i<topping;i++){
            totalprice+=tprice;
            totalkcal+=arr[topping-1-i];
            int total=totalkcal/totalprice;
            if(one>total)
                break;
            else
                one=total;
        }
        System.out.println(one);
	    }
}