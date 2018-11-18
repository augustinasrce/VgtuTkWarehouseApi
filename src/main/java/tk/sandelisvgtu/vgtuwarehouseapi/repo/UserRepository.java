package tk.sandelisvgtu.vgtuwarehouseapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.sandelisvgtu.vgtuwarehouseapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
