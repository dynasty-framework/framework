package cn.dynasty.zt.test.dao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ClassName: TestDaoApplication
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-14 14:07
 **/
@SpringBootApplication//(scanBasePackages = "cn.dynasty.zt.test.dao")
@ServletComponentScan
public class TestDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDaoApplication.class, args);
    }
}
