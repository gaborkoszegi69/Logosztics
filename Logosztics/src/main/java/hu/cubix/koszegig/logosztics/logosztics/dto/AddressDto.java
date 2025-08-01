package hu.cubix.koszegig.logosztics.logosztics.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AddressDto {

    private Long Id;
    @NotNull
    @NotEmpty
    private String ISOFCode;
    @NotNull
    @NotEmpty
    private String ZIP;
    @NotNull
    @NotEmpty
    private String city;
    @NotNull
    @NotEmpty
    private String street;
    @NotNull
    @NotEmpty
    private Long latitude;
    @NotNull
    @NotEmpty
    private Long longitude;

    public AddressDto(Long id, String ISOFCode, String ZIP, String city, String street, Long latitude, Long longitude) {
        Id = id;
        this.ISOFCode = ISOFCode;
        this.ZIP = ZIP;
        this.city = city;
        this.street = street;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public AddressDto() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getISOFCode() {
        return ISOFCode;
    }

    public void setISOFCode(String ISOFCode) {
        this.ISOFCode = ISOFCode;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
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

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "Id=" + Id +
                ", ISOFCode='" + ISOFCode + '\'' +
                ", ZIP='" + ZIP + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
