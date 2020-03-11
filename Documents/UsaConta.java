class UsaConta{
	public static void main (String[] args){
	Conta c = new Conta();
	c.titular("Maria do carmo");
	c.conta = 10096475;
	c.agencia = "1436";
	c.saldo = 1852364;
	c.dataAbertura = "04/02/2001";

	System.out.println(" Saldo " + c.saldo);
	
	c.deposita(100.00);
	
        /*System.out.println(c.recuperaDadosParaImpressao());
        System.out.println("Saldo atual: "+ c.saldo);
	System.out.println("Rendimento mensal: "+ c.calculaRendimento());*/
	}
}
