public class CareerRecommendation {
    public static void main(String[] args) {

        int GPA = 3;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Student " + i);
        }

        if (GPA >= 4.5) {
            System.out.println("Recommended Career: Software Engineer");
        } else if (GPA >= 3.8) {
            System.out.println("Recommended Career: Data Analyst");
        } else {
            System.out.println("Recommended Career: IT Support");
        }
    }
}
