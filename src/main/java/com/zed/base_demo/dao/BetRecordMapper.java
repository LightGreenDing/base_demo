package com.zed.base_demo.dao;

import com.zed.base_demo.entity.BetRecord;
import com.zed.base_demo.entity.BetRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BetRecordMapper {
    long countByExample(BetRecordExample example);

    int deleteByExample(BetRecordExample example);

    int insert(BetRecord record);

    int insertSelective(BetRecord record);

    List<BetRecord> selectByExampleWithBLOBs(BetRecordExample example);

    List<BetRecord> selectByExample(BetRecordExample example);

    int updateByExampleSelective(@Param("record") BetRecord record, @Param("example") BetRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") BetRecord record, @Param("example") BetRecordExample example);

    int updateByExample(@Param("record") BetRecord record, @Param("example") BetRecordExample example);
}