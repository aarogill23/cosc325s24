public abstract class CelestialBodyImpl implements celestialBody{
    private String name;
    private double x, y;
    private float movementBehavior;
    private float degreesRotated;

    public CelestialBodyImpl(String name, double x, double y, float movementBehavior, float degreesRotated){
        this.name = name;
        this.x = x;
        this.y = y;
        this.movementBehavior = movementBehavior;
        this.degreesRotated = degreesRotated;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getPosition(){
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public float getMovementBehavior(){
        return this.movementBehavior;
    }

    @Override
    public float getDegreesRotated(){
        return this.degreesRotated;
    }

    public void Move(){
        this.degreesRotated += this.movementBehavior;
    }
}
