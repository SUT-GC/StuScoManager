package test;

import util.PatternUtil;

public class TestPatternUtil {

	public static void main(String[] args) {
		boolean result = PatternUtil.noUpperAndLowerCasePattern("111111", "[a-z]*");
		System.out.println(result);
	}

}
