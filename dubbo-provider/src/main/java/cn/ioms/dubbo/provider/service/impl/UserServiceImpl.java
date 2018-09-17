package cn.ioms.dubbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.ioms.dubbo.dao.DaoSupport;
import cn.ioms.dubbo.entity.User;
import cn.ioms.dubbo.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private DaoSupport dao;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) throws Exception{
		return (int) dao.save("UserMapper.insert", record);
	}

	@Override
	public int insertSelective(User record) throws Exception {
		return (int) dao.save("UserMapper.insertSelective", record);
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
