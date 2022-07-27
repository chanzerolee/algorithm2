import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
        int[] answer = {};
        int num=0;
        while(num<=progresses.length-1){
            int count=0;
            for(int i=num;i<progresses.length;i++){
                progresses[i]+=speeds[i];
            }
            if(progresses[num]>=100){
                count++;
                num++;
                for(int i=num;i<progresses.length;i++){
                    if(progresses[i]>=100){
                        num++;
                        count++;
                    }
                    else 
                     break; 
                 }
                  list.add(count);
            }
        }
        answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}