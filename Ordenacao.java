


	public class Ordenacao {

		       
	public static void ordenaPlaca(String placa[], String modelo[], int n ) {	       
		       
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (placa[j].compareToIgnoreCase(placa[j+1]) > 0) {
		                   
		                    String tempPlaca = placa[j];
		                    placa[j] = placa[j+1];
		                    placa[j+1] = tempPlaca;
		                    
		                    
		                    String tempModelo = modelo[j];
		                    modelo[j] = modelo[j+1];
		                    modelo[j+1] = tempModelo;
		                }
		            }
		        }
		        
		      
		        
		        
		    }
		
	public static void ordenaModelo(String placa[], String modelo[], int n ) {	       
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (modelo[j].compareToIgnoreCase(modelo[j+1]) > 0) {
                    
                    String tempModelo = modelo[j];
                    modelo[j] = modelo[j+1];
                    modelo[j+1] = tempModelo;
                    
                    
                    String tempPlaca = placa[j];
                    placa[j] = placa[j+1];
                    placa[j+1] = tempPlaca;
                }
            }
        }
        
      
        
        
    }
	}
