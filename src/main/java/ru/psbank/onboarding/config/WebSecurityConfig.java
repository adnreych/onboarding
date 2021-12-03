package ru.psbank.onboarding.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

/**
 * Конфиг для настройки Spring Security
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
        http
        .csrf().disable()   
        .authorizeRequests()
        .antMatchers("/**")
        			.permitAll()
                .and()
	                .formLogin()                
	                .loginPage("/index.html")
	                .loginProcessingUrl("/auth/login")     
	                .failureHandler(customAuthenticationFailureHandler())
	                .permitAll()
	            .and()
	    			.logout()
	    			.logoutUrl("/auth/logout")
	    			.logoutSuccessUrl("/index.html?logout")
	    			.permitAll();;
        
    }
    
    @Bean
    public AuthenticationFailureHandler customAuthenticationFailureHandler() {
        return new CustomAuthenticationFailureHandler();
    }

     
}