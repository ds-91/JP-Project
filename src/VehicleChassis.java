public class VehicleChassis implements Chassis {
    private String chassisName;

    public VehicleChassis() {
        this.chassisName = Chassis.chassis;
    }

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    // Don't understand
    @Override
    public Chassis getChassisType() {
        return new VehicleChassis();
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        this.chassisName = vehicleChassis;
    }

    @Override
    public String toString() {
        return "Chassis Name\t\t : " + this.chassisName;
    }

    public static void main(String[] args) {
        VehicleChassis vcDefault = new VehicleChassis();
        VehicleChassis vc = new VehicleChassis("Sample Chassis");

        System.out.println(vcDefault.toString());
        System.out.println(vc.toString());
    }
}
