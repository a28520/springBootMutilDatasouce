package com.multi.datasource.service.impl;

import com.multi.datasource.persistence.mysql.UserInfoDao;
import com.multi.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * shiro 安全认证service
 * @author wgc
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserInfoDao userInfoDao;

}
