package sperm.meets.egg.plan.be.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // add this line to use H2 web console
        http.headers().frameOptions().disable();

        http.csrf().disable().authorizeRequests().regexMatchers(".*").permitAll();
    }
}
