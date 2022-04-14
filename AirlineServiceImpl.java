package com.motivity.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.Airlines;
import com.motivity.dao.AirlineDAO;

@Service
public class AirlineServiceImpl implements AirlineService {
	
	@Autowired
	public AirlineDAO airlineDao;
	
	@Transactional
    //@Override
	public void add(Airlines airline) {
		airlineDao.add(airline);
	}
	@Transactional
		public void delete(Airlines airline) {
			airlineDao.delete(airline);
		}
	@Transactional
			public void update(Airlines airline) {
				airlineDao.update(airline);
	}
	@Transactional
	public List<Airlines> select() {
		 return airlineDao.select();
}
	
}
