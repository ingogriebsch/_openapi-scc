package com.example.openapi.contracts;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.webAppContextSetup;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest
class ApiBase {

    @Autowired
    private WebApplicationContext applicationContext;

    @BeforeEach
    void beforeEach() {
        webAppContextSetup(applicationContext);
    }
}
