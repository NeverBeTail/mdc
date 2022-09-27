package com.mdc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.mdc.dto.TestDTO;

public interface TestDAO {
    public abstract List<TestDTO> testList(SqlSessionTemplate Session);
    
}
