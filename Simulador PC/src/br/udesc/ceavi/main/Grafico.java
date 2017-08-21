package br.udesc.ceavi.main;

public class Grafico {
	public Grafico(int vetor[], A a, B b, Flags oFlags, int PC, int IR) {
		if (a.a5 == 0) {
			System.out.printf("________________	________\n");
			System.out.printf("|				|%d	|	%d	|\n", (PC + 10), vetor[PC + 10]);
			System.out.printf("|				|%d	|	%d	|\n", (PC + 9), vetor[PC + 9]);
			System.out.printf("|  	A:%d			|%d	|	%d	|\n", a.a, (PC + 8), vetor[PC + 8]);
			System.out.printf("|  	B:%d			|%d	|	%d	|\n", b.b, (PC + 7), vetor[PC + 7]);
			System.out.printf("|	PC:%d			|%d	|	%d	|\n", PC, (PC + 6), vetor[PC + 6]);
			System.out.printf("|	IR:%d			|%d	|	%d	|\n", IR, (PC + 5), vetor[PC + 5]);
			System.out.printf("|	FLAGS		|%d	|	%d	|\n", (PC + 4), vetor[PC + 4]);
			System.out.printf("|	%s		|%d	|	%d	|\n", oFlags.flags, (PC + 3), vetor[PC + 3]);
			System.out.printf("|				|%d	|	%d	|	 ________\n", (PC + 2), vetor[PC + 2]);
			System.out.printf("|				|%d	|	%d	|	|		|\n", (PC + 1), vetor[PC + 1]);
			System.out.printf("|				|%d	|	%d	|	|		|\n", PC, vetor[PC]);
			System.out.printf("|_______________|	|_______|	|_______|\n");
			System.out.printf(" |	|	|	|		    |    |    |		  |  |	|\n");
			System.out.printf(" |	|	|	|____%d____|__)__)_____|_)_)_____ endereço\n", PC);
			System.out.printf(" |	|	|________%d_______|__)______|_)______dados\n", IR);
			System.out.printf(" |	|______________________|________|_______ 0 memoria(0)/periferico(1) \n");
			System.out.printf(" |_________________________________________0 leitura(0)/gravação(1)\n");
		} else {
			System.out.printf("________________	________\n");
			System.out.printf("|				|%d	|	%d	|\n", (PC + 10), vetor[PC + 10]);
			System.out.printf("|				|%d	|	%d	|\n", (PC + 9), vetor[PC + 9]);
			System.out.printf("|  	A:%d			|%d	|	%d	|\n", a.a, (PC + 8), vetor[PC + 8]);
			System.out.printf("|  	B:%d			|%d	|	%d	|\n", b.b, (PC + 7), vetor[PC + 7]);
			System.out.printf("|	PC:%d			|%d	|	%d	|\n", PC, (PC + 6), vetor[PC + 6]);
			System.out.printf("|	IR:%d			|%d	|	%d	|\n", IR, (PC + 5), vetor[PC + 5]);
			System.out.printf("|	FLAGS		|%d	|	%d	|\n", (PC + 4), vetor[PC + 4]);
			System.out.printf("|	%s		|%d	|	%d	|\n", oFlags.flags, (PC + 3), vetor[PC + 3]);
			System.out.printf("|				|%d	|	%d	|	 ________\n", (PC + 2), vetor[PC + 2]);
			System.out.printf("|				|%d	|	%d	|	|		|\n", (PC + 1), vetor[PC + 1]);
			System.out.printf("|				|%d	|	%d	|	|	%c	|\n", PC, vetor[PC], a.a);
			System.out.printf("|_______________|	|_______|	|_______|\n");
			System.out.printf(" |	|	|	|		    |    |    |		  |  |	|\n");
			System.out.printf(" |	|	|	|____%d____|__)__)_____|_)_)_______ endereço\n", PC);
			System.out.printf(" |	|	|________%d_______|__)______|_)______dados\n", IR);
			System.out.printf(" |	|______________________|________|_______ 1 memoria(0)/periferico(1) \n");
			System.out.printf(" |_________________________________________1 leitura(0)/gravação(1)\n");
			a.a5=0;
		}
	}
}
