package com.example.multimodule

import com.example.multimodule.service.MyService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest


@SpringBootApplication
@SpringBootTest("service.message=Hello")
class MyServiceTest {

    @Autowired
    private lateinit var myService: MyService

    @Test
    fun contextLoads() {
        Assertions.assertThat(myService.message()).isNotNull
    }
}