package src;

public class LogicalOperators {
    public static void main(String[] args) {

/*      Logical Operators: && (and), need to meet both condition true
                           || (or) , need one of the condition to be true
                           !(conditon) return condition to be opposite (false = true)
                           ((statement1 && statement2) || statement3) for more than one character,
                           with parentheses, the condition in parentheses will be checked first
*/

        boolean statement1 = 18 > 3; // statement 1 is true
        boolean statement2 = 3 < 2; // statement 2 is false
        boolean statement3 = 4 != 5; // statement 3 is true

        boolean overall = statement1 && statement2;
//       so && (and) operators for statement1
//       statement2 is false

        boolean overall2 = statement1 || statement2;
//       the boolean value returned will be true
//       because statement1 is already met the condition

        boolean overall3 = statement1 && !statement2;
/*       return false without exclamation mark on statement2,
         return true with exlaimation mark '!' on statement2
         that return false statement to true (not false == true)
*/
        boolean overall4 = !(statement1 && !statement2);
//        because of (statement1 && !statement2) is true,
//        will return false with '!' exclaimation mark

        boolean overall5 = ((statement1 == statement2) && statement3);
/*        condition will check for parentheses condition which is (statement1 == statement2) will
        return true. Then check for statement three which return false. So the condition for overall
        5 return false because the logical operators it (true && false).
*/
        System.out.println(overall5);
    }
}
