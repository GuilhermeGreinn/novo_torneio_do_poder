package br.com.unicuritiba.TorneioDoPoder;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.unicuritiba.TorneioDoPoder.models.Lutador;
import br.com.unicuritiba.TorneioDoPoder.repositories.LutadorRepository;

@Controller
public class TorneioDoPoderController {
	@Autowired
	private LutadorRepository repositorio;
	
	@GetMapping("/")
	public ModelAndView home() {
		
		List<Lutador> lutadores = repositorio.findAll();
		
		ModelAndView view=new ModelAndView("index");
		view.addObject("lutadores", lutadores);
		
		return view;
	}

}
