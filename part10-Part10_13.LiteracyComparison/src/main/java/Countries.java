public class Countries implements Comparable<Countries>{


    private String gender;
    private String country;
    private int year;
    private double rate;
    public Countries(String gender, String country, Integer year, double rate) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.rate = rate;
    }
    public double getRate() {
        return this.rate;
    }
    public int compareTo(Countries country) {
        if (this.getRate() == country.getRate()) {
            return 0;
        }
        if (this.getRate() > country.getRate()) {
            return 1;
        }
        return -1;
    }
    public String getGender() {
        String [] parts = this.gender.split(" ");
        return parts[1];
    }
    public String toString() {
        return (this.country + " (" + this.year + "), " + getGender() + ", " + this.rate);
    }
}
