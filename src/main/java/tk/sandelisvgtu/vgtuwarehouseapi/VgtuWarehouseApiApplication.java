package tk.sandelisvgtu.vgtuwarehouseapi;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class VgtuWarehouseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VgtuWarehouseApiApplication.class, args);
	}

/*	@Bean
	public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
	}*/
}
