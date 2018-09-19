package cn.ioms.dubbo.service;

import java.util.List;

import cn.ioms.dubbo.entity.User;
public interface UserService {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record) throws Exception;

    int updateByPrimaryKey(User record);
    
    List<User> findAll() throws Exception;
}