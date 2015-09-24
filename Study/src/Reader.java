
public class Reader implements Observer, DisplayElements {
	private String news;
	private Subject readerData;
	ReaderGUI readerGUI;

// 객체를 생성할때마다 다른값을 주면 다른 객체로 등록됨
	
	public Reader(Subject readerData)
	{
		this.readerData = readerData;
		readerData.registerObserver(this);
	}

//모든 리더가 공통적으로 행동
	
	public void update(String news)
	{
		this.news = news;
		display(news);
	}
	public void display(String news)
	{
		this.news = news;
		//ReaderGUI.notice(news);
		System.out.println ("News :"+news);
	}

}
