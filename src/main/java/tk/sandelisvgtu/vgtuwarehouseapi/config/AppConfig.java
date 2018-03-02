package tk.sandelisvgtu.vgtuwarehouseapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.sandelisvgtu.vgtuwarehouseapi.dao.EquipmentDao;
import tk.sandelisvgtu.vgtuwarehouseapi.dao.EquipmentDaoImpl;

@Configuration
public class AppConfig {
    @Bean
    public EquipmentDao equipmentDao() {
        return new EquipmentDaoImpl();
    }

}
