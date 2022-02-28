import java.util.ArrayList;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        List<Collectable> Amogus = new ArrayList<>();
        Collectable redAmogus = new Collectable(10, "Sussy Baka", "red", true, true, true, 5, 100);
        Collectable blueAmogus  = new Collectable(9, "Blue Baka", "Blue", true, true, false, 0, 64);
        Collectable yellowAmogus = new Collectable(8, "thicc Baca", "yellow",true, true, false, 22, 87);
        Amogus.add(redAmogus);
        Amogus.add(blueAmogus);
        Amogus.add(yellowAmogus);

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

    public static void displaySingleTraits(ArrayList<Collectable> Amogus, String input) {

        switch (input) {
            case "Name":
                System.out.println("List of Names:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getName());
                }
                break;
            case "Color":
                System.out.println("List of Colors:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getColor());
                }
                break;
            case "Sus Level":
                System.out.println("List of Sus Levels:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getSusLevel());
                }
                break;
            case "Imposter":
                System.out.println("List of Imposters:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getImposter());
                }
                break;
            case "Thicc":
                System.out.println("List of Thiccs:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getThicc());
                }
                break;

            case "vented":
                System.out.println("List of Vented:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getVent());
                }
                break;
            case "bodies":
                System.out.println("List of Bodies:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.getBodies());
                }
                break;
            case "Drip Level":
                System.out.println("List of Drip Level:\n");
                for (int i = 0; i < Amogus.size(); i++) {
                    Collectable temps = Amogus.get(i);
                    System.out.println(i + " " + temps.dripLevel());
                }
                break;
        }

    }

    public static ArrayList<Collectable> ELIMINATE_ALL_AMOGUS(ArrayList<Collectable> Amogus) {
        for (int i = 0; i < Amogus.size(); i++) {
            Amogus.remove(i);

        }
        return Amogus;
    }

    public static ArrayList<Collectable> ELIMINATE_ONE_AMOGUS(ArrayList<Collectable> Amogus, int index) {
        Amogus.remove(index);
        return Amogus;
    }

}
