package ads.pipoca.model.service;

import java.io.IOException;

import ads.pipoca.model.dao.FilmeDAO;
import ads.pipoca.model.entity.Filme;

public class FilmeService {
	public int inserirFilme(Filme filme) throws IOException {
		FilmeDAO filmeDAO = new FilmeDAO();
		return filmeDAO.inserirFilme(filme);
	}
	public Filme buscarFilme(int id) throws IOException {
		FilmeDAO filmeDAO = new FilmeDAO();
		return filmeDAO.buscarFilme(id);
	}
}
