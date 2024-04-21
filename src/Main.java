import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) {
	    System.out.printf("========== BIBLIOTECA PESSOAL ==========%n" +
		                  "|          Seja bem-vindo(a)!          |%n" +
		                  "========================================%n");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int opcao = 1;

		//criando bd
		criarArquivo("testando");

		do{
			menuPrincipal();
		    opcao = sc.nextInt();
			System.out.println();

		    switch(opcao){
		        case 0:
		            break;
		        case 1:
                    String nome = sc.nextLine();
		            Estante estante = new Estante(nome); 
		        case 2:
		            //estante.visualizar;
		        case 3: //Thales faz
		            //estante.excluir
		        case 4:
		            //livro.add
		        case 5:
		            //livro.visualizar
		        case 6: 
		            //livro.excluir
		        case 7:
		            //estante.listar
		        case 8:
		            //pesquisar;
		    }
		}while (opcao != 0);
		sc.close();
	}

	//FUNCOES DO MAIN

	//menu
	public static void menuPrincipal(){
		System.out.println("===============  MENU  =================");
		System.out.printf("DIGITE:%n" +
						"[1] - Criar Nova Estante;%n" +
						"[2] - Vizualizar Estante;%n" +
						"[3] - Excluir Estante;%n" +
						"[4] - Adicionar Livro a Estante;%n" +
						"[5] - Vizualizar Livro;%n" +
						"[6] - Excluir Livro;%n" +
						"[7] - Listar Estantes;%n" +
						"[8] - Pesquisar na Estante;%n" +
						"[0] - Sair;%n");
		System.out.print("Opcao: ");
	}

	//criar arquivo txt na pasta banco de dados

	public static void criarArquivo(String nome){
		String diretorio = "C:\\database\\";
		String path =  diretorio + nome + ".txt"; //criando o arquivo com base no nome informado pelo usuário
		
		File aq = new File(path);
		if (!aq.exists()){
			try (FileWriter arquivo = new FileWriter(path)){
				
				System.out.println("Arquivo criado com sucesso.");
			}
			catch (IOException e){
				System.out.println("Erro ao criar arquivo.");
				e.printStackTrace();
			}
		}
	}


	//escrever dados no arquivo
	public static void escreverDados(String path, String dados){
		try (BufferedWriter arquivo = new BufferedWriter(new FileWriter(path, true))){
			arquivo.write(dados);
			System.out.println("Informações salvas com sucesso.");
		}
		catch (IOException e){
			System.out.println("Erro ao salvar informações.");
			e.printStackTrace(); //IO exception é gerada as vezes ao tentar abrir um arquivo txt atraves do scanner, por isso temos que adicionar uma execeção, ela imprime o tipo de erro
		}
	}
}


//criar pasta de estante, livros, e separar isso tudo ai depois
