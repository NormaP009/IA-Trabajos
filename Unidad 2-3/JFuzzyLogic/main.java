package JFuzzyLogic;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class main {

    public static void main(String[] args) {
    	String nombreDelArchivo;
    	FIS fis=null;
    	
    	nombreDelArchivo = "C:\\Users\\NormaP\\Documents\\SEMESTRE 9 2023\\IA\\Unidad 2-3\\JFuzzyLogic\\logicaDifusa.fcl";
    	fis = FIS.load(nombreDelArchivo,true);
    	if(fis == null) {
    		System.out.println("Error al cargar el archivo");
    	}else {
    		// Definimos las entradas y las salidas 
            // Entrada
            fis.setVariable("limpieza", 8.0);
            fis.setVariable("comodidad", 10.0);
            fis.setVariable("servicios", 9.0);

            // Evaluamos las reglas
            fis.evaluate();

            // Salida
            double puntaje = fis.getVariable("puntaje").getValue();
            System.out.println("El puntaje del hotel es: " + puntaje );
            
            //Graficas mostradas
            JFuzzyChart.get().chart(fis);
           
    	}   	
    }    	
}
   
