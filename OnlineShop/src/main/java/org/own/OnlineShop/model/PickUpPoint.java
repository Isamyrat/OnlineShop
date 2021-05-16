package org.own.OnlineShop.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pick_up_point")
public class PickUpPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private Date time;

    @Column(name = "city_address")
    private String city;

    @Column(name = "street_address")
    private String street;

    @Column(name = "house_address")
    private String house;

    @Column(name = "office_address")
    private String office;

    @Column(name = "rating")
    private Byte rating;

    @Column(name = "review")
    private String review;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id", nullable = false)
    private Device devicePickUpPoint;

    @OneToMany(mappedBy = "pickUpPointRating", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Rating> ratingPickUpPoint;

    @OneToMany(mappedBy = "pickUpPointOrders", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Orders> ordersPickUpPoint;

    public PickUpPoint() {
    }

    public List<Orders> getOrdersPickUpPoint() {
        return ordersPickUpPoint;
    }

    public void setOrdersPickUpPoint(List<Orders> ordersPickUpPoint) {
        this.ordersPickUpPoint = ordersPickUpPoint;
    }

    public List<Rating> getRatingPickUpPoint() {
        return ratingPickUpPoint;
    }

    public void setRatingPickUpPoint(List<Rating> ratingPickUpPoint) {
        this.ratingPickUpPoint = ratingPickUpPoint;
    }

    public Device getDevicePickUpPoint() {
        return devicePickUpPoint;
    }

    public void setDevicePickUpPoint(Device devicePickUpPoint) {
        this.devicePickUpPoint = devicePickUpPoint;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Byte getRating() {
        return rating;
    }

    public void setRating(Byte rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}