package enums;

public enum Gender {
    M("Masculino"),
    F("Feminino");

    //
    private String genderDescription;

    //
    private Gender(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    //
    @Override
    public String toString() {
        return genderDescription;
    }
}
