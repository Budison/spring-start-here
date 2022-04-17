package com.github.budison.spring_start_here;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Kevin Nowak
 */
@Configuration
class ProjectConfig {
    @Bean
    @Primary
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(value = "miki")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean(value = "riki")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean("ernie")
    Parrot parrot4() {
        var p = new Parrot();
        p.setName("Ernie");
        return p;
    }
}
