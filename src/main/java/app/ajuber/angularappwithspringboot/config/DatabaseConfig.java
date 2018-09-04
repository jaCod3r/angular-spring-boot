package app.ajuber.angularappwithspringboot.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("app.ajuber.angularappwithspringboot.repository")
@EnableTransactionManagement
public class DatabaseConfig {


}
