package br.com.inmetrics.suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.inmetrics.teste.AlterarEmpregado;
import br.com.inmetrics.teste.CadastrarEmpregado;
import br.com.inmetrics.teste.ListarEmpregadoCadastrado;
import br.com.inmetrics.teste.ListarTodosEmpregados;

@RunWith(Suite.class)
@SuiteClasses({
	CadastrarEmpregado.class,
	AlterarEmpregado.class,
	ListarEmpregadoCadastrado.class,
	ListarTodosEmpregados.class, 
})
public class SuiteTesteAPI {
	
}