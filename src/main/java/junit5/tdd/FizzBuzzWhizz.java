package junit5.tdd;

public class FizzBuzzWhizz {


    public String play(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
