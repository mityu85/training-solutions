package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CatalogItem {

    private List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.features = Arrays.asList(feature);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        if (hasAudioFeature()) {
           for (int i = 0; i < features.size(); i++) {
               if (features.get(i) instanceof AudioFeatures) {
                  fullLength += ((AudioFeatures) features.get(i)).getLength();
               }
            }
        }
        return fullLength;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature: features) {
            for (int i = 0; i < feature.getContributors().size(); i++) {
                contributors.add(feature.getContributors().get(i));
            }
        }
        return  contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature: features) {
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature feature: features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        if (hasPrintedFeature()) {
            for (int i = 0; i < features.size(); i++) {
                if (features.get(i) instanceof PrintedFeatures) {
                    numberOfPages += ((PrintedFeatures) features.get(i)).getNumberOfPages();
                }
            }
        }
        return numberOfPages;
    }


}
