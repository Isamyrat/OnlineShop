package org.own.OnlineShop.model;

import javax.persistence.*;

@Entity
@Table(name = "basket_device")
public class BasketDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    private Device deviceBasketDevice;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "basket_id", nullable = false)
    private Basket basketBasketDevice;

    public BasketDevice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Device getDeviceBasketDevice() {
        return deviceBasketDevice;
    }

    public void setDeviceBasketDevice(Device deviceBasketDevice) {
        this.deviceBasketDevice = deviceBasketDevice;
    }

    public Basket getBasketBasketDevice() {
        return basketBasketDevice;
    }

    public void setBasketBasketDevice(Basket basketBasketDevice) {
        this.basketBasketDevice = basketBasketDevice;
    }
}