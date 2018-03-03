package tk.sandelisvgtu.vgtuwarehouseapi.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;

import java.util.List;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Long> {
}
