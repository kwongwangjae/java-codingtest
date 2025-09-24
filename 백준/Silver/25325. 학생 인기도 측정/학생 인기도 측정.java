import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String[] keys = br.readLine().split(" ");
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], 0);
		}

		for (int i = 0; i < num; i++) {
			String[] line = br.readLine().split(" ");
			for (String s : line) {
				map.put(s, map.getOrDefault(s,0) + 1);
			}
		}

		//참조함
		List<Map.Entry<String, Integer>> collect = map.entrySet()
			.stream()
			.sorted(
				Comparator.comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder())
					.thenComparing(Map.Entry::getKey)
				)
			.collect(Collectors.toList());

		for (Map.Entry<String, Integer> entry : collect) {
			bw.write(entry.getKey() + " " + entry.getValue());
			bw.newLine();
		}


		br.close();
		bw.flush();
		bw.close();
	}
}