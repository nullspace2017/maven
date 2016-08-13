package cn.itcast.maven.service.impl;

import cn.itcast.maven.dao.IPersonDao;
import cn.itcast.maven.domain.Person;
import cn.itcast.maven.service.IPersonService;

public class PersonServiceImpl implements IPersonService {
	
	private IPersonDao personDao;

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	public void savePerson(Person person) {
		personDao.save(person);
	}
}
