package club.chenlinghong.demo.rambo.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvironmentDemoTest {

    @Autowired
    private EnvironmentDemo environmentDemo;

    @Test
    public void getEnvironment() {
        System.out.println(environmentDemo.getEnvironment());
    }
}