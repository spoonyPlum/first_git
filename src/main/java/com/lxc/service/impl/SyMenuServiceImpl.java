package com.lxc.service.impl;

import com.lxc.entity.SyMenu;
import com.lxc.mapper.SyMenuMapperCustom;
import com.lxc.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyMenuServiceImpl implements SyMenuService {

    @Autowired
    private SyMenuMapperCustom smc;

    @Override
    public List<SyMenu> selectAllByEmpId(int empid) {
        return smc.selectAllByEmpId(empid);
    }
}
