package com.lxc.mapper;

import com.lxc.entity.SyMenu;
import com.lxc.utils.MyMapper;

import java.util.List;

public interface SyMenuMapperCustom extends MyMapper<SyMenu> {
    List<SyMenu> selectAllByEmpId(int empid);
}