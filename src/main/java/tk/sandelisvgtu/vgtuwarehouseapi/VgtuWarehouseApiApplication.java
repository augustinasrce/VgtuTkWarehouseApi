package tk.sandelisvgtu.vgtuwarehouseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaRepositories(basePackages = "tk.sandelisvgtu.vgtuwarehouseapi.repo")
@SpringBootApplication
public class VgtuWarehouseApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(VgtuWarehouseApiApplication.class, args);
    }
}
