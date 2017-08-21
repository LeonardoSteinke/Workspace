package br.com.pc;

public class Flags {
	String flags;

	public Flags(int vetor, B oB) {
		if (oB.b27 == 0) {
			flags = "1|0|0|0|0";
			oB.b27 = 1;
		} else if (vetor == 0) {
			flags = "0|0|0|0|1";
		} else if (vetor > 0 && vetor < 128) {
			flags = "0|0|0|1|0";
		} else if (vetor < 0 && vetor > (-127)) {
			flags = "0|0|1|0|0";
		} else if (vetor > 127 || vetor < (-128)) {
			if (vetor > 0) {
				flags = "0|1|0|1|0";
			} else {
				flags = "0|1|1|0|0";
			}
		}

	}
}
