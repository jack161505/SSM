package com.jack.ssmmodules.service.impl;

import com.jack.ssmmodules.dao.SecUserMapper;
import com.jack.ssmmodules.pojo.SecUser;
import com.jack.ssmmodules.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    SecUserMapper secUserMapper;


    @Override
    public List<SecUser> selectAll() {

        List<SecUser> secUsers=secUserMapper.selectAll();

        return secUsers;
    }
}
