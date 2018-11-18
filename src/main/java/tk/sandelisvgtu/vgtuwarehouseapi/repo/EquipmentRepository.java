package tk.sandelisvgtu.vgtuwarehouseapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
