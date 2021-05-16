package org.own.OnlineShop.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "create_at")
    private Date createAt;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User userOrders;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id", nullable = false)
    private Device deviceOrders;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pick_up_point_id", nullable = false)
    private PickUpPoint pickUpPointOrders;

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public User getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(User userOrders) {
        this.userOrders = userOrders;
    }

    public Device getDeviceOrders() {
        return deviceOrders;
    }

    public void setDeviceOrders(Device deviceOrders) {
        this.deviceOrders = deviceOrders;
    }

    public PickUpPoint getPickUpPointOrders() {
        return pickUpPointOrders;
    }

    public void setPickUpPointOrders(PickUpPoint pickUpPointOrders) {
        this.pickUpPointOrders = pickUpPointOrders;
    }
}