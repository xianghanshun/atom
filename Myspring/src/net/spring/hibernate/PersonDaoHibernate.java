package net.spring.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDaoHibernate extends HibernateDaoSupport implements UserDao {

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return (User)getHibernateTemplate().get(User.class, id);
	}

	@Override
	public Integer save(User user) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return (List<User>) getHibernateTemplate().find("from User u where u.name like ?", name);
	}

	@Override
	public List findAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) getHibernateTemplate().find("from User");
	}
}
