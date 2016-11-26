package com.example.app;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Argument {
	private int a;
	private int b;

	public Argument(int a, int b){
		this.a = a;
		this.b = b;
	}
	public final int getA() {
		return a;
	}
	
	public final int getB() {
		return b;
	}
	
	
}
