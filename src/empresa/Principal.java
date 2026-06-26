//Classe Principal responsável pelo menu e interação com o usuário

package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
			
		exibirMenu(); // Método para carregar o menu
		opcao = teclado.nextInt();
		int tipoMoeda; // Variável para escolha do tipo de moeda.
		Moeda moeda;
	
		while(opcao!=0) {
			
			switch(opcao) {
			
			case 1:
				tipoMoeda = selecionarTipoMoeda(teclado);
				System.out.println("Digite o valor do depósito");
				
				double valor = 0;
				
				try {
					valor = teclado.nextDouble();
				}catch(Exception e){
					System.out.println("Entrada inválida! Tente novamente.");
					teclado.nextLine(); // limpa o teclado
					
				}
				
				moeda = null;
				
				if(tipoMoeda==1) {
					System.out.println("Valor depositado em Dolar: ");
					System.out.println(valor);
					moeda = new Dolar(valor);
				}
				
				else if(tipoMoeda==2) {
					System.out.println("Valor depositado em Euro: ");
					System.out.println(valor);
					moeda = new Euro(valor);
				}
				
				else if (tipoMoeda==3) {
					System.out.println("Valor depositado em Real: ");
					System.out.println(valor);
					moeda = new Real(valor);
				}
				
				cofrinho.adicionar(moeda);
				
				break;
			case 2:
				tipoMoeda = selecionarTipoMoeda(teclado);
				System.out.println("Digite o valor para remoção");
				valor = teclado.nextDouble();
				
				moeda = null;
				
				if(tipoMoeda==1) {
					System.out.println("Valor removido em Dolar: ");
					System.out.println(valor);
					moeda = new Dolar(valor);
				}
				
				else if(tipoMoeda==2) {
					System.out.println("Valor removido em Euro: ");
					System.out.println(valor);
					moeda = new Euro(valor);
				}
				
				else if (tipoMoeda==3) {
					System.out.println("Valor removido em Real: ");
					System.out.println(valor);
					moeda = new Real(valor);
				}
				
				cofrinho.remover(moeda);
				break;
			case 3:
				cofrinho.listagemMoedas();
				break;
			case 4:
				double totalConvertido = cofrinho.converter();
				System.out.println(String.format("Total convertido para Real: R$ %.2f" , totalConvertido));
				break;
			default:
				System.out.println("Opção Invalida! Tente novamente");
				System.out.println();
				break;		
							
			}
			exibirMenu();
			opcao = teclado.nextInt();
			
		}
		
		System.out.println("Programa Finalizado");
		teclado.close();
	}	
	
	// Exibe o Menu Principal do programa, método evita repetição no código.
	private static void exibirMenu() {
		System.out.println("Menu");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Calcular total convertido para Real");
		System.out.println("0 - Encerrar");
		System.out.println();
		
	}
	
	//Exibe o menu para escolha das moedas e as tratativas de escolha
	private static int selecionarTipoMoeda(Scanner teclado) {
        int tipoMoeda = 0;

        while (tipoMoeda < 1 || tipoMoeda > 3) {
            System.out.println("Selecione a moeda");
            System.out.println("1 - Dolar");
            System.out.println("2 - Euro");
            System.out.println("3 - Real");
            
            try {
            	tipoMoeda = teclado.nextInt();
            }catch(Exception e){
            	System.out.println("Entrada inválida! Informe um número válido: \n");
    			teclado.nextLine(); // limpa o teclado	
            }
            

            if (tipoMoeda < 1 || tipoMoeda > 3) {
                System.out.println("Opção inválida! Tente novamente.\n");
            }
        }

        return tipoMoeda;
    }
}
