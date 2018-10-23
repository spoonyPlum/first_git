package com.lxc.service.impl;

import com.lxc.entity.BeOrderuser;
import com.lxc.mapper.BeOrderuserMapper;
import com.lxc.service.BeOrderuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class BeOrderuserServiceImpl implements BeOrderuserService {

    @Autowired
    private BeOrderuserMapper om;

    @Override
    public List<BeOrderuser> selectAllByOrderNo(String orderNo) {
        Example example = new Example(BeOrderuser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("orderno",orderNo);
        return om.selectByExample(example);
    }
}
