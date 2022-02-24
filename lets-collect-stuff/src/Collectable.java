
public class Collectable {
    // Add collectable properties here
    private int susLevel;
    private String Name;
    private String Color;
    private boolean imposter;
    private boolean thicc;
    private boolean vent;
    private int bodies;
    private double dripLevel;

    // Add collectable constructors here
    public Collectable() {
        this.susLevel = 0;
        this.Name = "";
        this.Color = "";
        this.imposter = false;
        this.thicc = true;
        this.vent = false;
        this.bodies = 0;
        this.dripLevel = 0;
    }
/**
 * Parameters for collectable
 * @param susLevel
 * @param Name
 * @param Color
 * @param imposter
 * @param thicc
 * @param vent
 * @param bodies
 * @param dripLevel
 */
    public Collectable(int susLevel, String Name, String Color, boolean imposter, boolean thicc, boolean vent,
            int bodies, double dripLevel) {
        this.susLevel = susLevel;
        this.Name = Name;
        this.Color = Color;
        this.imposter = imposter;
        this.thicc = thicc;
        this.vent = vent;
        this.bodies = bodies;
        this.dripLevel = dripLevel;
    }

    // accessors
    public int getSusLevel() {
        return this.susLevel;
    }

    public String getName() {
        return this.Name;
    }

    public String getColor() {
        return this.Color;
    }

    public boolean getImposter() {
        return this.imposter;
    }

    public boolean getThicc() {
        return this.thicc;
    }

    public boolean getVent() {
        return this.vent;
    }

    public int getBodies() {
        return this.bodies;
    }

    public double dripLevel() {
        return this.dripLevel;
    }

    // mutators
    public void setSusLevel(int susLevel) {
        this.susLevel = susLevel;
    }

    public void setBodies(int bodies) {
        this.bodies = bodies;
    }

    public void setDripLevel(double dripLevel) {
        this.dripLevel = dripLevel;
    }

    public void setImposter(boolean imposter) {
        this.imposter = imposter;
    }

    public void setThicc(boolean thicc) {
        this.thicc = thicc;
    }

    public void setVent(boolean vent) {
        this.vent = vent;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    // Add any methods here
    public boolean isEqual(Collectable com) {
        boolean equal = true;
        if (this.Name.equalsIgnoreCase(com.getColor())) {
            System.out.println("They have the same colors with " + this.Color + " " + com.Color);
        } else {
            System.out.println("Not same colors");
            equal = false;
        }
        if (this.imposter == com.getImposter()) {

            System.out.println("Both are imposters with " + this.imposter + " " + com.imposter);
        } else {
            System.out.println("both are not imposters");
            equal = false;
        }
        if (this.thicc == com.getThicc()) {

            System.out.println("Both are very Thicc " + this.thicc + " " + com.thicc);
        } else {
            System.out.println("Not thicc enough for each other");
            equal = false;
        }
        if (this.vent == com.getVent()) {

            System.out.println("They both vented " + this.vent + " " + com.vent);
        } else {
            System.out.println("one vented here, one did not");
            equal = false;
        }
        if (this.susLevel == com.susLevel) {
            System.out.println("Both are sus with " + this.susLevel + " " + com.susLevel);
        } else {
            System.out.println("Not same sus level");
            equal = false;
        }
        if (this.dripLevel == com.dripLevel) {
            System.out.println("Both are drippy af equally with " + this.dripLevel + " " + com.dripLevel);
        } else {
            System.out.println("Not same drip level, someone more dripped out");
            equal = false;
        }
        return equal;
    }




}