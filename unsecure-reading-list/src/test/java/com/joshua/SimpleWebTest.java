package com.joshua;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.web.htmlunit.webdriver.LocalHostWebConnectionHtmlUnitDriver;


/**
 * Created by joshua on 2017/10/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UnsecureReadingListApplication.class)
public class SimpleWebTest {
}
