/* My friend John likes to go to the cinema. He can choose between system A and system B.

System A : buy a ticket (15 dollars) every time
System B : buy a card (500 dollars) and every time buy a ticket the price
of which is 0.90 times the price he paid for the previous one.

John wants to know how many times he must go to the cinema so that the final
result of System B, when rounded up to the next dollar, will be cheaper than System A.

The function movie has 3 parameters: card (price of the card), ticket (normal
price of a ticket), perc (fraction of what he paid for the previous ticket)
and returns the first n such that

 */


 public class Movie {

    public static int movie(int card, int ticket, double perc) {

        int n = 0;
        double useCard = card;

        while (ticket*n <= Math.ceil(useCard)) {
        useCard += ticket * Math.pow(perc, ++n);
        }

        return n;
    }
}
