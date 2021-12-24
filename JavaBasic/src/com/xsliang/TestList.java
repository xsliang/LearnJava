package com.xsliang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

public class TestList {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		 
		//这里将函数改成了t -> t + 1
		numList.replaceAll(t -> t + 1);
		 
		for (int i = 0; i < numList.size(); i++) {
		    System.out.println(numList.get(i));
		}
		
		List<String> teStrings=new ArrayList<>();
		teStrings.add("xsliang 1");
		teStrings.add("xsliang 2");
		teStrings.add("xsliang 3");
		
		teStrings = convertDocument(teStrings);
	}
	
	/**
	 * 
	 * @param template
	 * @param form
	 * @return
	 */
	private static List<String> convertDocument(List<String> template) {

		List<String> resultList=template;
		
		template.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				t.replaceAll("##SecretLevel##", "aaa")
				.replaceAll("##UrgentLevel##","bbb")
				.replaceAll("##BiaoTi##","ccc");
				return t;
			}
		});
		
		resultList.replaceAll(t->t.replace("x", "1"));
		
		return resultList;
	}
}
