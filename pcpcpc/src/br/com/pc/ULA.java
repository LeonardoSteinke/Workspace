
package br.com.pc;

public class ULA {
	public ULA(int inst, A oA, B oB, int valor, int i, int vetor[]) {
		if (inst == 0) {
			oA.a = valor;
			i++;
		} else if (inst == 1) {
			oB.b = valor;
			i++;
		} else if (inst == 2) {
			oA.a = oB.b;
			i++;
		} else if (inst == 3) {
			oB.b = oA.a;
			i++;
		} else if (inst == 5) {
			oA.a5 = 1;
			i++;
		} else if (inst == 200) {
			oA.a -= valor;
		} else if (inst == 21) {
			oA.a += valor;
		} else if (inst == 22) {
			oA.a *= valor;
		} else if (inst == 23) {
			oA.a /= valor;
		} else if (inst == 24) {
			oA.a -= oB.b;
			i++;
		} else if (inst == 25) {
			oA.a += oB.b;
			i++;
		} else if (inst == 26) {
			oA.a *= oB.b;
			i++;
		} else if (inst == 27) {
			if (oB.b == 0) {
				oB.b27 = oB.b;
				i++;
			} else {
				oA.a /= oB.b;
				i++;
			}
		}
		if (inst == 31) {
			vetor[valor] = oA.a;
		}
	}
}
