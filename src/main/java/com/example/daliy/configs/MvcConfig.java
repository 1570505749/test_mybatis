//package com.example.test_mybatis.configs;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class  MvcConfig extends WebSecurityConfigurerAdapter{
//    @Override
//    protected  void configure(HttpSecurity http) throws Exception{
//        System.out.println("llll");
//    http.
//            authorizeRequests()
//            .antMatchers("/hello").hasRole("admin")//表示访问 /hello 这个接口，需要具备 admin 这个角色
//            .anyRequest().authenticated()//表示剩余的其他接口，登录之后就能访问
//            .and()
//            .formLogin()
//            .loginPage("/test/login")
//            .permitAll()
//            .and()
//            .logout()
//            .permitAll();
//
//    }
////    @Autowired
////    public  void configureGlobal(AuthenticationManagerBuilder auth) throws  Exception{
////        auth
////                .inMemoryAuthentication()
////                .withUser("user").password("password").roles("USER");
////    }
//
//}