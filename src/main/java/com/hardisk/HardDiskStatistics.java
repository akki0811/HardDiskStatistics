package com.hardisk;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class HardDiskStatistics {

	public static String solution(String S) {
		String[] splited = S.split("\\r?\\n");
		Map<String, BigInteger> m = new HashMap<String, BigInteger>();
		for (int i = 0; i < splited.length; i++) {
			String[] split = splited[i].split("\\s+");
			if (split[0].contains("mp3") || split[0].contains("aac") || split[0].contains("flac")) {
				if (m.get("music") != null && !m.isEmpty())
					m.put("music", m.get("music").add(new BigInteger(split[1].substring(0, split[1].length() - 1))));
				else
					m.put("music", new BigInteger(split[1].substring(0, split[1].length() - 1)));
			} else if (split[0].contains("jpg") || split[0].contains("bmp") || split[0].contains("gif")) {
				if (m.get("images") != null && !m.isEmpty())
					m.put("images", m.get("images").add(new BigInteger(split[1].substring(0, split[1].length() - 1))));
				else
					m.put("images", new BigInteger(split[1].substring(0, split[1].length() - 1)));
			} else if (split[0].contains("mp4") || split[0].contains("avi") || split[0].contains("mkv")) {
				if (m.get("movies") != null && !m.isEmpty())

					m.put("movies", m.get("movies").add(new BigInteger(split[1].substring(0, split[1].length() - 1))));
				else
					m.put("movies", new BigInteger(split[1].substring(0, split[1].length() - 1)));
			} else {
				if (m.get("others") != null && !m.isEmpty())
					m.put("others", m.get("others").add(new BigInteger(split[1].substring(0, split[1].length() - 1))));
				else
					m.put("others", new BigInteger(split[1].substring(0, split[1].length() - 1)));
			}
		}
		StringBuilder strBuilder = new StringBuilder();
		for (Map.Entry hm : m.entrySet())
			strBuilder.append(hm.getKey() + " " + hm.getValue() + "b\n");
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		String S = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
		System.out.println(solution(S));
	}
}
