package com.github.budison.spring_start_here;

import com.github.budison.spring_start_here.chp2.Parrot;
import com.github.budison.spring_start_here.chp2.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.util.function.Supplier;

import static org.testng.Assert.*;

public class MainTest {
    @Test
    public void testRegisterBean() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);
        assertEquals(p.getName(), "Kiki");

    }
}
