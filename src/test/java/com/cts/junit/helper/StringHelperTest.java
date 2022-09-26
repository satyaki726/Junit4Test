package com.cts.junit.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();

	// AACD -> CD ACD->CD AAACD->ACD //yo
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("qCD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirstPosition() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Negative() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Positive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testArraySort_RandomArray() {
		int[] actual = {12,3,1,5};
		int[] expected = {1,3,5,12};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
 	}
	
	@Test(expected = NullPointerException.class)
	public void testArray_NullPointerException() {
		int[] actual = null;
		Arrays.sort(actual);
	}
}
