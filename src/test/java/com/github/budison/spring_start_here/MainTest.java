package com.github.budison.spring_start_here;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    @Test
    public void checkParrotBeanCreation() {
        // Given
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // When
        Parrot p = context.getBean(Parrot.class);
        // Then
        assertEquals(p.getName(), "Koko");
    }
}
