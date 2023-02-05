package stage.deck3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 백준 번호 : 15552
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n;i++ ) {
			String s = bf.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			int result = a+b;
			bw.write(result+"\n");
		}
		bf.close();
		bw.flush();
	}

}
