package me.daiwei.service;

import java.util.List;

import me.daiwei.Model.CoAccountDto;

public interface CoAccountService {

    /**
     * 根据用户id获取用户
     * @param coAccountId
     * @return
     */
    public CoAccountDto getCoAccountById(short coAccountId);

    public List<CoAccountDto> getCoAccountAll();

}
