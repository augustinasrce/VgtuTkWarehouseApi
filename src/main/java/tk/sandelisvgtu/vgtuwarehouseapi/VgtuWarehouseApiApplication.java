package tk.sandelisvgtu.vgtuwarehouseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.EquipmentRepository;

import java.util.Date;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class VgtuWarehouseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VgtuWarehouseApiApplication.class, args);
    }
}
