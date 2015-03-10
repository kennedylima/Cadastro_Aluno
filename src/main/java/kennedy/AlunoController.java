package kennedy;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/AlunoController" })
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Pegar Lista
		GerenciamentoAluno GA = new GerenciamentoAluno();
		List<Aluno> Aluno = GA.getAluno();

		// Adicionar a lista no request
		request.setAttribute("Aluno", Aluno);

		// Colocar no JSP 
		RequestDispatcher tela = request.getRequestDispatcher("Aluno.jsp");
		tela.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// Pegar as informações digitadas e colocar em uma variavel
		
		String Nome = request.getParameter("nome");
		String CPF = request.getParameter("cpf");
		String RG = request.getParameter("rg");
		String Sexo = request.getParameter("Sexo");
		String Estado = request.getParameter("estado");

		// Atribuir as informações em uma variavel do tipo aluno

		Aluno Aluno = new Aluno();
		Aluno.setNome(Nome);
		Aluno.setCPF(CPF);
		Aluno.setRG(RG);
		Aluno.setSexo(Sexo);
		Aluno.setEstado(Estado);

		// criando um objeto do tipo GerenciamentoAluno para gravar as insformações coletadas dentro da lista
		GerenciamentoAluno GA = new GerenciamentoAluno();
		GA.Gravar(Aluno);

	}

}
