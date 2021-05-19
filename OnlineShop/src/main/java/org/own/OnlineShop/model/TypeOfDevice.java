package org.own.OnlineShop.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "type")
public class TypeOfDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "img")
    private byte[] img;

    @OneToMany(mappedBy = "typeCategory", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Category> categoryType;

    @OneToMany(mappedBy = "typeOfDevice", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Device> deviceTypeOfDevices;

    public TypeOfDevice() {
    }

    public List<Device> getDeviceTypeOfDevices() {
        return deviceTypeOfDevices;
    }

    public void setDeviceTypeOfDevices(List<Device> deviceTypeOfDevices) {
        this.deviceTypeOfDevices = deviceTypeOfDevices;
    }


    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public List<Category> getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(List<Category> categoryType) {
        this.categoryType = categoryType;
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
}
