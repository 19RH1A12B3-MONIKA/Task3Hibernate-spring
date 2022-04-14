package com.motivity.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motivity.Airlines;



@Repository
public class DAOImpl implements AirlineDAO{
	 @Autowired
	    private SessionFactory sessionFactory;

	   // @Override
	    public void add(Airlines airlines) {
	        sessionFactory.getCurrentSession().save(airlines);
	    }
	        public void delete(Airlines airlines) {
		        sessionFactory.getCurrentSession().delete(airlines);
	        }
		        public void update(Airlines airlines) {
			        sessionFactory.getCurrentSession().update(airlines);
	    }
		        @SuppressWarnings("unchecked")
		    	public List<Airlines> select(){
		    		
		    		List<Airlines> memberlist = (List<Airlines>) sessionFactory.getCurrentSession()
		                    .createCriteria(Airlines.class)
		                    .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		            return memberlist;
		        
		        }
}
