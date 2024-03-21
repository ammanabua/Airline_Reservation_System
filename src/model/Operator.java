package model;

public enum Operator {
    AMERICAN("American Airlines"),
    DELTA("Delta Airlines"),
    NORTHERN("Northern Airlines"),
    SPIRIT("Fly Spirit"),
    UNITED("United Airlines");

    private String value;

    Operator(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
