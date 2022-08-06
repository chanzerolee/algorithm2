import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        //나의 마일리지와 과목수를 알려준다.
        int n=stdin.nextInt();
        int m=stdin.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            //해당 과목을 듣고싶어하는 인원과 들을 수 있는 강의 수.
            int p=stdin.nextInt();
            int l=stdin.nextInt();
            int arr1[]=new int[p];
            for(int j=0;j<p;j++){
                arr1[j]=stdin.nextInt();
            }
            if(p<l){
                arr[i]=1;
                continue;
            }
            Arrays.sort(arr1);
            arr[i]=arr1[p-l];
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            m-=arr[i];
            if(m<0)
                break;
            count++;
        }
        System.out.println(count);
	    }
}