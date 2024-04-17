package cursojava.classesauxiliares;

import curso.java.interfaces.AcessoCordenacao;
import curso.java.interfaces.PermitirAcesso;

/* Reamente e somente receber alguem que tem o controle da interface de PermitirAcesso e chamar o autenticação*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	private AcessoCordenacao acessoCord;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	
}
