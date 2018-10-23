package com.lxc.service;

import com.lxc.entity.SyMenu;

import java.util.List;

public interface SyMenuService {
    List<SyMenu> selectAllByEmpId(int empid);
}
