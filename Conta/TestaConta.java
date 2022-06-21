
public class TestaConta {

	public static void main(String[] args) {
		
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael Bessa");
		rafael.setCpf("111.111.111-11");
		rafael.setProfissao("programador");
		
		Conta contaDoRafael = new Conta(1234, 3887);
		contaDoRafael.setTitular(rafael);
		//System.out.println(contaDoRafael.titular.nome);
		//contaDoRafael.getTitular().setNome("Rafael Morangon Bessa");
		//System.out.println(contaDoRafael.getTitular().getNome());
		
		Conta contaDoRafael2 = new Conta(1234, 8282);
		contaDoRafael2.deposita(1500);
		
		
		System.out.println(Conta.getTotal());
	}

}
