package education.clone;

import education.common.MockClass;

public class Obj implements Cloneable {
    private int numb;
    private String word;
    private MockClass mockClass;

    @Override
    protected Obj clone() throws CloneNotSupportedException {
        Obj obj = (Obj) super.clone();
        obj.setMockClass(new MockClass(obj.getMockClass().getMockString(), obj.getMockClass().getMockInteger(), obj.getMockClass().getMockInt()));
        return obj;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public MockClass getMockClass() {
        return mockClass;
    }

    public void setMockClass(MockClass mockClass) {
        this.mockClass = mockClass;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "numb=" + numb +
                ", word='" + word + '\'' +
                ", mockClass=" + mockClass +
                '}';
    }
}
