package cn.ioms.dubbo.service;

import java.util.List;

import cn.ioms.dubbo.entity.Role;

public interface RoleService {
	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
	
	List<Role> findAll() throws Exception;
}
