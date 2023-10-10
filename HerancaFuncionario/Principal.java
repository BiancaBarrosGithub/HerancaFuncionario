package HerancaFuncionario;

public class Principal {

	public static void main(String[] args) {


		Funcionario funcionario = new Funcionario ("Luisa","4019",3.000,"99876-2345","California","24/08/1990");
		System.out.println("Funcionario");
		System.out.println("Nome:" + funcionario.getNome());
		System.out.println("Matricula:" + funcionario.getMatricula());
		System.out.println("salario:" + funcionario.getSalario());
		System.out.println("Telefone:" + funcionario.getTelefone());
		System.out.println("Endereco:" + funcionario.getEndereco());
		System.out.println("DataNascimento:" + funcionario.getDataNascimento());
		
		Administrador administrador = new Administrador ("Luisa","4019",3.000,"99876-2345","California","24/08/1990",4);
		System.out.println("Administrador");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("salario: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereco: " + funcionario.getEndereco());
		System.out.println("DataNascimento: " + funcionario.getDataNascimento());
		System.out.println("Cra: "+ administrador.getCra());

		
		Engenheiro engenheiro = new Engenheiro ("Luisa","4019",3.000,"99876-2345","California","24/08/1990",25);
		System.out.println("Administrador");
		System.out.println("Nome:" + funcionario.getNome());
		System.out.println("Matricula:" + funcionario.getMatricula());
		System.out.println("salario:" + funcionario.getSalario());
		System.out.println("Telefone:" + funcionario.getTelefone());
		System.out.println("Endereco:" + funcionario.getEndereco());
		System.out.println("DataNascimento:" + funcionario.getDataNascimento());
		System.out.println("NumCrea: " + engenheiro.getNumCrea());
		
		Medico medico = new Medico ("Luisa","4019",3.000,"99876-2345","California","24/08/1990",100);
		System.out.println("Medico");
		System.out.println("Nome:" + funcionario.getNome());
		System.out.println("Matricula:" + funcionario.getMatricula());
		System.out.println("salario:" + funcionario.getSalario());
		System.out.println("Telefone:" + funcionario.getTelefone());
		System.out.println("Endereco:" + funcionario.getEndereco());
		System.out.println("DataNascimento:" + funcionario.getDataNascimento());
		System.out.println("Crm: " + medico.getCrm());
	}
}
