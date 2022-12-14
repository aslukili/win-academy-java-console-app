package win.academy;

public class Address {
  private int id;
  private String country;
  private String city;
  private String postalCode;

  public Address(int id, String country, String city, String postalCode) {
    this.id = id;
    this.country = country;
    this.city = city;
    this.postalCode = postalCode;
  }

  public Address() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
}
