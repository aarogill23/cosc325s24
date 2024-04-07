public class moon extends CelestialBodyImpl {

    public moon(String name, double x, double y, float movementBehavior, float degreesRotated) {
        super(name, x, y, movementBehavior, degreesRotated);
    }

    private float degreesRotated = 0.0f;

    public String getName() {
        return "Moon";
    }
    public String getPosition() {
        return "Orbiting Earth";
    }
    public float getMovementBehavior() {
        return (360 / 27);
    }
    public float getDegreesRotated() {
        return degreesRotated;
    }

}
