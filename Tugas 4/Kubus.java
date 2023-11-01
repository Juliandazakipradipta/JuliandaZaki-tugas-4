public class Kubus extends rumus{
    private double s;

    public Kubus(double s) {
        this.s = s;
    }

    @Override
    public double Volume() {
        //rumus volume kubus = sisi^3
        return s*s*s;
    }

    @Override
    public double LuasPermukaan() {
        return 6 * s * s;
    }
}
