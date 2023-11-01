public class DemoKubusBalok {
    public static void main(String[] args) {
        
        rumus kubus = new Kubus(7);
        System.out.println("Volume kubus: " + kubus.Volume());
        System.out.println("Luas permukaan kubus: " + kubus.LuasPermukaan());

       
        rumus balok = new Balok(2, 6, 3);
        System.out.println("Volume Balok: " + balok.Volume());
        System.out.println("Luas Permukaan Balok: " + balok.LuasPermukaan());
    }
}
