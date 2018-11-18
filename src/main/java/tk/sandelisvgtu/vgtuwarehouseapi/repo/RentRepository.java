package tk.sandelisvgtu.vgtuwarehouseapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Rent;

public interface RentRepository extends JpaRepository<Rent, Long> {
}
