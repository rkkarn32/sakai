package org.SakaiDAO;

import org.SakaiCommons.Section;
import org.SakaiDaoInterfaces.ISectionDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class SectionDAO implements ISectionDAO {
	private SessionFactory sessionFactory;
	
	@Autowired
	public SectionDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	public void create(Section s) {
		sessionFactory.getCurrentSession().persist(s);

	}

	public void update(Section s) {
		sessionFactory.getCurrentSession().saveOrUpdate(s);

	}

	public Section get(long id) {
		return (Section) sessionFactory.getCurrentSession().get(Section.class,	id);
	}

	public void delete(Section s) {
		sessionFactory.getCurrentSession().delete(s);

	}

	public Section load(long id) {
		return (Section) sessionFactory.getCurrentSession().load(Section.class,id);
	}

}
