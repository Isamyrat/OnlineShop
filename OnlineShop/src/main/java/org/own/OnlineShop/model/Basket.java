package org.own.OnlineShop.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userBasket;

    @OneToMany(mappedBy = "basketBasketDevice", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<BasketDevice> basketDeviceBasket;

    public Basket() {
    }

    public List<BasketDevice> getBasketDeviceBasket() {
        return basketDeviceBasket;
    }

    public void setBasketDeviceBasket(List<BasketDevice> basketDeviceBasket) {
        this.basketDeviceBasket = basketDeviceBasket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(User userBasket) {
        this.userBasket = userBasket;
    }
}
