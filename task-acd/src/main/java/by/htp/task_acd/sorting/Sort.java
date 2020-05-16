package by.htp.task_acd.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.task_acd.entity.Line;

public class Sort {
	
	public static void sort(List<Line> lines) {
		Collections.sort(lines, new Comparator<Line>() {
			@Override
			public int compare(Line o1, Line o2) {
				int resultColumn1 = o1.getFirstColumn().compareTo(o2.getFirstColumn());
				int resultColumn2 = o1.getSecondColumn().compareTo(o2.getSecondColumn());

				if (resultColumn1 != 0) {
					return resultColumn1;
				} else {
					return resultColumn2;
				}
			}
		});
	}
}
