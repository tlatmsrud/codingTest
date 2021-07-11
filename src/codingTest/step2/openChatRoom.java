package codingTest.step2;

import java.util.HashMap;
import java.util.Map;

public class openChatRoom {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		int answerLen = 0;
		Map<String,String> nickName = new HashMap<String,String>();
		String[] command = new String[3];
		
		// �г��� ����
		for(String mes : record) {
			command = mes.split(" ");
			
			switch(command[0]) {
				case "Enter" : 
					nickName.put(command[1], command[2]);
					answerLen++;
					break;
				case "Change" : 
					nickName.put(command[1], command[2]);
					break;
				case "Leave" :
					answerLen++;
					break;
			}
		}
		
		String[] answer = new String[answerLen];
		int count = 0;
		
		for(String mes : record) {
			
			command = mes.split(" ");
			
			switch(command[0]) {
				case "Enter" : answer[count++] = nickName.get(command[1]) + "���� ���Խ��ϴ�.";
					break;
				case "Leave" : answer[count++] = nickName.get(command[1]) + "���� �������ϴ�.";
					break;
			}
		}
		
		for( int i = 0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
	}
}
