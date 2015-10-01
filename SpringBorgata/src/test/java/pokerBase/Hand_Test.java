package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerBase.Hand;
import pokerBase.Card;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import java.util.ArrayList; 

public class Hand_Test {
	private static Hand royalFlush; 
	private static Hand straightFlush; 
	private static Hand fourOfAKind; 
	private static Hand fullHouse;
	private static Hand flush; 
	private static Hand straight; 
	private static Hand threeOfAKind; 
	private static Hand twoPair; 
	private static Hand onePair; 
	private static Hand highCard;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		royalFlush = new Hand(); 
		straightFlush = new Hand(); 
		fourOfAKind = new Hand();
		fullHouse = new Hand();
		flush = new Hand();
		straight = new Hand();
		threeOfAKind = new Hand();
		twoPair = new Hand();
		onePair = new Hand();
		highCard = new Hand();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		royalFlush = null;  
		straightFlush = null; 
		fourOfAKind = null;
		fullHouse = null;
		flush = null;
		straight = null;
		threeOfAKind = null;
		twoPair = null;
		onePair = null;
		highCard = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void royalFlush() {
		royalFlush.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, false));
		royalFlush.AddCardToHand(new Card(eSuit.SPADES, eRank.JACK, false));
		royalFlush.AddCardToHand(new Card(eSuit.SPADES, eRank.QUEEN, false));
		royalFlush.AddCardToHand(new Card(eSuit.SPADES, eRank.KING, false));
		royalFlush.AddCardToHand(new Card(eSuit.SPADES, eRank.ACE, false));
		
		royalFlush.EvalHand();
		
		assertTrue(royalFlush.getHandStrength() == 100); 
	}
	
	@Test
	public void straightFlush() {
		straightFlush.AddCardToHand(new Card(eSuit.HEARTS, eRank.THREE, false));
		straightFlush.AddCardToHand(new Card(eSuit.HEARTS, eRank.FOUR, false));
		straightFlush.AddCardToHand(new Card(eSuit.HEARTS, eRank.FIVE, false));
		straightFlush.AddCardToHand(new Card(eSuit.HEARTS, eRank.SIX, false));
		straightFlush.AddCardToHand(new Card(eSuit.HEARTS, eRank.SEVEN, false));
		
		straightFlush.EvalHand();
		
		assertTrue(straightFlush.getHandStrength() == 90); 
	}
	
	@Test
	public void fourOfAKind() {
		fourOfAKind.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, false));
		fourOfAKind.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, false));
		fourOfAKind.AddCardToHand(new Card(eSuit.CLUBS, eRank.TEN, false));
		fourOfAKind.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TEN, false));
		fourOfAKind.AddCardToHand(new Card(eSuit.SPADES, eRank.FIVE, false));
		
		fourOfAKind.EvalHand();
		
		assertTrue(fourOfAKind.getHandStrength() == 80); 
	}
	
	@Test
	public void fullHouse() {
		fullHouse.AddCardToHand(new Card(eSuit.SPADES, eRank.KING, false));
		fullHouse.AddCardToHand(new Card(eSuit.HEARTS, eRank.KING, false));
		fullHouse.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.KING, false));
		fullHouse.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, false));
		fullHouse.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, false));

		fullHouse.EvalHand();
		
		assertTrue(fullHouse.getHandStrength() == 70); 
	}
	@Test
	public void flush() {
		flush.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, false));
		flush.AddCardToHand(new Card(eSuit.SPADES, eRank.FIVE, false));
		flush.AddCardToHand(new Card(eSuit.SPADES, eRank.TWO, false));
		flush.AddCardToHand(new Card(eSuit.SPADES, eRank.JACK, false));
		flush.AddCardToHand(new Card(eSuit.SPADES, eRank.QUEEN, false));

		flush.EvalHand();
		
		assertTrue(flush.getHandStrength() == 60); 
	}
	@Test
	public void straight() {
		straight.AddCardToHand(new Card(eSuit.SPADES, eRank.EIGHT, false));
		straight.AddCardToHand(new Card(eSuit.HEARTS, eRank.NINE, false));
		straight.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.JACK, false));
		straight.AddCardToHand(new Card(eSuit.CLUBS, eRank.QUEEN, false));
		straight.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, false));

		straight.EvalHand();
		//System.out.print(straight.getHandStrength());
		assertTrue(straight.getHandStrength() == 50); 
	}
	@Test
	public void threeOfAKind() {
		threeOfAKind.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, false));
		threeOfAKind.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, false));
		threeOfAKind.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TEN, false));
		threeOfAKind.AddCardToHand(new Card(eSuit.SPADES, eRank.THREE, false));
		threeOfAKind.AddCardToHand(new Card(eSuit.CLUBS, eRank.KING, false));

		threeOfAKind.EvalHand();
		
		assertTrue(threeOfAKind.getHandStrength() == 40); 
	}
	@Test
	public void twoPair() {
		twoPair.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, false));
		twoPair.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, false));
		twoPair.AddCardToHand(new Card(eSuit.CLUBS, eRank.JACK, false));
		twoPair.AddCardToHand(new Card(eSuit.CLUBS, eRank.JACK, false));
		twoPair.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.FOUR, false));

		twoPair.EvalHand();
		
		assertTrue(twoPair.getHandStrength() == 30); 
	}
	@Test
	public void onePair() {
		onePair.AddCardToHand(new Card(eSuit.CLUBS, eRank.FOUR, false));
		onePair.AddCardToHand(new Card(eSuit.CLUBS, eRank.FOUR, false));
		onePair.AddCardToHand(new Card(eSuit.HEARTS, eRank.TWO, false));
		onePair.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.FIVE, false));
		onePair.AddCardToHand(new Card(eSuit.SPADES, eRank.QUEEN, false));

		onePair.EvalHand();
		
		assertTrue(onePair.getHandStrength() == 20); 
	}
	@Test
	public void highCard() {
		highCard.AddCardToHand(new Card(eSuit.HEARTS, eRank.THREE, false));
		highCard.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.EIGHT, false));
		highCard.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.JACK, false));
		highCard.AddCardToHand(new Card(eSuit.CLUBS, eRank.NINE, false));
		highCard.AddCardToHand(new Card(eSuit.SPADES, eRank.ACE, false));
		
		highCard.EvalHand();
		//System.out.print(highCard.getHandStrength());
		assertTrue(highCard.getHandStrength() == 10); 
	}

}