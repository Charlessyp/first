package org.example;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4classRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SampleTest{

    @Test
    public void testHello(){
        System.out.println("first test!");
    }
}
