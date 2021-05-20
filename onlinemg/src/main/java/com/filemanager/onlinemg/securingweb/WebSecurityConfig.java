package com.filemanager.onlinemg.securingweb;


import com.filemanager.onlinemg.domain.User;
import com.filemanager.onlinemg.repository.UserRepository;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.security.Principal;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/login", "/css/**","/js/**","/error**").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();


//         .authorizeRequests()
//                .antMatchers("/", "/home", "/css/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
    }

    @Bean
    public PrincipalExtractor principalExtractor(UserRepository userDetailsRepo) {
        return map -> {
             String id=(String)map.get("sub");
            User newuser= userDetailsRepo.findById(id).orElseGet(()->
             {
                 User user=new User();
                 user.setEmail((String)map.get("email"));
                 user.setId(id);
                 user.setName((String)map.get("name"));
                 user.setUserpic((String)map.get("picture"));
                 return user;
             });
          return   userDetailsRepo.save(newuser);
        };
    }
}