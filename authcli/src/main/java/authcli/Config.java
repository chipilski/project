package authcli;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

@Configuration
public class Config {

    @Bean
    public ResourceOwnerPasswordResourceDetails resourceDetails () {
        return new ResourceOwnerPasswordResourceDetails();
    }
}
