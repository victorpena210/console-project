package entities;

public class Publisher {
	int id;
	String publisherName;
	
	public Publisher() {
		
	}
	
	@Override
	public String toString() {
		return publisherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	
}
