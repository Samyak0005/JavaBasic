package exception_handling;

public class CustomException {

    public String VotingEligible(int age) throws AgeEligibleOrNot{

        if (age<18){

            throw new AgeEligibleOrNot("this is not Eligible for voting");
        }

        else {
            return "this is Eligible for voting";
        }

    }

    public static void main(String[] args) {
        CustomException obj = new CustomException();
        try {
            System.out.println(obj.VotingEligible(17));
        } catch (AgeEligibleOrNot e) {
            e.printStackTrace();
        }
    }
}
