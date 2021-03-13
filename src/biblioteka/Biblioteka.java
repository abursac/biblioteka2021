package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface 
{
	private LinkedList<Knjiga> knjige = new LinkedList<>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) 
	{
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) 
	{
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() 
	{
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjgu(Autor autor, String ISBN, String naslov, String izdavac) 
	{
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		for(Knjiga knjiga: knjige)
			if(knjiga.getNaslov().contains(naslov))
				rezultat.add(knjiga);
		return rezultat;
	}

}
