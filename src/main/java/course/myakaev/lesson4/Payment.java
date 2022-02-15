package course.myakaev.lesson4;

public class Payment {
    private String good1;
    private String good2;
    private String good3;
    public class InnerPayment {
            public void buyGood (String good1, String good2, String good3) {
            Payment.this.good1 = good1;
            Payment.this.good2 = good2;
            Payment.this.good3 = good3;
        }
    }
}
