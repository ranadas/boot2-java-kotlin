package com.rdas.service;

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StringSplitterTest {

    @Autowired
    private lateinit var springSplitter: StringSplitter

    @Test
    fun `Assert object injected page`() {
        assertThat(springSplitter)
                .isNotNull()
    }
}