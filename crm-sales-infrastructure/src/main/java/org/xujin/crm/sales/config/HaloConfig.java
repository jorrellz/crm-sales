package org.xujin.crm.sales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xujin.halo.boot.Bootstrap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujin
 */
@Configuration
public class HaloConfig {

    @Bean(initMethod = "init")
    public Bootstrap bootstrap() {
        Bootstrap bootstrap = new Bootstrap();
        List<String> packages = new ArrayList<>();
        packages.add("org.xujin.crm.sales.command");
        packages.add("org.xujin.crm.sales.interceptor");
        packages.add("org.xujin.crm.sales.validator");
        packages.add("org.xujin.crm.sales.event.handler");

        packages.add("org.xujin.crm.marketing.domain.customer.rule");

        bootstrap.setPackages(packages);
        return bootstrap;
    }
}
