package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface 
{
	private LinkedList<Knjiga> knjige = new LinkedList<>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) 
	{
		if(knjiga == null)
			throw new NullPointerException("Knjiga ne sme biti null");
		if(knjige.contains(knjiga))
			throw new RuntimeException("Knjiga vec postoji");
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
		if(autor == null && ISBN == null && naslov == null && izdavac == null)
			return knjige;
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		for(Knjiga knjiga: knjige)
			if(knjiga.getNaslov().contains(naslov))
				rezultat.add(knjiga);
		return rezultat;
	}

}
