package pl.woelke.vjpassapp.model;

public class Dailypass {

    private Long id;
    private String dailypass;

    public Dailypass() {
    }

    public Dailypass(Long id, String dailypass) {
        this.id = id;
        this.dailypass = dailypass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDailypass() {
        return dailypass;
    }

    public void setDailypass(String dailypass) {
        this.dailypass = dailypass;
    }

    @Override
    public String toString() {
        return "Dailypass{" +
                "id=" + id +
                ", dailypass='" + dailypass + '\'' +
                '}';
    }
}
