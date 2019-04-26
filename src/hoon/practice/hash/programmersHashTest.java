package hoon.practice.hash;

import java.util.Arrays;

public class programmersHashTest {
	static String[] participants = {"mislav", "stanko", "mislav", "ana"};
	static String[] completion = {"stanko", "ana", "mislav"};
	public static void main(String[] args) {
		System.out.println(solution2(participants, completion));
	}
	public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        completion=Arrays.copyOf(completion, completion.length + 1);
        completion[completion.length-1] = "}";
        Arrays.sort(participant);
        Arrays.sort(completion);
        System.out.println("participant:"+Arrays.toString(participant));
        System.out.println("completion:"+Arrays.toString(completion));
        for(int cnt=0;cnt<completion.length;cnt++)
            if(!participant[cnt].equals(completion[cnt]) )
            {
            	answer=participant[cnt];
            	break;
            }
        return answer;
    }

}
