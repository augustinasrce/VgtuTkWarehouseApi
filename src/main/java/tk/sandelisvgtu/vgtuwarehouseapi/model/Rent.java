package tk.sandelisvgtu.vgtuwarehouseapi.model;

import javax.persistence.*;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @OneToOne
    private Equipment equipment;

    @OneToOne
    private User user;

    private Integer quantity;
    private boolean returned;

    public Rent() {
    }

    public Rent(Equipment equipment, User user, Integer quantity) {
        this.equipment = equipment;
        this.user = user;
        this.quantity = quantity;
        this.returned = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public boolean isNotReturned() {
        return !returned;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", equipment=" + equipment +
                ", user=" + user +
                ", quantity=" + quantity +
                ", returned=" + returned +
                '}';
    }
}
