package com.checkmate.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import javafx.util.Pair;

public class CheckmateUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetIndex_Valid1() {
		String  xAxisElementKey = "h";
		Integer yAxisElementValue = CheckmateUtil.getIndex(xAxisElementKey);

		assertNotNull(yAxisElementValue);
		assertEquals(new Integer(7), yAxisElementValue);
	}

	@Test
	public void testGetIndex_Invalid1() {
		String  xAxisElementKey = "i";
		Integer yAxisElementValue = CheckmateUtil.getIndex(xAxisElementKey);

		assertNull(yAxisElementValue);
	}
	
	@Test
	public void testIsValidPosition_Valid1() {
		assertTrue(CheckmateUtil.isValidPosition("C4"));
	}

	@Test
	public void testIsValidPosition_InValidLength0() {
		assertFalse(CheckmateUtil.isValidPosition(""));
	}

	@Test
	public void testIsValidPosition_InValidLength1() {
		assertFalse(CheckmateUtil.isValidPosition("C"));
	}

	@Test
	public void testIsValidPosition_InValidLength3() {
		assertFalse(CheckmateUtil.isValidPosition("C44"));
	}

	@Test
	public void testGetPositionPair_Valid() {
		String positionIndex1 = "C";
		String positionIndex2 = "4";
		String position = positionIndex1 + positionIndex2;
		
		Pair<String, Integer> positionPair = CheckmateUtil.getPositionPair(position);
		
		assertNotNull(positionPair);
		assertEquals(positionIndex1, positionPair.getKey());
		assertEquals(positionIndex2, positionPair.getValue().toString());
	}

	@Test
	public void testGetPositionPair_InValid() {
		String positionIndex1 = "C";
		String positionIndex2 = "44";
		String position = positionIndex1 + positionIndex2;
		
		Pair<String, Integer> positionPair = CheckmateUtil.getPositionPair(position);
		
		assertNull(positionPair);
	}

}
