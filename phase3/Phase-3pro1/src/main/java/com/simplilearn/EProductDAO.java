package com.simplilearn;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<EProductEntity> searchById(int pid) {
		
		return this.sessionFactory.getCurrentSession().createQuery("from EProductEntity where ID="+pid).list();
	}
	
	public List<EProductEntity> updateDetails(int id,String name, BigDecimal price) {
		
		EProductEntity e=new EProductEntity();
		e.setName(name);
		e.setPrice(price);
		sessionFactory.getCurrentSession().update(e, id);
		return this.sessionFactory.getCurrentSession().createQuery("from EProductEntity where ID="+id).list();
	}
}