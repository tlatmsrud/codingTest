package codingTest.step2;

import java.util.Arrays;

public class FunctionDevelopment {

	public static void main(String[] args) {
		
		int[] progresses = {95, 90, 99, 99, 80, 99}; 
		int[] speeds = {1, 1, 1, 1, 1, 1}; 
		int[] answer = new int [100];
		int answerCnt = 0;
		int deployCnt = 0;
		 
	    int[] spendTimes = new int[progresses.length];
	        
	    for(int i = 0 ; i < progresses.length ; i++) { 
	    	spendTimes[i] = (int) Math.ceil((100.0 - progresses[i])/speeds[i]);
		}

	    int targetTime = spendTimes[0];
	    for(int time : spendTimes) {
	    	if(targetTime >= time) {
	    		deployCnt++;
	    	}else {
	    		answer[answerCnt++] = (deployCnt);
	    		deployCnt = 1;
	    		targetTime = time;
	    	}
	    }
	    
	    if(deployCnt != 0) {
	    	answer[answerCnt++] = (deployCnt);
	    }
	    answer = Arrays.copyOfRange(answer, 0, answerCnt);
	    for(int a : answer) {
	    	System.out.println(a);
	    }
	}
}


