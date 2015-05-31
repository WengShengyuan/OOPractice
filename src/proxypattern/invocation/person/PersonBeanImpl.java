package proxypattern.invocation.person;

public class PersonBeanImpl implements PersonBean{

	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount=0;
	
	
	
	
	@Override
	public int getHotOrnotRating() {
		if (ratingCount == 0 ) return 0;
		return (rating / ratingCount);
	}
	@Override
	public void setHotOrnotRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getGender() {
		return this.gender;
	}
	@Override
	public String getInterests() {
		return this.interests;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	
}
