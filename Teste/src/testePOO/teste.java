package testePOO;

public class teste {
	
	private int escolha;
	private int num1;
	private int num2;
	
	
	public teste(int escolha, int num1, int num2) {
		this.escolha = escolha;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getEscolha() {
		return escolha;
	}
	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int Multiplica(int num1, int num2) {
		return(num1 * num2);
	}
	
	public int Divide(int num1, int num2) {
		int resultado = 0;
		if(num2 == 0) {
			System.out.println("ERRO: "+num1+" está não pode ser divido por 0");
			return 0;
		}
		else {
			resultado = num1 / num2;
		}
		return resultado;
	}
	
	
}
