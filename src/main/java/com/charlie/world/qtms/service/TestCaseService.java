package com.charlie.world.qtms.service;

import com.charlie.world.qtms.entitiy.TestCase;
import com.charlie.world.qtms.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseService {
    @Autowired(required = true)
    TestCaseRepository testCaseRepository;

    public List<TestCase> getTestCases() {
        return testCaseRepository.findAll();
    }
}
