package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int pageNumber) {
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int counter = 0;
        int sum = 0;
        if (getAllPageNumber() > pageNumber) {
            for (CatalogItem catalogItem: catalogItems) {
                if (catalogItem.hasPrintedFeature() && catalogItem.numberOfPagesAtOneItem() > pageNumber) {
                    counter++;
                    sum += catalogItem.numberOfPagesAtOneItem();
                }
            }
            return sum / counter;
        }
        throw new IllegalArgumentException("No page");
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
                catalogItems.remove(catalogItem);
            }
            if (Validators.isEmpty(catalogItems)) {
                return;
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> catalogItemListBoth = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (searchCriteria.hasContributor() && searchCriteria.hasTitle()) {
                for (int i = 0; i < catalogItem.getContributors().size(); i++) {
                    for (int j = 0; j < catalogItem.getTitles().size(); j++) {
                        if (searchCriteria.getTitle().equals(catalogItem.getTitles().get(j))) {
                            if (searchCriteria.getContributor().equals(catalogItem.getContributors().get(i))) {
                                catalogItemListBoth.add(catalogItem);
                            }
                        }
                    }
                }
            }
            if (searchCriteria.hasContributor()) {
                List<CatalogItem> catalogItemListHasContributor = new ArrayList<>();
                for (int i = 0; i < catalogItem.getContributors().size(); i++) {
                    if (searchCriteria.getContributor().equals(catalogItem.getContributors().get(i))) {
                        catalogItemListHasContributor.add(catalogItem);
                    }
                }
                return catalogItemListHasContributor;
            }
            if (searchCriteria.hasTitle()) {
                List<CatalogItem> catalogItemListHasTitle = new ArrayList<>();
                for (int i = 0; i < catalogItem.getTitles().size(); i++) {
                    if (searchCriteria.getTitle().equals(catalogItem.getTitles().get(i))) {
                        catalogItemListHasTitle.add(catalogItem);
                    }
                }
                return catalogItemListHasTitle;
            }
        }
        return catalogItemListBoth;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                sum += catalogItem.numberOfPagesAtOneItem();
            }
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                catalogItemList.add(catalogItem);
            }
        }
        return catalogItemList;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                sum += catalogItem.fullLengthAtOneItem();
            }
        }
        return sum;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                catalogItemList.add(catalogItem);
            }
        }
        return catalogItemList;
    }
}
