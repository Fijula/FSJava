public class ConditionalStmt {
    public static void main(String[] args) {
        ConditionalStmt c1 = new ConditionalStmt();
        String res = c1.determineCategory(3, "Female");
        System.out.println(res);
    }

    public String determineCategory(int age, String gender) {
        if (age < 0 || (!gender.equals("Male") && !gender.equals("Female")) ){
            return "Enter correct age and gender";
        }
// Case 1 :using if- else :
        if (gender.equals("Male"))
        {
            if (age <= 18)
                return "boy";
             else if (age <= 60)
                return "man";
            else
                return "Male sc";
        }
        else
        {
            if (age <= 18)
                return "girl";
            else if (age <= 60)
                return "woman";
            else
                return "Female sc";

        }

// Case 2 - using Ternary Operator

//        String category_new = (age <= 18) ? (gender.equals("Male") ? "boy" : "girl") :
////                (age <= 60) ? (gender.equals("Male") ? "man" : "woman") :
////                        (gender.equals("Male") ? "Male sc" : "Female sc");
////        return category_new;
    }
}