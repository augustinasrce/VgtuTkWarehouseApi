package tk.sandelisvgtu.vgtuwarehouseapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.EquipmentRepository;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @RequestMapping("/equipment")
    public Iterable<Equipment> getEquipmentList() {
        return equipmentRepository.findAll();
    }

    @RequestMapping(value = "/equipment", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Equipment createEquipment(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @RequestMapping(value = "/equipment", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Equipment updateEquipment(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
}
