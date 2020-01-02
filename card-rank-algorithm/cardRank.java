///********************************************************************
// CardRanks.java Author: Trevor Raynak
//
// 
//********************************************************************

package enumClass;

public class CardRanks
{
	enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king} 

	public static void main (String[] args)
	{
		Rank highCard, faceCard, card1, card2;
		
		highCard = Rank.ace;
		faceCard = Rank.queen;
		card1 = Rank.two;
		card2 = Rank.seven;

		System.out.println("A blackjack hand:" + highCard + " and " + faceCard);

		int valCard1, valCard2;//adds two integers to refer to card1 and card2 value
		
		valCard1 = card1.ordinal() +1;
		valCard2 = card2.ordinal() +1;//you have to have a +1 because the ordinal starts with a zero
				
		System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
		
		int sum = valCard1 + valCard2;//adds the some of the values of card1 and card2
		
		System.out.println("Hand value: " + sum);
		
	}

}
