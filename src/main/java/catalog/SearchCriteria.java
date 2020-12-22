package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String contributor, String title) {
        if (Validators.isBlank(title) || Validators.isBlank(contributor)) {
            throw new IllegalArgumentException();
        }
        SearchCriteria searchCriteria = new SearchCriteria(contributor, title);
        return searchCriteria;
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException();
        }
        SearchCriteria searchCriteria = new SearchCriteria(contributor, null);
        return searchCriteria;
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException();
        }
        SearchCriteria searchCriteria = new SearchCriteria(null, title);
        return searchCriteria;
    }

    public boolean hasContributor() {
        return contributor != null;
    }

    public boolean hasTitle() {
        return title != null;
    }
}
