package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.model.People;
import com.revature.util.ConnectionUtil;

public class PeopleDao {

	public List<People> getPeople() {
		Session session = ConnectionUtil.getSession();
		return session.createQuery("from People").list();
	}

	public People getPeopleByName(String aName) {
		People found = null;
		List<People> people = new ArrayList<>();
		Session session = ConnectionUtil.getSession();

		people = session.createQuery("from People where userName = :nameVar").setString("nameVar", aName).list();
		if (!people.isEmpty()) {
			found = people.get(0);
		}
		return found;
	}
}
