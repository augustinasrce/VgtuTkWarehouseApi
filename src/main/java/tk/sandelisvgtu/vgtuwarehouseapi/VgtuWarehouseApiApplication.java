package tk.sandelisvgtu.vgtuwarehouseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import tk.sandelisvgtu.vgtuwarehouseapi.model.User;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.UserRepository;

@Configuration
@EnableJpaRepositories(basePackages = "tk.sandelisvgtu.vgtuwarehouseapi.repo")
@SpringBootApplication
public class VgtuWarehouseApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(VgtuWarehouseApiApplication.class, args);
    }
}
