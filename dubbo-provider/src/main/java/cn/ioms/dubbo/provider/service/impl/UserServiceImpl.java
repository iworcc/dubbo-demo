package cn.ioms.dubbo.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ioms.dubbo.entity.Role;
import cn.ioms.dubbo.entity.User;
import cn.ioms.dubbo.provider.dao.DaoSupport;
import cn.ioms.dubbo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private DaoSupport dao;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) throws Exception {
		
		return (int) dao.update("UserMapper.updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		
		List<Role> list = (List<Role>) dao.findForList("RoleMapper.findAll", null);
		return (List<User>) dao.findForList("UserMapper.findAll", null);
	}

}
