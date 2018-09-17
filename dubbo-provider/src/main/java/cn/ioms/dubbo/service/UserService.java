package cn.ioms.dubbo.service;

import cn.ioms.dubbo.entity.User;

public interface UserService {
    int deleteByPrimaryKey(Long id);

    int insert(User record) throws Exception;

    int insertSelective(User record) throws Exception;

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}