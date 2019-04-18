package com.zed.base_demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zed.base_demo.base.BaseService;
import com.zed.base_demo.dao.BetRecordMapper;
import com.zed.base_demo.entity.BetRecord;
import com.zed.base_demo.service.BetRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Zed
 * @date: 2019/4/18
 */
@Service
public class BetRecordServiceImpl extends BaseService implements BetRecordService {
    @Autowired
    private BetRecordMapper betRecordMapper;

    @Override
    public String getList() {
        PageHelper.startPage(0, 10);
        List<BetRecord> list = betRecordMapper.selectByExample(null);
        PageInfo pageInfo = new PageInfo(list);
        return success(pageInfo);
    }
}
