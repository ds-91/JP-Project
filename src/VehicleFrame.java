public class VehicleFrame implements Chassis {

    private String vehicleFrameType;

    public VehicleFrame() {
        this.vehicleFrameType = "Unibody";
    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public Chassis getChassisType() {
        return new VehicleFrame();
    }

    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String toString() {
        return "Vehicle Frame\t\t : " + this.vehicleFrameType;
    }

    public static void main(String[] args) {
        VehicleFrame vf = new VehicleFrame();
        VehicleChassis vc = new VehicleChassis();
        System.out.println(vc.toString());
        System.out.println(vf.toString());

        vf.setChassisType("Ladder Frame");
        System.out.println(vf.toString());
    }
}
