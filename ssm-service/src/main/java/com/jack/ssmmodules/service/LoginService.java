package com.jack.ssmmodules.service;

import com.jack.ssmmodules.pojo.SecUser;

import java.util.List;

public interface LoginService {
    List<SecUser> selectAll();
}
