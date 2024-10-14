package week_8_UTS.question_3;

public class Customer09 extends User09 {
    private boolean verificationStatus = false;

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        if (doc != null && !doc.isEmpty()) {
            verificationStatus = true;
            System.out.println("Verification applied with document: " + doc);
        } else {
            System.out.println("Document not valid for verification.");
        }
    }
}