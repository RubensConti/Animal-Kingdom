
public class Ornitorrinco extends Cordados 
{
	
	private String nome = "Ornitorrinco";
	private String nomecientifico = "Ornithorhynchus anatinus";
	private String ordem = "Monotremata";
	private String familia = "Ornithorhynchidae";
	
			
	public void caracteristicas()
	{
		System.out.printf("\nNome: %s \nNome Cientifico: %s\nReino: %s\nFilo: %s\nClasse: %s\nOrdem: %s\nFamilia: %s", nome, nomecientifico, this.reino, this.filo, this.classe, ordem, familia);
		
	}
}
