public class Director extends Employees{
    public Director(String name) {
        super(name);
    }

    public String working() {
        return "Le directeur s'occupe de la paperasse";
    }
}
