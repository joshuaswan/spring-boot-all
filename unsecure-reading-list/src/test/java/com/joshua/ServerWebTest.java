package com.joshua;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by joshua on 2017/10/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UnsecureReadingListApplication.class)
@WebAppConfiguration
public class ServerWebTest {

//    @Value("${local.server.port}")
    private int port = 8080;

    @Test
    public void testSomething() throws Exception{
        System.out.println(port);
    }
}
