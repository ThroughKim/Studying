import java.util.*;	
public class DGPress implements Subject{
	
	private ArrayList observers;
	private String news;
	
	DGPressGUI dgpressGUI;

// Constructor ---------------------------------------
	
	public DGPress()
	{
		observers = new ArrayList<>();
	}
	
// Subject Interface 구현 ----------------------------
	
	public void  registerObserver(Observer o)
	{
		observers.add(o);
		//int size = observers.size();
		//dgpressGUI.memberChanged(size);
	}
	public void removeObserver(Observer o)
	{
		int i = observers.indexOf(o);
		if(i>=0)
		{
			observers.remove(i);
		}
	}
	public void notifyObservers()
	{
		for (int i =0; i < observers.size(); i++)
		{
			Observer observer = (Observer)observers.get(i);
			observer.update(news);
		}
	}

	public void newsChanged()
	{
		notifyObservers();
	}
	
	public void setNews(String news)
	{
		this.news = news;
		newsChanged();
	}
}
