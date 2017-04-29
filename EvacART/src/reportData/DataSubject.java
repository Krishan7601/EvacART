package reportData;

public interface DataSubject {
	public void notifyObservers();
	void attach(DataObserver observer);
	public void detach(DataObserver observer);
}
