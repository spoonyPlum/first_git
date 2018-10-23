package com.lxc.service;

import com.lxc.entity.BeOrder;
import com.lxc.entity.BeOrderuser;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface BeOrderService {
    int insert(BeOrder order, List<BeOrderuser> list);

    List<BeOrder> selectAllByStepId(Example example);

    int updateStep(BeOrder order);

    int del(String orderNo);
}
