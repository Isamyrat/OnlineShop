package org.own.OnlineShop.model;

import org.own.OnlineShop.model.enums.Roles;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Roles role;

    @Column(name = "create_at")
    private Date createAt;

    @OneToOne(mappedBy = "userPersonalInformation")
    private PersonalInformation personalInformationUser;

    @OneToOne(mappedBy = "userBasket")
    private Basket basketUser;

    @OneToMany(mappedBy = "userAds", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Ads> adsUser;

    @OneToMany(mappedBy = "userRating", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Rating> ratingUser;

    @OneToMany(mappedBy = "userOrders", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Orders> ordersUser;

    public User() {
    }

    public List<Orders> getOrdersUser() {
        return ordersUser;
    }

    public void setOrdersUser(List<Orders> ordersUser) {
        this.ordersUser = ordersUser;
    }

    public List<Rating> getRatingUser() {
        return ratingUser;
    }

    public void setRatingUser(List<Rating> ratingUser) {
        this.ratingUser = ratingUser;
    }

    public List<Ads> getAdsUser() {
        return adsUser;
    }

    public void setAdsUser(List<Ads> adsUser) {
        this.adsUser = adsUser;
    }

    public Basket getBasketUser() {
        return basketUser;
    }

    public void setBasketUser(Basket basketUser) {
        this.basketUser = basketUser;
    }

    public PersonalInformation getPersonalInformationUser() {
        return personalInformationUser;
    }

    public void setPersonalInformationUser(PersonalInformation personalInformationUser) {
        this.personalInformationUser = personalInformationUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}