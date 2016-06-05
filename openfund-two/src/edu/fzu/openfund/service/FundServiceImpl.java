package edu.fzu.openfund.service;

import java.util.List;

import edu.fzu.openfund.dao.FundDao;
import edu.fzu.openfund.dao.FundDaoJDBCImpl;
import edu.fzu.openfund.domain.Fund;

public class FundServiceImpl implements FundService {

	public List<Fund> getAllFunds() {
		FundDao fundDao=new FundDaoJDBCImpl();
		return fundDao.findAllFunds();
	}

}
