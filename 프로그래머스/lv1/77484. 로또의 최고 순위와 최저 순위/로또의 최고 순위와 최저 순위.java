import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int i=0;
        int zeroNum=0;
        
        for(i=0;i<6;i++){
            if(lottos[i]==0){
                zeroNum++;
            }
            else
                break;
        }
        
        int correctNum=0;
        for(i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(lottos[i]==win_nums[j]){
                    correctNum++;
                    break;
                }
            }
        }
        //System.out.println(correctNum+" "+zeroNum);
        answer[0]=7-(correctNum+zeroNum);
        answer[1]=7-correctNum;
        if(answer[0]>6){
            answer[0]=6;
        }
        if(answer[1]>6){
            answer[1]=6;
        }
        return answer;
    }
}