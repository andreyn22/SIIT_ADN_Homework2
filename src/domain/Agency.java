package domain;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    String agencyName;
    List<Apartment> apartments = new ArrayList<>();

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public void removeApartment(Apartment apartment) {
        this.apartments.remove(apartment);
    }

    @Override
    public String toString() {
        return "Agency{" +
                "agencyName='" + agencyName + '\'' +
                ", apartments=" + apartments +
                '}';
    }
}
