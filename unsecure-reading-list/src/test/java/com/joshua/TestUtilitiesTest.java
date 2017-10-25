package com.joshua;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by joshua on 2017/10/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
//        classes = TestUtilitiesTest.TestConfig.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class TestUtilitiesTest {

    @Autowired
    Environment environment;

    @Test
    public void loadProperties(){
        assertEquals("bar",environment.getProperty("foo"));
        assertEquals("123",environment.getProperty("bar"));
    }
//    @Configuration
//    public static class TestConfig{
//
//    }
}
