public class Teacher extends Employees{
    public Teacher(String name) {
        super(name);
    }

    public String working() {
        return "L'enseignant donne cours à ses élèves";
    }
}
