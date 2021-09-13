
public class Golfinho extends Cordados 
{
	
	private String nome = "Golfinho";
	private String nomecientifico = "Delphinus delphis";
	private String ordem = "Cetacea";
	private String familia = "Delphinidae";
	
			
	public void caracteristicas()
	{
		System.out.printf("\nNome: %s \nNome Cientifico: %s\nReino: %s\nFilo: %s\nClasse: %s\nOrdem: %s\nFamilia: %s", nome, nomecientifico, this.reino, this.filo, this.classe, ordem, familia);
		
	}
	
}
