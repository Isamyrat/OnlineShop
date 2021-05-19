package org.own.OnlineShop.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private Date year;

    @Lob
    @Column(name = "img")
    private byte[] img;

    @Column(name = "count")
    private Integer count;

    @Column(name = "price")
    private Double price;

    @Column(name = "rating")
    private Byte rating;

    @Column(name = "create_at")
    private Date createAt;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id", nullable = false)
    private TypeOfDevice typeOfDevice;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brandDevice;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", nullable = false)
    private Category categoryDevice;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategory_id", nullable = false)
    private Subcategory subcategoryDevice;

    @OneToMany(mappedBy = "devicePickUpPoint", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<PickUpPoint> pickUpPointDevice;

    @OneToOne(mappedBy = "deviceBasketDevice")
    private BasketDevice basketDeviceDevice;

    @OneToMany(mappedBy = "deviceRating", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Rating> ratingDevice;

    @OneToMany(mappedBy = "deviceInformation", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<DeviceInformation> deviceInformationDevice;

    @OneToMany(mappedBy = "deviceOrders", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Orders> ordersDevice;

    public Device() {
    }

    public List<PickUpPoint> getPickUpPointDevice() {
        return pickUpPointDevice;
    }

    public void setPickUpPointDevice(List<PickUpPoint> pickUpPointDevice) {
        this.pickUpPointDevice = pickUpPointDevice;
    }

    public List<Orders> getOrdersDevice() {
        return ordersDevice;
    }

    public void setOrdersDevice(List<Orders> ordersDevice) {
        this.ordersDevice = ordersDevice;
    }

    public List<DeviceInformation> getDeviceInformationDevice() {
        return deviceInformationDevice;
    }

    public void setDeviceInformationDevice(List<DeviceInformation> deviceInformationDevice) {
        this.deviceInformationDevice = deviceInformationDevice;
    }

    public List<Rating> getRatingDevice() {
        return ratingDevice;
    }

    public void setRatingDevice(List<Rating> ratingDevice) {
        this.ratingDevice = ratingDevice;
    }

    public BasketDevice getBasketDeviceDevice() {
        return basketDeviceDevice;
    }

    public void setBasketDeviceDevice(BasketDevice basketDeviceDevice) {
        this.basketDeviceDevice = basketDeviceDevice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Byte getRating() {
        return rating;
    }

    public void setRating(Byte rating) {
        this.rating = rating;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public TypeOfDevice getTypeOfDevice() {
        return typeOfDevice;
    }

    public void setTypeOfDevice(TypeOfDevice typeOfDevice) {
        this.typeOfDevice = typeOfDevice;
    }

    public Brand getBrandDevice() {
        return brandDevice;
    }

    public void setBrandDevice(Brand brandDevice) {
        this.brandDevice = brandDevice;
    }

    public Category getCategoryDevice() {
        return categoryDevice;
    }

    public void setCategoryDevice(Category categoryDevice) {
        this.categoryDevice = categoryDevice;
    }

    public Subcategory getSubcategoryDevice() {
        return subcategoryDevice;
    }

    public void setSubcategoryDevice(Subcategory subcategoryDevice) {
        this.subcategoryDevice = subcategoryDevice;
    }

}