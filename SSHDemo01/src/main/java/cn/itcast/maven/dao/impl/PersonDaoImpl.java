package cn.itcast.maven.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.itcast.maven.dao.IPersonDao;
import cn.itcast.maven.domain.Person;

public class PersonDaoImpl implements IPersonDao {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(final Person person) {
		hibernateTemplate.save(person);
	}
}
