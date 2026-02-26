public class AdministrativeStaff extends Employees{
    public AdministrativeStaff(String name) {
        super(name);
    }

    public String working() {
        return "Le personnel administratif fait de l'administration";
    }
}
