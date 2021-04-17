package exam02.photo;

public class Photo implements Qualified {

    private String name;
    private Quality quality;

    public Photo(String name) {
        this.name = name;
    }

    public Photo(String name, Quality quality) {
        this(name);
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Quality getQuality() {
        if (quality == null) {
            quality = Quality.NO_STAR;
        }
        return quality;
    }

    @Override
    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}
