package com.lxc.mapper;

import com.lxc.entity.SyEmp;
import com.lxc.utils.MyMapper;

public interface SyEmpMapperCustom extends MyMapper<SyEmp> {
    SyEmp login(SyEmp emp);
}