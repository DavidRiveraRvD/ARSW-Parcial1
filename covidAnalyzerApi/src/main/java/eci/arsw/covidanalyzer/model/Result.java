package eci.arsw.covidanalyzer.model;


import java.util.UUID;

public class Result {
    private UUID id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String birthString;
    private String testString;
    private boolean result;
    private double testSpecifity;
    private int testRealize;
    private ResultType resultType;

    public Result(UUID id, String firstName, String lastName, String gender, String email, String birthString, String testString, boolean result, double testSpecifity, ResultType resultType, int testRealize){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.birthString = birthString;
        this.testString = testString;
        this.result = result;
        this.testSpecifity = testSpecifity;
        this.resultType = resultType;
        this.testRealize = testRealize;
    }

    public int getRealize() {
        return testRealize;
    }

    public void setRealize(int testNumber) {
        this.testRealize = testNumber;
    }

    public void setType(ResultType type) {
        this.resultType = type;
    }

    public ResultType getType() {
        return resultType;
    }

    public String toString() {
        return this.id.toString() + " - " + this.firstName + " - " + this.lastName;
    }
    public UUID getId(){
        return id;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return ((Result) o).getId().equals(this.id);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthString() {
        return birthString;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthString(String birthString) {
        this.birthString = birthString;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isResult() {
        return result;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getTestSpecifity() {
        return testSpecifity;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getTestString() {
        return testString;
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public void setTestRealize(int testRealize) {
        this.testRealize = testRealize;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public int getTestRealize() {
        return testRealize;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public void setTestSpecifity(double testSpecifity) {
        this.testSpecifity = testSpecifity;
    }

}
