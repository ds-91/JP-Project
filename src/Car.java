import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();

    Feature[] tempFeatures = {new InteriorFeature(), new ExteriorFeature()};
    this.feature = tempFeatures;
    this.carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {
    StringBuilder sb = new StringBuilder();
    for (Feature f : feature) {
      if (f instanceof ExteriorFeature) {
        sb.append(f + "\n" + "\t\t\t\t\t\t\t\t\t\t\t\t ");
      }
    }
    return sb.toString();
  }

  public String getInteriorFeatures() {
    StringBuilder sb = new StringBuilder();
    for (Feature f : feature) {
      if (f instanceof InteriorFeature) {
        sb.append(f + "\n" + "\t\t\t\t\t\t\t\t\t\t\t\t ");
      }
    }
    return sb.toString();
  }

  @Override
  public String toString() {
    return super.toString() + "Features \t\t\t\t\t\t\t : " + this.getInteriorFeatures() + "\n"
        + "\t\t\t\t\t\t\t\t\t\t\t : " + this.getExteriorFeatures() + "\nCar Axle: " + this.carAxle;
  }

  public static void main(String[] args) {
    // default Car
    Car c = new Car();
    System.out.println(c.toString());

    // full constructor
    InteriorFeature radio = new InteriorFeature("AM/FM Radio");
    InteriorFeature ac = new InteriorFeature("Air Conditioning");
    ExteriorFeature woodPanels = new ExteriorFeature("Wood Panels");
    ExteriorFeature roof = new ExteriorFeature("Moonroof");

    Feature[] features = {radio, ac, woodPanels, roof};
    VehicleFrame vf = new VehicleFrame();
    ManufacturedEngine me = new ManufacturedEngine("Honda", new Date(2019, 2, 2), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");
    VehicleChassis vc = new VehicleChassis();
    Vehicle v = new Vehicle(new Date(2019, 2, 2), "Honda", "Honda", "Prelude", null, null, "2WD: Two-Wheel Drive", me);
    Car fullCar = new Car(v.getVehicleManufacturedDate(), v.getVehicleManufacturer(), v.getVehicleMake(), v.getVehicleModel(), vf.getChassisType(), v.getVehicleType(), v.getDriveTrain(), me, features, 2);
    System.out.println(fullCar.toString());
  }
}
