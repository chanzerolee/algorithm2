import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        //사전 순서;
        Arrays.sort(participant);
        Arrays.sort(completion);
        //컴플리션 길이 중에 겹치면 리턴 안겹치면 마지막 이름 리턴
        for(int a=0;a<completion.length;a++){
            if(!completion[a].equals(participant[a]))
                return participant[a];
        }
        return participant[completion.length];
    }
}