package com.lujieni.elk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootElkApplicationTests {

    @Test
    public void test() {
        log.info("hello1");
        log.info("hello2");

    }

}
