package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerBase.Deck;
import pokerEnums.*; 

public class Deck_Test {
	private static Deck deck; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		deck = new Deck(); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		//	I put this test in so it would pass...
		//TODO: Code a unit test to make sure calling the deck constructor passes back 52 cards in a deeck.
		
		assertTrue(deck.getTotalCards() == 52); 
		int diamonds = 0; 
		int hearts = 0; 
		int spades = 0; 
		int clubs = 0; 
		int rank = 0; 
		for (Card c : deck.getCards()) { 
			switch (c.getSuit()) { 
				case DIAMONDS:
					diamonds++; 
					break; 
				case HEARTS: 
					hearts++; 
					break; 
				case SPADES: 
					spades++; 
					break;
				case CLUBS: 
					clubs++; 
					break; 
			}
			rank += c.getRank().getRank();
		}
		assertTrue(diamonds == hearts && hearts == spades && spades == clubs); 
		assertTrue(diamonds == 13); 
		assertTrue(rank == 416); // A sum of all the card ranks. 

	}
}
