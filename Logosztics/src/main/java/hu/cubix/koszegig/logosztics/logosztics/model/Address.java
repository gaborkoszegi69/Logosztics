package hu.cubix.koszegig.logosztics.logosztics.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity @Table(name = "address")
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
    @Column(name = "dr_longtude")
    private Long addressLongtude;

    public Address(Long addressId, String addressISOFCode, String addressZIP, String addressCity, String addressStreet, Long addressLatitude, Long addressLongtude) {
        this.addressId = addressId;
        this.addressISOFCode = addressISOFCode;
        this.addressZIP = addressZIP;
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
        this.addressLatitude = addressLatitude;
        this.addressLongtude = addressLongtude;
    }

    public Address() {
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
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

    public Long getAddressLongtude() {
        return addressLongtude;
    }

    public void setAddressLongtude(Long addressLongtude) {
        this.addressLongtude = addressLongtude;
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
                 && Objects.equals(addressLongtude, address.addressLongtude);
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
                ", addressLongtude=" + addressLongtude +
                '}';
    }
}
