import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int hap=0;
        int i=0;
        Queue <Integer> q = new LinkedList<>();
        for(int z=0;z<bridge_length;z++){
            q.add(0);
        }
        while(true){
            answer++;
            if(q.peek()!=0)
                hap-=q.poll();
            else
                q.poll();
            if(truck_weights[i]+hap<=weight){
                hap+=truck_weights[i];
                q.add(truck_weights[i]);
                i++;
                if(i==truck_weights.length){
                    answer+=bridge_length;
                    break;}
                }
            else{
                q.add(0);
            }
        }
        return answer;
    }
}