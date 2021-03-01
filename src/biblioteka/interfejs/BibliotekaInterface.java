package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterface 
{
	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public LinkedList<Knjiga> vratiSveKnjige();
	
	public LinkedList<Knjiga> pronadjiKnjgu(Autor autor, String ISBN, String naslov, String izdavac);
}
