package backJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int yy = N % H;
			int xx = N / H; 
			if(yy == 0) {
				yy += H;
			}else {
				xx++;
			}			
			sb.append((yy*100)+xx+"\n");
		}
		System.out.println(sb.toString());		
	}
}

