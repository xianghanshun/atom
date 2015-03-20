package net.spring.hibernate;

import java.util.List;

public interface UserDao {
	User get(Integer id);
	Integer save(User user);
	void update(User user);
	void delete(Integer id);
	void delete(User user);
	List<User> findByName(String name);
	public List findAllUser();
}