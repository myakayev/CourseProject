package course.myakaev.lesson4_classwork;

public class DumberOwner {
    private int id;
    public class DumberInner {
        private int id;
        public void buildId(int id) {
            this.id = id + 100 * DumberOwner.this.id;
        }
    }
}

