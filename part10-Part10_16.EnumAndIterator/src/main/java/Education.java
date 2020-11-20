public enum Education {

    PHD ("Doctoral degree"),
    MA ("Masters degree"),
    BA ("Bachelors degree"),
    HS ("High School diploma");

    private String fullName;


    Education(String fullName) {
        this.fullName=fullName;
    }
}
