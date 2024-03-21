public enum Category {
    FIRST_CLASS("First Class", 10),
    BUSINESS("Business Class", 5),
    ECONOMY("Economy Class", 1);

    private String categoryName;
    private double multiplier;
    Category(String categoryName, double multiplier) {
        this.categoryName = categoryName;
        this.multiplier = multiplier;
    }
}
