package me.daiwei.service;

import java.util.List;

import me.daiwei.Model.CoAccountDto;
import me.daiwei.dao.CoAccountDtoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("coAccountService")
public class CoAccountServiceImpl implements CoAccountService {

    @Autowired
    private CoAccountDtoMapper coAccountDtoMapper;


    public CoAccountDto getCoAccountById(short coAccountId) {
        // TODO 自動生成されたメソッド・スタブ
        return coAccountDtoMapper.selectByPrimaryKey(coAccountId);
    }


    public List<CoAccountDto> getCoAccountAll() {
        // TODO 自動生成されたメソッド・スタブ
        return coAccountDtoMapper.getAll();
    }
}
