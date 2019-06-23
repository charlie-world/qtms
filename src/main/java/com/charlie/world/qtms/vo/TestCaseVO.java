package com.charlie.world.qtms.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TestCaseVO {

    private String caseDescription;
    private String preCondition;
    private String testStep;
    private String expectedResult;

    @Nullable
    private String lastTester;
    private Boolean result;
}
