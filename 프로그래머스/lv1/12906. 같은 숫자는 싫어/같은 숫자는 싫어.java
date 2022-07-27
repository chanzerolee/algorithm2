import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List <Integer> list=new ArrayList<>();
        int a=arr[0];
        list.add(a);
        for(int i=1;i<arr.length;i++){
            if(a!=arr[i]){
                a=arr[i];
                list.add(a);
            }
        }
        answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}