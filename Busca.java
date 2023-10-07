public class Busca { 
   
	
        public static int buscaBinariaString(String[] placa, String chave) {
                int inicio = 0;
                int fim = placa.length - 1;
        
                while (inicio <= fim) {
                    int meio = (inicio + fim) / 2;
                    int comparacao = chave.compareTo(placa[meio]);
        
                    if (comparacao == 0) {
                        return meio; 
                    } else if (comparacao < 0) {
                        fim = meio - 1; 
                    } else {
                        inicio = meio + 1; 
                    }
                }
        
                return -1; 
            }
        }
    

