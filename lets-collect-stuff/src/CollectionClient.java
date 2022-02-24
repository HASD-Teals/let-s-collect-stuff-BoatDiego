import java.util.ArrayList;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        List<Collectable> Amogus  = new ArrayList<>(); 
        Collectable redAmogus= new Collectable(10, "Sussy Baka", "red", true, true, true, 5, 10);  );
        Amogus.add(redAmogus);

        // e.g. List<Collectable> collection = new ArrayList<Collectable>();

        // Add collection methods here to manage and manipulate the collection
    }

    public static int countItems(ArrayList<Collectable> Amogus) {
        int nums = Amogus.size();

        return nums;
    }

    public static double totalDrip(ArrayList<Collectable> Amogus) {
        int drip = 0;
        for (int i = 0; i < Amogus.size(); i++) {
            Collectable temps = Amogus.get(i);
            drip += temps.dripLevel();
        }

        return drip;
    }

    public static Collectable display(int i, ArrayList<Collectable> Amogus) {
        Collectable temps = Amogus.get(i);

        return temps;
    }

    public static Collectable display(String name, ArrayList<Collectable> Amogus) {
        Collectable fin = null;
        for (int i = 0; i < Amogus.size(); i++) {
            Collectable temps = Amogus.get(i);
            if (name.equalsIgnoreCase(temps.getName())) {
                fin = temps;
            } else {
                System.out.println("Could not find AMOGUS by name");
            }

        }
        return fin;
    }

    public static void displayAll(ArrayList<Collectable> Amogus) {
        for (int i = 0; i < Amogus.size(); i++) {
            Collectable tempy = Amogus.get(i);
            System.out.print("Number " + i + 1 +
                    "\nName: " + tempy.getName() +
                    "\nColor: " + tempy.getColor() +
                    "\nSus Level: " + tempy.getSusLevel() +
                    "\nis Imposter: " + tempy.getImposter() +
                    "\nIs Thicc:" + tempy.getThicc() +
                    "\nvented: " + tempy.getVent() +
                    "\nbodies: " + tempy.getBodies() +
                    "\nDRIP LEVEL: " + tempy.dripLevel());
            System.out.println("\n\n");

        }

    }
}
