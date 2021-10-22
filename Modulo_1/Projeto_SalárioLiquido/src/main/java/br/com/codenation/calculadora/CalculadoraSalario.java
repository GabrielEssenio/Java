package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public static long calcularSalarioLiquido(double salarioBase) {
		double salarioFinal = calcularInss(salarioBase);
		return Math.round(salarioFinal);
	}

	private static double calcularInss(double salarioBase) {
		double newSalary = 0;
		double descontoINSS;
		if (salarioBase >= 1039 && salarioBase <= 1500) {
			descontoINSS = (salarioBase *  0.08);
			newSalary = salarioBase - descontoINSS;
		} else if (salarioBase > 1500 && salarioBase <= 4000) {
			descontoINSS = (salarioBase *  0.09);
			newSalary = salarioBase - descontoINSS;
		} else if (salarioBase > 4000) {
			descontoINSS = (salarioBase *  0.11);
			newSalary = salarioBase - descontoINSS;
		}
		return calculaIrrf(newSalary);
	}

	public static double calculaIrrf(double newSalary){
		double salarioLiquido = newSalary;
		if (newSalary > 3000 && newSalary <= 6000) {
			salarioLiquido = newSalary - (newSalary * 0.075);
		}

		if (newSalary  > 6000) {
			salarioLiquido = newSalary - (newSalary * 0.15);
		}
		return salarioLiquido;
	}
}
