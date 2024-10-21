package org.example;

public class User {
    private static final int maxWarnings = 3;

    private String name;
    private String password;
    private String email;
    private String adress;
    private int warnings = 0;
    private double totalCO2Emissions = 0; //kg
    private double totalWeightThrown = 0; //kg
    private boolean hasAccess = true;

    public User(String name, String email, String adress) {
        this.name = name;
        this.email = email;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        this.password = password;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getWarnings() {
        return warnings;
    }

    public void setWarnings(int warnings) {
        this.warnings = warnings;
    }

    public double getTotalCO2Emissions() {
        return totalCO2Emissions;
    }

    public void setTotalCO2Emissions(double totalCO2Emissions) {
        this.totalCO2Emissions = totalCO2Emissions;
    }

    public double getTotalWeightThrown() {
        return totalWeightThrown;
    }

    public void setTotalWeightThrown(int totalWeightThrown) {
        this.totalWeightThrown = totalWeightThrown;
    }

    public boolean isHasAccess() {
        return hasAccess;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }
}

