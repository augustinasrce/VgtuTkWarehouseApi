package tk.sandelisvgtu.vgtuwarehouseapi.dao;

import org.springframework.stereotype.Service;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;

import java.util.List;

@Service
public interface EquipmentDao {

    List<Equipment> getAll();
}
