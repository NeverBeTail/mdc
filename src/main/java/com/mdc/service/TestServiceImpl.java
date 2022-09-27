package com.mdc.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdc.dao.TestDAO;
import com.mdc.dto.TestDTO;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDAO dao;

    @Autowired
    SqlSessionTemplate session;

    @Override
    public List<TestDTO> testList(){
        return dao.testList(session);
    }
    
}
