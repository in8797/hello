package ex;

public class Member {
	int id;
	String name;
	String subject;

	public Member(int id) {
		super();
		this.id = id;
	}

	public Member(String subject) {
		super();
		this.subject = subject;
	}

	public Member(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}
	
}
