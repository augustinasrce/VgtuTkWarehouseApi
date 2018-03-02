package tk.sandelisvgtu.vgtuwarehouseapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.sandelisvgtu.vgtuwarehouseapi.dao.EquipmentDao;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private EquipmentDao equipmentDao;

    @RequestMapping("/equipment/list")
    public List<Equipment> getEquipmentList() {
        return equipmentDao.getAll();
    }
}
