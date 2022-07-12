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
		int i = Integer.parseInt(br.readLine());
		
		int sum = 1 ;
		int t = 1;
		while(true) {
			if(sum == i) {
				if(t%2 == 0) {
					System.out.println(t+"/"+1);
					break;
				}else {
					System.out.println(1+"/"+t);
					break;
				}
			}
			else if(sum > i) {
				if(t%2 == 0) {
					System.out.println(t-(sum-i)+"/"+(1+(sum-i)));
					break;
				}else {
					System.out.println(1+(sum-i)+"/"+(t-(sum-i)));
					break;
				}
			}
			else {
				t++;
				sum += t;
			}
		}
	}
}

