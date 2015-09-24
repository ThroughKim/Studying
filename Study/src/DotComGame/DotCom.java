package DotComGame;
import java.util.*;

public class DotCom {
	private String title;							//인스턴스 변수를 선언
	private ArrayList<String> locationCells;
	
	public void setTitle(String title){				//타이틀을 인자로 받아와 설정
		this.title = title;
	}
	
	public void setLocationCells (ArrayList<String> loc){
		locationCells = loc;						//객체의 위치정보를 담은 리스트를 받아와서 저장
	}
	
	//유저의 입력과 자신의 위치가 맞는지 스스로 확인하는 메소드
	public String checkYourself(String userInput){						//유저의 입력을 인자로 받아옴
		String status = "miss";											//별다른 변환이 없으면 miss 를 출력
		int index = locationCells.indexOf(userInput);					//유저가 입력한 값과 일차하는 것이 있는지 확인 있다면 그 인덱스를 리턴하고 없다면 -1을 리턴함
		if (index>0){													//일치하는 값이 있다면
			locationCells.remove(index);								//그 인덱스에 해당하는 값을 지우고
			if (locationCells.isEmpty()){								//만약에 저장된 위치정보가 다 없어진다면(유저가 3개 다 맞출경우)
				status = "kill";										//kill을 리턴한다
				System.out.println("당신은" +title+ "을 침몰시켰습니다!");		//메세지 출력
			}
			else {
				status = "hit";											//그 외에는 유저가 맞춘 경우이기때문에 히트를 리턴
			}
		}
		return status;													//결과값을 리턴한다
	}
}
