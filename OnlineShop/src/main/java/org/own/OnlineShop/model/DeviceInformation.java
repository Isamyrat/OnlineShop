package org.own.OnlineShop.model;

import javax.persistence.*;


@Entity
@Table(name = "Device_Information")
public class DeviceInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id", nullable = false)
    private Device deviceInformation;

    public DeviceInformation() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Device getDeviceInformation() {
        return deviceInformation;
    }

    public void setDeviceInformation(Device deviceInformation) {
        this.deviceInformation = deviceInformation;
    }
}

