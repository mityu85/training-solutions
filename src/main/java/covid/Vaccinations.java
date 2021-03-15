package covid;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vaccinations {

    private long id;
    private Citizens citizensId;
    private LocalDateTime vaccinationDate;
    private String status;
    private String note;
    private VaccinationType vaccinationType;

    public Vaccinations(Citizens citizensId, LocalDateTime vaccinationDate, String status, String note, VaccinationType vaccinationType) {
        this.citizensId = citizensId;
        this.vaccinationDate = vaccinationDate;
        this.status = status;
        this.note = note;
        this.vaccinationType = vaccinationType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Citizens getCitizensId() {
        return citizensId;
    }

    public LocalDateTime getVaccinationDate() {
        return vaccinationDate;
    }

    public String getStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

    public VaccinationType getVaccinationType() {
        return vaccinationType;
    }
}
