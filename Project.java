

public class Project{
    private String name;
    private String description;

    public Project(){
        this.name = "Coding Dojo";
        this.description = "We're gonna take a horse buddy.";
    }

    public Project(String name){
        this.name = name;
        this.description = "We're gonna take a horse buddy.";
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch(){
        return this.name + ";" + this.description;
    }
}