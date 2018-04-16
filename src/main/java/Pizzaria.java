
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@SessionScoped
@ManagedBean(name = "pizzaria")
public class Pizzaria {
	String nome;
	String telefone;
	String tipoMassa;
	String tipoCobertura;
	String tamanhoPizza;
    double valorPizza;
	double quantidadePizza;
	String metodoEntrega;

	public double getValorPizza() {
		return valorPizza;
	}

	public void setValorPizza(double valorPizza) {
		this.valorPizza = valorPizza;
	}

	public double getQuantidadePizza() {
		return quantidadePizza;
	}

	public void setQuantidadePizza(double quantidadePizza) {
		this.quantidadePizza = quantidadePizza;
	}

	public String getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}

	public void setSelecionarTipoCobertura(List<SelectItem> selecionarTipoCobertura) {
		this.selecionarTipoCobertura = selecionarTipoCobertura;
	}

	private List<SelectItem> selecionarTipoMassa;

	public List<SelectItem> getSelecionarTipoMassa() {
		selecionarTipoMassa = new ArrayList<SelectItem>();
		selecionarTipoMassa.add(new SelectItem("Selecione o tipo da massa"));
		selecionarTipoMassa.add(new SelectItem("Fina Macia"));
		selecionarTipoMassa.add(new SelectItem("Fina Crocante"));
		selecionarTipoMassa.add(new SelectItem("Espessa Macia"));
		selecionarTipoMassa.add(new SelectItem("Espessa Crocante"));
		return selecionarTipoMassa;
	}

	private List<SelectItem> selecionarTipoCobertura;

	public List<SelectItem> getSelecionarTipoCobertura() {
		selecionarTipoCobertura = new ArrayList<SelectItem>();
		selecionarTipoCobertura.add(new SelectItem("Selecione a cobertura da pizza"));
		selecionarTipoCobertura.add(new SelectItem("Alho"));
		selecionarTipoCobertura.add(new SelectItem("Portuguesa"));
		selecionarTipoCobertura.add(new SelectItem("Muçarela"));
		selecionarTipoCobertura.add(new SelectItem("Bacon"));
		selecionarTipoCobertura.add(new SelectItem("Calabresa"));
		selecionarTipoCobertura.add(new SelectItem("À Moda"));
		selecionarTipoCobertura.add(new SelectItem("Napolitana"));

		return selecionarTipoCobertura;
	}

	private List<SelectItem> selecionarTamanhoPizza;

	public List<SelectItem> getSelecionarTamanhoPizza() {
		selecionarTamanhoPizza = new ArrayList<SelectItem>();
		selecionarTamanhoPizza.add(new SelectItem("Pequena"));
		selecionarTamanhoPizza.add(new SelectItem("Média"));
		selecionarTamanhoPizza.add(new SelectItem("Grande"));

		return selecionarTamanhoPizza;

	}

	public void setSelecionarMetodoEntrega(List<SelectItem> selecionarMetodoEntrega) {
		this.selecionarMetodoEntrega = selecionarMetodoEntrega;
	}

	private List<SelectItem> selecionarMetodoEntrega;

	public List<SelectItem> getSelecionarMetodoEntrega() {
		selecionarMetodoEntrega = new ArrayList<SelectItem>();
		selecionarMetodoEntrega.add(new SelectItem("Buscar no estabelecimento"));
		selecionarMetodoEntrega.add(new SelectItem("Entrega em domicílio"));

		return selecionarMetodoEntrega;
	}

	public String getTamanhoPizza() {
		return tamanhoPizza;
	}

	public void setTamanhoPizza(String tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}

	public String getMetodoEntrega() {
		return metodoEntrega;
	}

	public void setMetodoEntrega(String metodoEntrega) {
		this.metodoEntrega = metodoEntrega;
	}

	public void setSelecionarTamanhoPizza(List<SelectItem> selecionarTamanhoPizza) {
		this.selecionarTamanhoPizza = selecionarTamanhoPizza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipoMassa() {
		return tipoMassa;
	}

	public void setTipoMassa(String tipoMassa) {
		this.tipoMassa = tipoMassa;
	}

	public void setSelecionarTipoMassa(List<SelectItem> selecionarTipoMassa) {
		this.selecionarTipoMassa = selecionarTipoMassa;
	}

	public String listarItens() {

		return ("output.xhtml");
	}

	public String novoPedido() {
		nome = "";
		telefone = "";
		tipoMassa = "";
		tipoCobertura = "";
		return ("input.xhtml");

	}

	public void limpar() {
		nome = "";
		telefone = "";
		tipoMassa = "";
		tamanhoPizza = "";
		valorPizza = 0.0;
		metodoEntrega = "";
	}

}
