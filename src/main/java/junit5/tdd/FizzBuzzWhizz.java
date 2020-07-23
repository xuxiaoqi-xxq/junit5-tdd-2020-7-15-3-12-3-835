package junit5.tdd;

public class FizzBuzzWhizz {


    public String play(int number) {
        String answer = "";
        if (number % 3 == 0) {
            answer += "Fizz";
        }
        if (number % 5 == 0) {
            answer += "Buzz";
        }
        if (number % 7 == 0) {
            answer += "Whizz";
        }
        if (answer.equals("")) {
            answer = String.valueOf(number);
        }
        return answer;
    }
}
