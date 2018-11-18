package tk.sandelisvgtu.vgtuwarehouseapi.model;

public class RentRequest {
    private Long equipmentId;
    private Long userId;
    private Integer quantity;

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "RentRequest{" +
                "equipmentId=" + equipmentId +
                ", userId=" + userId +
                ", quantity=" + quantity +
                '}';
    }
}
