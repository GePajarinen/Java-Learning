

public class Cobranca...{

	@Autowired
	private CobrancaRepository cr;

	.
	.
	.

	///
	@RequestMapping("/{codigo}/info")
	public ModelAndView info(@PathVariable("codigo") long codigo){
		Cobranca cobrança = cr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("Informacoes");
		mv.addObject("cobranca", cobranca);
		return mv;		

}

}