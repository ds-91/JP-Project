public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  public ExteriorFeature() {
    this.exteriorFeature = "No Exterior Features";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String toString() {
    return "Exterior [" + getFeature() + "]";
  }

  public static void main(String[] args) {
    ExteriorFeature defaultFeature = new ExteriorFeature();
    System.out.println(defaultFeature.toString());

    ExteriorFeature definedFeature = new ExteriorFeature("Fog Lamps");
    System.out.println(definedFeature.toString());
  }
}
