package book;
import java.util.*;
/**
 * Created on 2015-09-17
 * Calendar 클래스를 이용한 날짜 구하기
 *java.util.Date를 이용하여 하루 전과 하루 뒤를 구함
 *@author KSW
 */
public class CalendarAfAndBf {
	/**
	 * param d 입력 다음 날을 출력하기 위한 입력 날
	 * return 하루 뒤를 출력
	 */
	
	public Date afterOneDay(Date d){
		//d 기준 날짜를 입력한다.
		long dd = d.getTime();
		//밀리세컨드*60초*60분*24시간 == 하루
		return new Date(dd+1000*60*60*24);
	}
	
	/**
	 * param d 입력 전 날을 출력 하기 위한 입력 날
	 * return 하루 전을 출력
	 */
	public Date beforeOneDay(Date d){
		//d 기준 날짜를 입력한다
		long dd = d.getTime();
		//밀리세컨드*60초*60분*24시간 == 하루
		return new Date(dd-1000*60*60*24); 
	}
}
