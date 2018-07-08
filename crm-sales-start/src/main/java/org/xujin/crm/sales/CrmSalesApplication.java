package org.xujin.crm.sales;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot应用的入口类
 *
 * @author xujin
 */
@ComponentScan(basePackages = {"org.xujin.crm.sales"})
@MapperScan("org.xujin.crm.sales.dao")
@SpringBootApplication
public class CrmSalesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmSalesApplication.class, args);
    }
}
