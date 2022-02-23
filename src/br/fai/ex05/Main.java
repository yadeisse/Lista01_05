package br.fai.ex05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start () {
		for (int i = 0; i <= 5; i++) { 
			
			switch (i) {
			//if i == 1
			case 1: 
				System.out.println ("Primeira condicao"); 
				break; 
			// else if i == 4
			case 4: 
				System.out.println ("Segunda condicao"); 
				break; 
			//
			default: 
				System.out.println ("Nao encontrou nenhuma condicao"); 
				break; 
			}
		}
		
	}
}