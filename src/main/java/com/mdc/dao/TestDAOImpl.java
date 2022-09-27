package com.mdc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.mdc.dto.TestDTO;

@Repository
public class TestDAOImpl implements TestDAO{
    @Override
    public List<TestDTO> testList(SqlSessionTemplate session){
        return session.selectList("TestMapper.testList");
    }
}