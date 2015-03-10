package kennedy;


import java.util.ArrayList;
import java.util.List;

public class GerenciamentoAluno {

	private static List<Aluno> Alunos = new ArrayList<Aluno>();
	// metodo que adiciona as informações a uma posição da lista
	public void Gravar(Aluno Aluno) {
		Alunos.add(Aluno);
	}
	// metodo que retorna as informações do aluno
	public List<Aluno> getAluno(){
		return Alunos;
	}

	

	
	
	
	
	
	
}
