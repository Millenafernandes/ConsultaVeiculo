
import java.util.Scanner;


public class Menu {
	public static void main(String[] args) {
		
		
		
		
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
       
        
        
        System.out.println("Bem vindo ao cadastro de veículos, diga-nos quantos carros você deseja cadastrar:");
        
        int n = scanner.nextInt();
        
        String placa[] = new String[n];
        String modelo[] = new String[n];
        
        
        

        while (opcao != 4) {
            System.out.println("============== MENU ==============");
            System.out.println();
            
            
            System.out.println("1 - para cadastrar os veículos");
            System.out.println("2 - para consultar os veículos");
            System.out.println("3 - para exibir todos os veículos");
            System.out.println("4 - para odernar");
            System.out.println("5 - para sair do programa");
            System.out.println();
            System.out.println("Selecione uma opção: ");
            

            opcao = scanner.nextInt();
            
            
           
            	switch (opcao) {
                case 1:
                    
                    
                	scanner.nextLine();
                    
                    
                    for(int i = 0; i<placa.length; i++) {
                    	
                    	System.out.println("Digite a placa do"+" "+(i+1)+"°"+"carro:");
                    	
                    	placa[i] = scanner.nextLine();
                    	
                    	
                    	
                    }
                    for(int i = 0; i<modelo.length; i++) {
                    	
                    	System.out.println("Digite a modelo do " +" "+(i+1)+"°"+"carro:");
                    	modelo[i] = scanner.nextLine();
                    	
                    }
                    
                    break;
                case 2:
                    System.out.println("Qual placa você deseja consultar?");
                    
                   int i = 0;
                   scanner.nextLine();
                    
                    String chave = scanner.nextLine();
                    
                    int resultado = Busca.buscaBinariaString(placa, chave);
                    if (resultado == -1) {
		                System.out.println("A placa não foi encontrada no cadastro.");
		            } else {
		            	System.out.println();
		                System.out.println("A placa e o modelo do veículo foram encontrados com sucesso. ");
		                
		                System.out.println(chave +"-"+ modelo[resultado]);
		                
		            }
                    break;
                    
                    case 3:
                    System.out.println();
                    System.out.println("Todos carros cadastrados:");
                    for(i = 0; i<placa.length; i++) {
		                System.out.println(placa[i] + "-" + modelo[i]);
		            }
                   
                    break;
                case 4:
                	 
                	String opcao1;

                	System.out.println("Digite 'A' para ordenar por modelo, 'B' para ordenar por placa");
                	opcao1 = scanner.nextLine().toLowerCase();
                	scanner.nextLine();

                	String a = "a";
                	String b = "b";

                	if(opcao1.equals(a)){
                	    Ordenacao.ordenaModelo(placa, modelo, n);
                	    for (i = 0; i < n; i++) {
                	        System.out.println(modelo[i] + "-" + placa[i]);
                	    }
                	} else if(opcao1.equals(b)){
                	    Ordenacao.ordenaPlaca(placa, modelo, n);
                	    for (i = 0; i < n; i++) {
                	        System.out.println(placa[i] + "-" + modelo[i]);
                	    }
                	} else {
                	    System.out.println("Digite uma opção válida!");
                	}
                	
                    break;
                    
                case 5:
                    System.out.println("Encerrando o programa. Até mais!");
                    break; 
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                   
                   
            	}
            
		}
            
        scanner.close();      
		}	        
	
}
