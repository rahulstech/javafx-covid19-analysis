package rahulstech.javafx.covid19analysis.http;

import java.time.LocalDateTime;
import java.util.List;

public class WorldData {

    private List<CountryTotal> countries_stat;
    private LocalDateTime statistic_taken_at;
    private WorldTotal world_total;

    public WorldData() {}

    public List<CountryTotal> getCountries_stat() {
        return countries_stat;
    }

    public void setCountries_stat(List<CountryTotal> countries_stat) {
        this.countries_stat = countries_stat;
    }

    public LocalDateTime getStatistic_taken_at() {
        return statistic_taken_at;
    }

    public void setStatistic_taken_at(LocalDateTime statistic_taken_at) {
        this.statistic_taken_at = statistic_taken_at;
    }

    public WorldTotal getWorld_total() {
        return world_total;
    }

    public void setWorld_total(WorldTotal world_total) {
        this.world_total = world_total;
    }

    public static class CountryTotal {
        private String country_name;
        private long cases;
        private long deaths;
        private long total_recovered;
        private long new_deaths;
        private long new_cases;
        private long serious_critical;
        private long active_cases;
        private long total_cases_per_1m_population;
        private long deaths_per_1m_population;
        private long total_tests;
        private long tests_per_1m_population;

        public CountryTotal() {}

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public long getCases() {
            return cases;
        }

        public void setCases(long cases) {
            this.cases = cases;
        }

        public long getDeaths() {
            return deaths;
        }

        public void setDeaths(long deaths) {
            this.deaths = deaths;
        }

        public long getTotal_recovered() {
            return total_recovered;
        }

        public void setTotal_recovered(long total_recovered) {
            this.total_recovered = total_recovered;
        }

        public long getNew_deaths() {
            return new_deaths;
        }

        public void setNew_deaths(long new_deaths) {
            this.new_deaths = new_deaths;
        }

        public long getNew_cases() {
            return new_cases;
        }

        public void setNew_cases(long new_cases) {
            this.new_cases = new_cases;
        }

        public long getSerious_critical() {
            return serious_critical;
        }

        public void setSerious_critical(long serious_critical) {
            this.serious_critical = serious_critical;
        }

        public long getActive_cases() {
            return active_cases;
        }

        public void setActive_cases(long active_cases) {
            this.active_cases = active_cases;
        }

        public long getTotal_cases_per_1m_population() {
            return total_cases_per_1m_population;
        }

        public void setTotal_cases_per_1m_population(long total_cases_per_1m_population) {
            this.total_cases_per_1m_population = total_cases_per_1m_population;
        }

        public long getDeaths_per_1m_population() {
            return deaths_per_1m_population;
        }

        public void setDeaths_per_1m_population(long deaths_per_1m_population) {
            this.deaths_per_1m_population = deaths_per_1m_population;
        }

        public long getTotal_tests() {
            return total_tests;
        }

        public void setTotal_tests(long total_tests) {
            this.total_tests = total_tests;
        }

        public long getTests_per_1m_population() {
            return tests_per_1m_population;
        }

        public void setTests_per_1m_population(long tests_per_1m_population) {
            this.tests_per_1m_population = tests_per_1m_population;
        }
    }

    public static class WorldTotal {
        private long total_cases;
        private long new_cases;
        private long total_deaths;
        private long new_deaths;
        private long total_recovered;
        private long active_cases;
        private long serious_critical;
        private long total_cases_per_1m_population;
        private double deaths_per_1m_population;
        private LocalDateTime statistic_taken_at;

        public WorldTotal() {}

        public long getTotal_cases() {
            return total_cases;
        }

        public void setTotal_cases(long total_cases) {
            this.total_cases = total_cases;
        }

        public long getNew_cases() {
            return new_cases;
        }

        public void setNew_cases(long new_cases) {
            this.new_cases = new_cases;
        }

        public long getTotal_deaths() {
            return total_deaths;
        }

        public void setTotal_deaths(long total_deaths) {
            this.total_deaths = total_deaths;
        }

        public long getNew_deaths() {
            return new_deaths;
        }

        public void setNew_deaths(long new_deaths) {
            this.new_deaths = new_deaths;
        }

        public long getTotal_recovered() {
            return total_recovered;
        }

        public void setTotal_recovered(long total_recovered) {
            this.total_recovered = total_recovered;
        }

        public long getActive_cases() {
            return active_cases;
        }

        public void setActive_cases(long active_cases) {
            this.active_cases = active_cases;
        }

        public long getSerious_critical() {
            return serious_critical;
        }

        public void setSerious_critical(long serious_critical) {
            this.serious_critical = serious_critical;
        }

        public long getTotal_cases_per_1m_population() {
            return total_cases_per_1m_population;
        }

        public void setTotal_cases_per_1m_population(long total_cases_per_1m_population) {
            this.total_cases_per_1m_population = total_cases_per_1m_population;
        }

        public double getDeaths_per_1m_population() {
            return deaths_per_1m_population;
        }

        public void setDeaths_per_1m_population(double deaths_per_1m_population) {
            this.deaths_per_1m_population = deaths_per_1m_population;
        }

        public LocalDateTime getStatistic_taken_at() {
            return statistic_taken_at;
        }

        public void setStatistic_taken_at(LocalDateTime statistic_taken_at) {
            this.statistic_taken_at = statistic_taken_at;
        }
    }
}
