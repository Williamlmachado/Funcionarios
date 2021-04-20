package entities;

public class Dados {
	public String name;
	public double salario;
	public int imposto;
	public double aumento;
	
	public double valorComImposto(){
		return salario -= imposto;
	}
	public double aumentoSalario(){
		return salario = (1 + aumento/100) * salario;
	}
	
	public String toString(){
		return "Funcionário: "
			+ name
			+ ", "
			+  valorComImposto();
	}
}
