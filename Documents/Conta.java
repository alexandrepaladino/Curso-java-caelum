class Conta{
	String titular;
	int conta;
	String agencia;
	double saldo;
	String dataAbertura;

	

	public String getTitular(){
		return this.titular;
	}

	public void setTitular(String setTitular){
		this.titular = titular;
}	
	

	void saca(double valor){
	saldo-= valor;
	}
	 void deposita(double valor){
		saldo+= valor;
	}
	double calculaRendimento(){
	 return saldo = saldo * 0.5;				
	}

	String recuperaDadosParaImpressao(){
	return   titular + "-" + conta + agencia + saldo + dataAbertura;   				
	}
}
