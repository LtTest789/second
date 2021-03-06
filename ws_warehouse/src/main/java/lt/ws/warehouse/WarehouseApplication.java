package lt.ws.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Romas on 5/6/2017.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan
@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication
@SpringBootConfiguration
public class WarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
    }
//
//    @Bean
//    public DataSource dataSource() {
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        EmbeddedDatabase db = builder
//                .setType(EmbeddedDatabaseType.H2)
//                .setName("shop")
//                .addScript("create-table.sql")
//                .addScript("insert-data.sql")
//                .build();
//        return db;
//    }
}