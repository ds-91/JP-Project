import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  public Vehicle() {
    this.vehicleManufacturedDate = new Date(2019,10,7);
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = "Generic";
    // The 'whats wrong' shows that driveTrain should be 2WD: Two-Wheel Drive,
    // but the instructions on the right show that this should be Generic.
    // Not sure which to use so I will follow the instructions on the right.
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame,
      String vehicleType,String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  public Date getVehicleManufacturedDate() {
    return vehicleManufacturedDate;
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public String getVehicleMake() {
    return vehicleMake;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public Chassis getVehicleFrame() {
    return vehicleFrame;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  public Engine getVehicleEngine() {
    return vehicleEngine;
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  @Override
  public String toString() {
    return "Manufacturer Name : " + getVehicleManufacturer() + "\n" +
        "Manufactured Date : " + getVehicleManufacturedDate() + "\n" +
        "Vehicle Make : " + getVehicleMake() + "\n" +
        "Vehicle Model : " + getVehicleModel() + "\n" +
        "Vehicle Type : " + getVehicleType() + "\n" + vehicleEngine.toString();
  }

  public static void main(String[] args) {
    Vehicle defaultVehicle = new Vehicle();
    System.out.println(defaultVehicle.toString());

    VehicleChassis vc = new VehicleChassis("Sample Chassis");
    ManufacturedEngine me = new ManufacturedEngine("Honda", new Date(2001, 10, 10), "Honda", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI");

    Vehicle definedVehicle = new Vehicle(new Date(2019, 2, 15), "Honda", "Honda", "Prelude", vc, "Type", "AWD", me);
    System.out.println(definedVehicle.toString());
  }
}
