package proxypattern.invocation.person;

public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrnotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrnotRating(int rating);

}
