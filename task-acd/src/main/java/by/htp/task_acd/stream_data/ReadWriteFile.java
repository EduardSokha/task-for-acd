package by.htp.task_acd.stream_data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import by.htp.task_acd.entity.Line;

public class ReadWriteFile {

	public List<Line> readFile(String path) {
		String line = null;
		BufferedReader buff = null;
		List<Line> lines = new ArrayList<Line>();

		try {
			Reader fileReader = new FileReader(path);
			buff = new BufferedReader(fileReader);

			while ((line = buff.readLine()) != null) {
				String[] split = line.split("\\t");
				lines.add(new Line(split[0], split[1]));
			}

		} catch (IOException e) {
			System.err.println("An IOException was caught :" + e.getMessage());
		} finally {
			try {
				if (buff != null) {
					buff.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lines;
	}

	public void writeFile(String path, List<Line> lines) {
		FileOutputStream fileOutputStream = null;
		String lineOut;

		try {
			fileOutputStream = new FileOutputStream(path, true);

			for (Line column : lines) {
				lineOut = column.getFirstColumn() + "\t" + column.getSecondColumn() + "\n";
				try {
					fileOutputStream.write(lineOut.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
