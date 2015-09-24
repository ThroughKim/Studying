package DotComGame;
import java.util.ArrayList;

public class DotComBust {
	//사용할 변수를 선언하고 초기화
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuess = 0;
	
	//DotCom객체 생성, 초기화, 이름과 위치까지 지정해주는 메소드
	void setUpGame(){
		//DotCom객체 세개를 생성후 이름을 지정하고 어레이리스트에 저장
		DotCom one = new DotCom();
		one.setTitle("naver.com");
		DotCom two = new DotCom();
		two.setTitle("daum.net");
		DotCom three = new DotCom();
		three.setTitle("nate.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		//유저에게 게임방법을 설명
		System.out.println("당신은 세 닷컴을 침몰시켜야합니다.");
		System.out.println("각각 네이버, 다음, 네이트입니다.");
		System.out.println("최소한의 추측으로 모든 닷컴을 침몰시켜보세요.");
		
		for (DotCom dotComSet : dotComList) {							//모든 DotCom객체에 대하여
			ArrayList<String> newLocation = helper.placeDotCom(3);		//DotCom의 위치를 지정해주는 보조메소드를 호출
			dotComSet.setLocationCells(newLocation);					//DotCom객체의 세터 메소드 호출하여 받아온 위치를 저장함
		}
	}
	//모든 객체가 없어질때까지 유저의 추측위치를 받아들이고 유저의 입력을 체크 하는메소드를 호출하는 메소드
	void startPlaying(){
		while(!dotComList.isEmpty()){									//DotCom목록이 비어있지 않을경우(모든닷컴이 침몰하지않앗을때)
			String userGuess = helper.getUserInput("좌표를 입력해 주십시오.");//유저에게 입력을 받는다
			checkUserGuess(userGuess);									//checkUserGuess 메소드를 호출
		}
		finishGame();													//게임종료메소드 호출
	}
	// 남아있는 DotCom객체에대해 순환문을 돌리면서  DotCom객체의 checkYourself메소드를 호출하는 메소드
	void checkUserGuess(String userGuess){
		numOfGuess++;													//입력을 한번받을때마다 한번 실행되므로 추측갯수를 하나 증가
		String result = "miss";											//특별한 변환 없을 시 miss를 출력
		
		for (DotCom dotComSet : dotComList){							//목록에 있는 모든  DotCom객체에 대하여 반복
			result = dotComSet.checkYourself(userGuess);				//DotCom객체에 유저가 입력한 위치가 맞는지 또는 죽었는지 물어봄
			if (result.equals("hit")){									
				break;													//추측이 맞으면 순환문을 빠져나옴
			}
			if (result.equals("kill")){										
				dotComList.remove(dotComSet);							//죽은 객체는 목록에서 제외하고 순환문을 빠져나옴
				break;
			}
		}
		System.out.println(result);										//결과를 출력해줌
	}
	//모든 객체를 소멸할 시 플레이어의 성적을 알려주는 메소드
	void finishGame(){
		System.out.println("모든 닷컴이 죽었습니다.");							//종료 메세지 출력과 성적 출력
		if (numOfGuess <= 18){
			System.out.println("당신은 "+numOfGuess+"번 만에 정답을 맞추셨습니다. GOOD");
		}
		else {
			System.out.println("당신은 정답을 맞추는데 "+numOfGuess+"번이나 추측했습니다. 저조한 성적이네요");
		}
	}
	//실제로 게임을 실행하는 메인메소드
	public static void main(String[] args){
		DotComBust game = new DotComBust();								//게임객체를 생성함
		game.setUpGame();												//게임객체의 게임 셋업과 게임시작 메소드를 실행함
		game.startPlaying();
	}
	
}
