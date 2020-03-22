package education.common;

public class MockClass {
    private String mockString;
    private Integer mockInteger;
    private int mockInt;

    public MockClass() {
    }

    public MockClass(String mockString, Integer mockInteger, int mockInt) {
        this.mockString = mockString;
        this.mockInteger = mockInteger;
        this.mockInt = mockInt;
    }

    public String getMockString() {
        return mockString;
    }

    public void setMockString(String mockString) {
        this.mockString = mockString;
    }

    public Integer getMockInteger() {
        return mockInteger;
    }

    public void setMockInteger(Integer mockInteger) {
        this.mockInteger = mockInteger;
    }

    public int getMockInt() {
        return mockInt;
    }

    public void setMockInt(int mockInt) {
        this.mockInt = mockInt;
    }

    @Override
    public String toString() {
        return "MockClass{" +
                "mockString='" + mockString + '\'' +
                ", mockInteger=" + mockInteger +
                ", mockInt=" + mockInt +
                '}';
    }
}
