package rahulstech.javafx.covid19analysis.http;

import java.time.LocalDate;

public class IndiaTimeline {

    private int dailyconfirmed;
    private int dailydeceased;
    private int dailyrecovered;
    private LocalDate dateymd;
    private int totalconfirmed;
    private int totaldeceased;
    private int totalrecovered;

    public IndiaTimeline() {}

    public int getDailyconfirmed() {
        return dailyconfirmed;
    }

    public void setDailyconfirmed(int dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    public int getDailydeceased() {
        return dailydeceased;
    }

    public void setDailydeceased(int dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    public int getDailyrecovered() {
        return dailyrecovered;
    }

    public void setDailyrecovered(int dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    public LocalDate getDateymd() {
        return dateymd;
    }

    public void setDateymd(LocalDate dateymd) {
        this.dateymd = dateymd;
    }

    public int getTotalconfirmed() {
        return totalconfirmed;
    }

    public void setTotalconfirmed(int totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    public int getTotaldeceased() {
        return totaldeceased;
    }

    public void setTotaldeceased(int totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    public int getTotalrecovered() {
        return totalrecovered;
    }

    public void setTotalrecovered(int totalrecovered) {
        this.totalrecovered = totalrecovered;
    }
}
