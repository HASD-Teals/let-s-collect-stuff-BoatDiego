public class Collectable {
    // Add collectable properties here
    private int susLevel;
    private String Name;
    private String Color;
    private boolean imposter;
    private boolean thicc;
    private boolean vent;   
    private int bodies;
    // Add collectable constructors here
    public Collectable(){
        this.susLevel = 0;
        this.Name = "";
        this.Color = "";
        this.imposter = false;
        this.thicc = true;
        this.vent = false;
        this.bodies = 0;
    }
    public Collectable(int susLevel, String Name, String Color, boolean imposter, boolean thicc, boolean vent, 
    int bodies){
        this.susLevel = susLevel;
        this.Name = Name;
        this.Color = Color;
        this.imposter = imposter;
        this.thicc = thicc;
        this.vent = vent;
        this.bodies = bodies;
    }
    
    // Add collectable accessors and mutators here

    // Add any methods here
}