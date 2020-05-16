package by.htp.task_acd.start;

import java.util.List;

import by.htp.task_acd.entity.Line;
import by.htp.task_acd.sorting.Sort;
import by.htp.task_acd.stream_data.ReadWriteFile;

public class Main {

	public static void main(String[] args) {
		List<Line> lines;
		ReadWriteFile readWriteFile = new ReadWriteFile();
		final String inputFile = "src/main/resource/in.txt";
		final String outputFile = "src/main/resource/out.txt";
		
		lines = readWriteFile.readFile(inputFile);

		Sort.sort(lines);

		readWriteFile.writeFile(outputFile, lines);

	}
}
