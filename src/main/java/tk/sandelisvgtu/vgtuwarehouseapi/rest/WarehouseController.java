package tk.sandelisvgtu.vgtuwarehouseapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.EquipmentRepository;

import java.util.List;

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
    public Equipment saveUpdateEquipment(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
}
