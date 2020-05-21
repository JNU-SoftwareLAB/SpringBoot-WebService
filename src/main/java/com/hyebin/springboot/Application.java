package com.hyebin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication // 스프링 부트의 자동 설정, 스프링부트의 빈 읽기와 생성을 자동으로 해주는 메인 프로그램
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
