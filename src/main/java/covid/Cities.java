package covid;

public class Cities {

    private long id;
    private String zip;
    private String city;

    public Cities(String zip, String city) {
        this.zip = zip;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }
}
