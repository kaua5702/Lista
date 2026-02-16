package kauabiscotto;

public class User {

    private String firtName;
    private String lastName;

    public User(String firtName, String lastName) {
        this.firtName = firtName.toUpperCase();
        this.lastName = lastName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirtName() {
        return firtName;
    }

}
