import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        //n/2 최댓값
        int length=nums.length/2;
        //숫자 정렬
        Arrays.sort(nums);
        int max=nums[0];
        int count=1;
        int answer = 0;
        //겹치는 번호 제외
        for(int a=1;a<nums.length;a++){
            if(max==nums[a]){
                continue;}
                max=nums[a];
            count++;
        }
        //최댓값보다 작게 끝 그 배열 길이
        if(count<length)
            answer=count;
        else
            answer=length;
            
        return answer;
    }
}