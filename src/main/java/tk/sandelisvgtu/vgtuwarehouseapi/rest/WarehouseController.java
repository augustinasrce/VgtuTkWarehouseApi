package tk.sandelisvgtu.vgtuwarehouseapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Rent;
import tk.sandelisvgtu.vgtuwarehouseapi.model.RentRequest;
import tk.sandelisvgtu.vgtuwarehouseapi.service.WarehouseService;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping("/equipment/all")
    public List<Equipment> findAllEquipmentList() {
        return warehouseService.findAllEquipment();
    }

    @RequestMapping("/equipment/{id}")
    public Equipment findEquipmentById(@PathVariable Long id) {
        return warehouseService.findEquipmentById(id);
    }

    @RequestMapping(value = "/equipment/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Equipment createEquipment(@RequestBody Equipment equipment) {
        return warehouseService.saveEquipment(equipment);
    }

    @RequestMapping(value = "/equipment/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Equipment updateEquipment(@RequestBody Equipment equipment) {
        return warehouseService.saveEquipment(equipment);
    }

    @RequestMapping("/equipment/available")
    public List<Equipment> getAvailableEquipment() {
        return warehouseService.findAvailableEquipment();
    }

    @RequestMapping("/equipment/rents/all")
    public List<Rent> getAllRents() {
        return warehouseService.findAllRents();
    }

    @RequestMapping("/equipment/rents/active")
    public List<Rent> getActiveRents() {
        return warehouseService.findActiveRents();
    }

    @RequestMapping(value = "/equipment/rents/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Rent createRent(@RequestBody RentRequest rentRequest) {
        return warehouseService.saveRent(rentRequest);
    }
}
