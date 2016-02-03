package me.daiwei.dao;

import java.util.List;

import me.daiwei.Model.CoAccountDto;

public interface CoAccountDtoMapper {
    int deleteByPrimaryKey(Short coAccountId);

    int insert(CoAccountDto record);

    int insertSelective(CoAccountDto record);

    CoAccountDto selectByPrimaryKey(Short coAccountId);

    int updateByPrimaryKeySelective(CoAccountDto record);

    int updateByPrimaryKeyWithBLOBs(CoAccountDto record);

    int updateByPrimaryKey(CoAccountDto record);

    public List<CoAccountDto> getAll();
}