package com.lxc.service.impl;

import com.lxc.entity.SyEmp;
import com.lxc.mapper.SyEmpMapper;
import com.lxc.mapper.SyEmpMapperCustom;
import com.lxc.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SyEmpServiceImpl implements SyEmpService {

    @Autowired
    private SyEmpMapperCustom smc;


    //员工登入
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyEmp login(SyEmp emp) {
        return smc.login(emp);
    }

}
