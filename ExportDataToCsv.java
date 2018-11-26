package javaStuding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportDataToCsv {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Map<String,Object>> data = new ArrayList<>();
		ArrayList<List> arrLst = new ArrayList<>();
		Map<String,Object> mapInfo;
		for(int i = 0; i<2 ;i++) {
			mapInfo = new HashMap<>();
			mapInfo.put("index",String.valueOf(i));
			mapInfo.put("name", "pengkai");
			mapInfo.put("age", "12");
			mapInfo.put("sex", "man");
			data.add(mapInfo);
		}
		File csvFile = new File("D://temp/export.csv");
		FileWriter writer = new FileWriter(csvFile);
		CsvExportUtil.writeLine(writer, Arrays.asList("index","name","age","sex"));
		for(int j = 0; j < data.size(); j++) {
			Map<String,Object> map = data.get(j);
			ArrayList<String> lst = new ArrayList<>();
			lst.add((String)map.get("index"));
			lst.add((String)map.get("name"));
			lst.add((String)map.get("age"));
			lst.add((String)map.get("sex"));
			CsvExportUtil.writeLine(writer, lst);
		}
		writer.close();
	}
}
class CsvExportUtil{
	private static final char DEFAULT_SEPARATOR = ',';
	public static void writeLine(Writer writer, List<String> lst) throws IOException {
		writeLine(writer, lst, DEFAULT_SEPARATOR);
	}
	public static void writeLine(Writer writer, List<String> lst, char seperator) throws IOException {
		boolean first = true;
		if(seperator == ' ') {
			seperator = DEFAULT_SEPARATOR;
		}
		StringBuilder sb = new StringBuilder();
		for(String value : lst) {
			if(!first) {
				sb.append(seperator);
			}
			sb.append(value);
			first = false;
		}
		sb.append("\n");
		writer.append(sb.toString());
		writer.flush();
	}
}
