package com.robb.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robb.dao.IRobbDao;
import com.robb.service.RobbService;

@Service("robbService")
public class RobbServiceImpl implements RobbService {

	private static Logger logger  = LoggerFactory.getLogger(RobbServiceImpl.class);
	
	@Resource
	private IRobbDao robbDao;
	
	public String add(String name) {
		logger.info("---{} {} {}", getClass(),"add",name);
		return robbDao.add(name);
	}
	
}
