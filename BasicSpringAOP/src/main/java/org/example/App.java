package org.example;

import org.example.config.AspectConfig;
import org.example.model.Student;
import org.example.services.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        System.out.println(studentService);

        System.out.println("Count beans: "+ context.getBeanDefinitionCount());

        Student student = context.getBean("student", Student.class);
        student.setId(1L);
        student.setName("Tona");
        student.setAddress("PV");
        System.out.println(student);
    }
}
