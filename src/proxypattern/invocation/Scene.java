package proxypattern.invocation;

import java.lang.reflect.Proxy;

import proxypattern.invocation.invocationhandler.OwnerInvocationHandler;
import proxypattern.invocation.person.PersonBean;
import proxypattern.invocation.person.PersonBeanImpl;

public class Scene {

	PersonBean joe = new PersonBeanImpl();
	PersonBean joey = new PersonBeanImpl();

	public static void main(String[] args) {
		new Scene().test();
	}

	public Scene() {
		// init method
		joe.setName("Joe");
		joe.setGender("male");
		joe.setInterests("interests");

		joey.setGender("male");
		joey.setName("joey");
		joey.setInterests("interests");

	}

	public void test() {
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is" + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try{
			ownerProxy.setHotOrnotRating(10);
		} catch (Exception e){
			System.out.println("Can't set rating from owner proxy");
//			e.printStackTrace();
		}
		System.out.println("Rating is "+ ownerProxy.getHotOrnotRating());
		
		
		
	}

	PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

}
