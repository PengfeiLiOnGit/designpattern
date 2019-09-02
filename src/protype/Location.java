package protype;

/**
 * 地址类
 */
public class Location {
    private String province;

    private String city;

    public Location() {
    }

    public Location(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
