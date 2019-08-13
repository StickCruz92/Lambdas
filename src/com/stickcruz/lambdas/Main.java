package com.stickcruz.lambdas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnOneListener oneListener = new OnOneListener() {
			
			@Override
			public void onOne(String message) {
				// TODO Auto-generated method stub
				System.out.println("One: " + message);
			}
		};
		
		
		OnOneListener oneListener2 = (String message) -> {
			System.out.println("One lambda :) " + message);
		};
		
		oneListener.onOne("Sin lambdas :(");
		oneListener2.onOne("Con lambdas :D");
		
		OnOneListener oneListener3 = message -> System.out.println("Tu mensaje: "+ message);

	}

}
