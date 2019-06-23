package com.charlie.world.qtms.entitiy;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Entity
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Table(name = "test_case")
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testCaseId;

    @Column(length = 45, nullable = false)
    private String caseDescription;

    @Column(length = 45, nullable = false)
    private String preCondition;

    @Column(length = 128, nullable = false)
    private String testStep;

    @Column(length = 128, nullable = false)
    private String expectedResult;

    @Column(length = 20, nullable = true)
    private String lastTester;

    @Column(nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean result;

    @Builder
    public TestCase(String caseDescription, String preCondition, String testStep, String expectedResult, String lastTester, Boolean result) {
        this.caseDescription = caseDescription;
        this.preCondition = preCondition;
        this.testStep = testStep;
        this.expectedResult = expectedResult;
        this.lastTester = lastTester;
        this.result = result;
    }
}
