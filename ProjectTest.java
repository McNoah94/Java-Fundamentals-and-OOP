public class ProjectTest{
    public static void main(String[] args){
        Project petShelter = new Project("Pet Shelter", "We're NOT gonna take a horse buddy.");
        Project get = new Project("some");
        Project glass = new Project();

        System.out.println(petShelter.elevatorPitch());
        System.out.println(get.elevatorPitch());
        System.out.println(glass.elevatorPitch());
    }
}