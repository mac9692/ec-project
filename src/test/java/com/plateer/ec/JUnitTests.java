package com.plateer.ec;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class JUnitTests {

    @BeforeAll
    void init() {
        // 데이터 셋
    }

    @Test
    @DisplayName("첫 테스트 더하기 테스트")
    void addtion() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    void addition_under_bar() {

    }
}
