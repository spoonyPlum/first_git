package com.lxc.service;

import com.lxc.entity.BeOrderuser;

import java.util.List;

public interface BeOrderuserService {
    List<BeOrderuser> selectAllByOrderNo(String orderNo);
}
