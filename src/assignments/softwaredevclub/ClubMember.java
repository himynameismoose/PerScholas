package assignments.softwaredevclub;

public class ClubMember {
    private String name;
    private String city;
    private String state;
    private String faveProgrammingLang;

    public ClubMember(String name, String city, String state, String language) {
        this.name = name;
        this.city = city;
        this.state = state;
        faveProgrammingLang = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFaveProgrammingLang() {
        return faveProgrammingLang;
    }

    public void setFaveProgrammingLang(String faveProgrammingLang) {
        this.faveProgrammingLang = faveProgrammingLang;
    }
}
