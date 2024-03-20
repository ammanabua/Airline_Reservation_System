public enum Category {
    FIRST_CLASS("First Class"),
    BUSINESS("Business Class"),
    ECONOMY(("Economy Class"));

    private String categoryName;
    Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
