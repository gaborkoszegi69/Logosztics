package hu.cubix.koszegig.logosztics.logosztics.dto;


public class AddressDto {
    private Long Id;
    private String ISOFCode;
    private String ZIP;
    private String city;
    private String street;
    private Long latitude;
    private Long longtude;

    public AddressDto(Long id, String ISOFCode, String ZIP, String city, String street, Long latitude, Long longtude) {
        Id = id;
        this.ISOFCode = ISOFCode;
        this.ZIP = ZIP;
        this.city = city;
        this.street = street;
        this.latitude = latitude;
        this.longtude = longtude;
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

    public Long getLongtude() {
        return longtude;
    }

    public void setLongtude(Long longtude) {
        this.longtude = longtude;
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
                ", longtude=" + longtude +
                '}';
    }
}
