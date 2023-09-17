package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Skpojo;
import lk.ijse.spring.pojo.Userpojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Appinitializer {
    public static void main(String[] args) {
        System.out.println("kavindu");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        Skpojo bean = applicationContext.getBean(Skpojo.class);
        System.out.println(bean);
        Skpojo skpojo = new Skpojo();
        skpojo.play();
        Userpojo userpojo = new Userpojo();
        userpojo.dance();

    }
}

