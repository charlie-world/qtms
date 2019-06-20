package com.charlie.world.qtms.controller;

import com.charlie.world.qtms.entitiy.BaseResponse;
import com.charlie.world.qtms.entitiy.TestCase;
import com.charlie.world.qtms.repository.TestCaseRepository;
import com.charlie.world.qtms.service.Hello;
import com.charlie.world.qtms.service.TestCaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TestCaseController {

    @Autowired(required = true)
    TestCaseRepository testCaseRepository;

    @Autowired(required = true)
    TestCaseService testCaseService;

    @GetMapping("/hello")
    public Hello hello() {
        return new Hello();
    }

    @GetMapping("/v1/test-cases")
    public BaseResponse<List<TestCase>> getTestCases() {
        return new BaseResponse<List<TestCase>>(testCaseService.getTestCases());
    }
}
