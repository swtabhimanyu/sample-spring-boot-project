package com.example.demo.confog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {

    @Autowired
    private UserDetailsService userdetails;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf(c->c.disable())
                .authorizeHttpRequests(c->c.anyRequest().authenticated())
                        .httpBasic(Customizer.withDefaults())
                                        .sessionManagement(s->s.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).
                build();
    }

    @Bean
    public AuthenticationProvider authenticationManager(){
        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        daoAuthenticationProvider.setUserDetailsService(userdetails);
        return daoAuthenticationProvider;
    }
}
