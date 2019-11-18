public class InteriorFeature implements Feature {

  private String feature;

  public InteriorFeature() {
    this.feature = "No Interior Features";
  }

  public InteriorFeature(String feature) {
    this.feature = feature;
  }

  @Override
  public String getFeature() {
    return this.feature;
  }

  @Override
  public void setFeature(String feature) {
    this.feature = feature;
  }

  @Override
  public String toString() {
    return "Interior [" + getFeature() + "]";
  }

  public static void main(String[] args) {
    InteriorFeature defaultFeature = new InteriorFeature();
    System.out.println(defaultFeature.toString());

    InteriorFeature definedFeature = new InteriorFeature("Climate Control");
    System.out.println(definedFeature.toString());
  }
}
