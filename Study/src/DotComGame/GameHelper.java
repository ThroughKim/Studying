package DotComGame;

import java.io.*;
import java.util.*;

public class GameHelper {

	//인스턴스 변수를 선언 및 초기화
	private static final String alphabet = "abcdefg";  						//알파벳(좌표표시용)을 설정
	private int gridLength = 7;												//그리드의 길이를 7x7로 설정
	private int gridSize = 49;												//전체 사이즈를 49개로 설정
	private int[] grid = new int[gridSize];									//그리드사이즈만한 배열을 생셩
	private int comCount = 0;												//닷컴객체를 세는 숫자

	//유저의 입력을 받아와서 인자로 넘겨주는 메소드
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt + "");

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			inputLine = br.readLine();
			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			System.out.println("IOException :" + e);
		}
		return inputLine;
	}

	//닷컴객체의 위치를 지정하는 메소드

	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();  		//좌표가 들어가는 어레이리스트
		String temp = null;												//나중에 연결을 위한 임시 String
		int[] coords = new int[comSize];								//현재 후보좌표
		int attempts = 0;												//시도횟수를 세기 위한 카운터
		boolean success = false;										//적당한 위치를 찾았는지 표시하기 위한 불린
		int location = 0;												//현재 시작위치

		comCount++;														//몇번째 닷컴인지 알아내기위함
		int incr = 1;													//수평방향으로 증가시킬 값 결정(1)
		if ((comCount % 2) == 1) {										//홀수번째 닷컴인 경우 수직으로 배치함
			incr = gridSize;											//수직으로 증가할 값 설정 (그리드크기 즉 7만큼 증가하므로 수직으로 증가하는것 처럼 정렬됨)
		}

		while (!success & attempts++ < 2000) {							//메인검색 순환문
			location = (int) (Math.random() * gridSize);				//임의의 시작점을 설정함(난수)
			int x = 0;													//위치시킬 닷컴의 n번째 위치
			success = true;												//성공할 것으로 가정함
			while (success && x < comSize) {							//닷컴이 들어갈 자리가 비엇는지 확인
				if (grid[location] == 0) {								//아직 사용하지 않을 경우
					coords[x++] = location;								//위치 저장
					location += incr;									//다음칸 확인(가로 혹은 세로)
					if (location >= gridSize) {							//경계를 벗어난 경우
						success = false;								//실패
					}
					if (x > 0 & (location % gridLength == 0)) {			//경계를 벗어 난 경우
						success = false;								//실패
					}
				} else {												//사용중인 경우 실패
					success = false;
				}
			}
		}
			int x = 0;													//위치를 알파벳 좌표로 바꿈
			int row = 0;
			int column = 0;

			while (x < comSize) {										
				grid[coords[x]] = 1;									//기본 그리드 좌표를 사용중으로 표시
				row = (int) (coords[x] / gridLength);					//행값을 구함
				column = coords[x] % gridLength;						//열값(숫자)를 구함
				temp = String.valueOf(alphabet.charAt(column));			//숫자가 된 열을 알파벳으로 반환

				alphaCells.add(temp.concat(Integer.toString(row)));
				x++;													//닷컴의 사이즈만큼 반복하기위해 필요
				System.out.println("coord"+x+ " = " +alphaCells.get(x-1)); //정답을 표시
			}
		
		return alphaCells;

	}
}
