package week07d04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Lab {

    private String title;
    private boolean completed;
    LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        completed = true;
    }

    public void complete(LocalDate date) {
        completed = true;
        completedAt = date;
    }

    public void complete() {
        completedAt = LocalDate.now();
        completed = true;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
}
