package com.checkmate.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import javafx.util.Pair;

public class CheckmateUtil {
	
	/* Players */
	public static final int PAWNS = 8;
	public static final int BISHOPS = 2;
	public static final int KING = 1;
	public static final int QUEEN = 1;
	public static final int KNIGHT = 2;
	
	public static final String xA = "A";
	public static final String xB = "B";
	public static final String xC = "C";
	public static final String xD = "D";
	public static final String xE = "E";
	public static final String xF = "F";
	public static final String xG = "G";
	public static final String xH = "H";
	
	public static final String INVALID_INPUT_ERROR_MSG = "Invalid input!";
	public static final String INVALID_MOVEMENT_ERROR_MSG = "Illegal movement!";
	
	public static final String QUEEN_TXT = "Queen";
	public static final String KNIGHT_TXT = "Knight";
	public static final String BISHOP_TXT = "Bishop";
	
	public static Map<String, Pair<String, Integer>> getXmap() {

		Map<String, Pair<String, Integer>> myMap = new HashMap<>();
		myMap.put(xA, new Pair<>(xA, 1));
		myMap.put(xB, new Pair<>(xB, 2));
		myMap.put(xC, new Pair<>(xC, 3));
		myMap.put(xD, new Pair<>(xD, 4));
		myMap.put(xE, new Pair<>(xE, 5));
		myMap.put(xF, new Pair<>(xF, 6));
		myMap.put(xG, new Pair<>(xG, 7));
		myMap.put(xH, new Pair<>(xH, 8));
		
		return myMap;
	}
	
	public static Integer getIndex(String xAlphabet) {
		Pair<String, Integer> pair = getXmap().get(xAlphabet.toUpperCase());
		if(pair != null) {
			return pair.getValue();
		}
		
		return null;
	}
	
	public static String getIndex(Integer xIndex) {
		
		for(Map.Entry<String, Pair<String, Integer>> map:getXmap().entrySet()) {
			if(map.getValue().getValue() == xIndex) {
				return map.getValue().getKey();
			}
		}
		
		return null;
	}

	private static boolean isValidAxisElement(String xAxisElement){
		if(getIndex(xAxisElement) != null) {
			return true;
		}
		return false;
	}

	public static boolean isValidPosition(String position){
		if(StringUtils.isNotEmpty(position)) {
			if(position.length() == 2) {
				if(isValidAxisElement(position.substring(0, 1))) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static Pair<String, Integer> getPositionPair(String position) throws NumberFormatException{
		if(isValidPosition(position)) {
			return (new Pair<>(position.substring(0, 1), Integer.parseInt(position.substring(1, 2))));
		}
		return null;
	}

}
