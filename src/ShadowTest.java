public class ShadowTest {

    public int x = 0;

    //    class FirstLevel {
    static class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            this.x = x;
//            System.out.println("x = " + x);
//            System.out.println("this.x = " + this.x);
//            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }

        void print() {
            System.out.println("this.x = " + this.x);
        }
    }

//    public static void main(String... args) {
//        ShadowTest st = new ShadowTest();
//        ShadowTest.FirstLevel fl = st.new FirstLevel();
//        fl.methodInFirstLevel(23);
//    }

    public static void main(String... args) {
        ShadowTest.FirstLevel fl = new ShadowTest.FirstLevel();
        fl.methodInFirstLevel(5);
        fl.print();
        ShadowTest.FirstLevel fl1 = new ShadowTest.FirstLevel();
        fl1.methodInFirstLevel(10);
        fl1.print();
        fl.print();

    }
}