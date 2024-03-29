public class ConditionalStmt {
    public static void main(String[] args) {
        ConditionalStmt c1 = new ConditionalStmt();
        String res = c1.determineCategory(4, "Male");
        System.out.println(res);
    }

    public String determineCategory(int age, String gender) {
        if (age <= 0) {
            return "Enter correct age and gender";
        }

        if (gender.equals("Male")) {
            if (age <= 18) {
                return "boy";
            } else if (age <= 60) {
                return "man";
            } else {
                return "sc";
            }
        } else if (gender.equals("Female")) {
            if (age <= 18) {
                return "girl";
            } else if (age <= 60) {
                return "woman";
            } else {
                return "sc";
            }
        } else {
            return "Enter correct age and gender";
        }
    }
}