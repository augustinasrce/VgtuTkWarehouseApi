package tk.sandelisvgtu.vgtuwarehouseapi.dao;

import com.google.common.collect.ImmutableList;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;

import java.util.Date;
import java.util.List;

public class EquipmentDaoImpl implements EquipmentDao {

    List<Equipment> equipmentList = ImmutableList.of(
            new Equipment("1", "Petzl Atache", "achujeni karabai", 20, new Date()),
            new Equipment("5", "CT Helmas", "Salmas kaip salmas", 5, new Date()),
            new Equipment("6", "Grivel Monster", "ledkirtis shudinas bbz kaip kas", 2, new Date()));

    @Override
    public List<Equipment> getAll() {
        return equipmentList;
    }
}
