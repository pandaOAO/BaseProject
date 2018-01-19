package choice1.data;

public class Salon {

  String name;
  double level;
  double distance;
  String address;
  String phone;
  String businessHoursStart;
  String businessHoursEnd;

  // Salon的建構子
  Salon(String name, double level, double distance, String address, String phone, String businessHoursStart, String businessHoursEnd) {

    this.name = name;
    this.level = level;
    this.distance = distance;
    this.address = address;
    this.phone = phone;
    this.businessHoursStart = businessHoursStart;
    this.businessHoursEnd = businessHoursEnd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getbusinessHoursStart() {
    return businessHoursStart;
  }

  public void setbusinessHoursStart(String businessHoursStart) {
    this.businessHoursStart = businessHoursStart;
  }

}
