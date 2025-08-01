package hu.cubix.koszegig.logosztics.logosztics.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity @Table(schema="com",name = "address")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "dr_id")
    private Long addressId;
    @Column(name = "dr_isofcode")
    private String addressISOFCode;
    @Column(name = "dr_zip")
    private String addressZIP;
    @Column(name = "dr_city")
    private String addressCity;
    @Column(name = "dr_street")
    private String addressStreet;
    @Column(name = "dr_latitude")
    private Long addressLatitude;
    @Column(name = "dr_longitude")
    private Long addressLongitude;

    public Address(Long addressId, String addressISOFCode, String addressZIP, String addressCity, String addressStreet, Long addressLatitude, Long addressLongitude) {
        this.addressId = addressId;
        this.addressISOFCode = addressISOFCode;
        this.addressZIP = addressZIP;
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
        this.addressLatitude = addressLatitude;
        this.addressLongitude = addressLongitude;
    }

    public Address() {
    }

    public Long getaddressId() {
        return addressId;
    }

    public void setaddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressISOFCode() {
        return addressISOFCode;
    }

    public void setAddressISOFCode(String addressISOFCode) {
        this.addressISOFCode = addressISOFCode;
    }

    public String getAddressZIP() {
        return addressZIP;
    }

    public void setAddressZIP(String addressZIP) {
        this.addressZIP = addressZIP;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Long getAddressLatitude() {
        return addressLatitude;
    }

    public void setAddressLatitude(Long addressLatitude) {
        this.addressLatitude = addressLatitude;
    }

    public Long getAddressLongitude() {
        return addressLongitude;
    }

    public void setAddressLongitude(Long addressLongitude) {
        this.addressLongitude = addressLongitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address address = (Address) obj;
        return Objects.equals(addressId, address.addressId)
                 && Objects.equals(addressISOFCode, address.addressISOFCode)
                 && Objects.equals(addressZIP, address.addressZIP)
                 && Objects.equals(addressCity, address.addressCity)
                 && Objects.equals(addressStreet, address.addressStreet)
                 && Objects.equals(addressLatitude, address.addressLatitude)
                 && Objects.equals(addressLongitude, address.addressLongitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", addressISOFCode='" + addressISOFCode + '\'' +
                ", addressZIP='" + addressZIP + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressLatitude=" + addressLatitude +
                ", addressLongitude=" + addressLongitude +
                '}';
    }
}
