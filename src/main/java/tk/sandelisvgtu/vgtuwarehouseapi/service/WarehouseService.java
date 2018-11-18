package tk.sandelisvgtu.vgtuwarehouseapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Rent;
import tk.sandelisvgtu.vgtuwarehouseapi.model.RentRequest;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.EquipmentRepository;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.RentRepository;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WarehouseService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Equipment> findAllEquipment() {
        return equipmentRepository.findAll();
    }

    public Equipment findEquipmentById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    public List<Equipment> findAvailableEquipment() {
        return findAllEquipment();// Todo
    }

    public List<Rent> findAllRents() {
        return rentRepository.findAll();
    }

    public List<Rent> findActiveRents() {
        return findAllRents().stream().filter(Rent::isNotReturned).collect(Collectors.toList());
    }

    public Equipment saveEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public Rent saveRent(RentRequest rentRequest) {
        return rentRepository.save(new Rent(findEquipmentById(rentRequest.getEquipmentId()) ,
                                            null, //Todo
                                            rentRequest.getQuantity()));
    }
}
