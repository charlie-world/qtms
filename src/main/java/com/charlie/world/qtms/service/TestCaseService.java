package com.charlie.world.qtms.service;

import com.charlie.world.qtms.entitiy.TestCase;
import com.charlie.world.qtms.repository.TestCaseRepository;
import com.charlie.world.qtms.vo.TestCaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestCaseService {
    @Autowired(required = true)
    TestCaseRepository testCaseRepository;

    public List<TestCase> getTestCases() {
        return testCaseRepository.findAll();
    }

    public Optional<TestCase> getTestCase(Long id) {
        return testCaseRepository.findById(id);
    }

    public void insertNewTestCase(TestCaseVO tcVO) {
        TestCase tc = TestCase.builder()
                .caseDescription(tcVO.getCaseDescription())
                .preCondition(tcVO.getPreCondition())
                .testStep(tcVO.getTestStep())
                .expectedResult(tcVO.getExpectedResult())
                .lastTester(tcVO.getLastTester())
                .result(tcVO.getResult())
                .build();
        testCaseRepository.saveAndFlush(tc);
    }
}
