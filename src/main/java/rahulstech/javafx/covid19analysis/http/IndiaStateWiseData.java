package rahulstech.javafx.covid19analysis.http;

import java.time.LocalDateTime;
import java.util.Map;

public class IndiaStateWiseData {

    private StateData total_values;
    private Map<String,StateData> state_wise;

    public static class StateData {
        private long active;
        private long confirmed;
        private long deaths;
        private long deltaconfirmed;
        private long deltadeaths;
        private long deltarecovered;
        private LocalDateTime lastupdatedtime;
        private long migratedother;
        private long recovered;
        private String state;
        private String statenotes;
        private Map<String,DistrictData> district;

        public StateData() {}

        public long getActive() {
            return active;
        }

        public void setActive(long active) {
            this.active = active;
        }

        public long getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(long confirmed) {
            this.confirmed = confirmed;
        }

        public long getDeaths() {
            return deaths;
        }

        public void setDeaths(long deaths) {
            this.deaths = deaths;
        }

        public long getDeltaconfirmed() {
            return deltaconfirmed;
        }

        public void setDeltaconfirmed(long deltaconfirmed) {
            this.deltaconfirmed = deltaconfirmed;
        }

        public long getDeltadeaths() {
            return deltadeaths;
        }

        public void setDeltadeaths(long deltadeaths) {
            this.deltadeaths = deltadeaths;
        }

        public long getDeltarecovered() {
            return deltarecovered;
        }

        public void setDeltarecovered(long deltarecovered) {
            this.deltarecovered = deltarecovered;
        }

        public LocalDateTime getLastupdatedtime() {
            return lastupdatedtime;
        }

        public void setLastupdatedtime(LocalDateTime lastupdatedtime) {
            this.lastupdatedtime = lastupdatedtime;
        }

        public long getMigratedother() {
            return migratedother;
        }

        public void setMigratedother(long migratedother) {
            this.migratedother = migratedother;
        }

        public long getRecovered() {
            return recovered;
        }

        public void setRecovered(long recovered) {
            this.recovered = recovered;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStatenotes() {
            return statenotes;
        }

        public void setStatenotes(String statenotes) {
            this.statenotes = statenotes;
        }

        public Map<String, DistrictData> getDistrict() {
            return district;
        }

        public void setDistrict(Map<String, DistrictData> district) {
            this.district = district;
        }
    }

    public static class DistrictData {
        private String notes;
        private long active;
        private long confirmed;
        private long migratedother;
        private long deceased;
        private long recovered;

        public DistrictData() {}

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public long getActive() {
            return active;
        }

        public void setActive(long active) {
            this.active = active;
        }

        public long getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(long confirmed) {
            this.confirmed = confirmed;
        }

        public long getMigratedother() {
            return migratedother;
        }

        public void setMigratedother(long migratedother) {
            this.migratedother = migratedother;
        }

        public long getDeceased() {
            return deceased;
        }

        public void setDeceased(long deceased) {
            this.deceased = deceased;
        }

        public long getRecovered() {
            return recovered;
        }

        public void setRecovered(long recovered) {
            this.recovered = recovered;
        }
    }

    public static class DeltaData {
        private long confirmed;
        private long deceased;
        private long recovered;

        public DeltaData() {}

        public long getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(long confirmed) {
            this.confirmed = confirmed;
        }

        public long getDeceased() {
            return deceased;
        }

        public void setDeceased(long deceased) {
            this.deceased = deceased;
        }

        public long getRecovered() {
            return recovered;
        }

        public void setRecovered(long recovered) {
            this.recovered = recovered;
        }
    }
}
