package cn.itcast.maven.web.action;

import cn.itcast.maven.domain.Person;
import cn.itcast.maven.service.IPersonService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class PersonAction extends ActionSupport implements ModelDriven<Person> {
	
	private IPersonService personService;

	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	Person person = new Person();
	
	public Person getModel() {
		return person;
	}
	
	public String save(){
		personService.savePerson(person);
		return "success";
	}

	
}
