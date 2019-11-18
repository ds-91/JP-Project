import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date(2012, 2, 2);
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "Generic";
    this.engineCylinders = 0;
    this.driveTrain = "2WD: Two-Wheel Drive";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType,
      int engineCylinders,String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  @Override
  public String toString() {
    return "Engine Manufacturer : " + this.engineManufacturer + "\n" +
        "Engine Manufactured : " + this.engineManufacturedDate.toString() + "\n"+
        "Engine Make : " + this.engineMake + "\n" +
        "Engine Model : " + this.engineModel + "\n" +
        "Engine Type : " + this.engineType + "\n" +
        "Engine Cylinders : " + this.engineCylinders + "\n" +
        "Drive Train : " + this.driveTrain + "\n";
  }

  public static void main(String[] args) {
    ManufacturedEngine genericEngine = new ManufacturedEngine();
    ManufacturedEngine specificEngine = new ManufacturedEngine("Honda", new Date()
        , "H-Series", "H23A1"
        , "2WD: Two-Wheel Drive", 4
        , "88 AKI");

    // Print generic engine
    System.out.println(genericEngine.toString());

    // Print specific
    System.out.println(specificEngine.toString());
  }
}
