package com.charlie.world.qtms.controller;

import com.charlie.world.qtms.entitiy.BaseResponse;
import com.charlie.world.qtms.entitiy.TestCase;
import com.charlie.world.qtms.repository.TestCaseRepository;
import com.charlie.world.qtms.service.Hello;
import com.charlie.world.qtms.service.TestCaseService;
import com.charlie.world.qtms.vo.TestCaseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class TestCaseController {

    @Autowired(required = true)
    TestCaseRepository testCaseRepository;

    @Autowired(required = true)
    TestCaseService testCaseService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Hello hello() {
        return new Hello();
    }

    @RequestMapping(value = "/v1/test-cases", method = RequestMethod.GET)
    public BaseResponse getTestCases() {
        return new BaseResponse<List<TestCase>>(testCaseService.getTestCases());
    }

    @RequestMapping(value = "/v1/test-cases/{id}", method = RequestMethod.GET)
    public BaseResponse getTestCaseById(@PathVariable("id") long id) {
        Optional<TestCase> tc = testCaseService.getTestCase(id);
        if (tc.isPresent()) {
            return new BaseResponse<TestCase>(tc.get());
        } else {
            return new BaseResponse<String>(String.format("Test case id %d 는 존재 하지 않습니다", id));
        }
    }

    @RequestMapping(value = "/v1/test-cases/new", method = RequestMethod.POST)
    public BaseResponse insertTestCase(@RequestBody TestCaseVO tcVO) {
        testCaseService.insertNewTestCase(tcVO);
        return new BaseResponse<TestCaseVO>(tcVO);
    }
}
