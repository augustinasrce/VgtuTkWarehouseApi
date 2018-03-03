package tk.sandelisvgtu.vgtuwarehouseapi.dao;

import com.google.common.collect.ImmutableList;
import tk.sandelisvgtu.vgtuwarehouseapi.model.Equipment;

import java.util.Date;
import java.util.List;

public class EquipmentDaoImpl implements EquipmentDao {

    List<Equipment> equipmentList = ImmutableList.of(
            new Equipment(1L, "Petzl Atache", "achujeni karabai", 20, new Date()));
    @Override
    public List<Equipment> getAll() {
        return equipmentList;
    }
}
