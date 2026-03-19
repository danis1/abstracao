package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.Aplicativo;
import br.edu.fatecpg.abstracao.model.Cliente;
import br.edu.fatecpg.abstracao.model.SistemaOperacional;
import br.edu.fatecpg.abstracao.model.Tarefa;
import br.edu.fatecpg.abstracao.model.Relatorio;
import br.edu.fatecpg.abstracao.model.Avaliacao;
//=========================================================================

public class Main {

	public static void main(String[] args) {

//=========================================================================

//86 - APLICATIVO		

		// Aplicativo 1

		Aplicativo appA = new Aplicativo();
		appA.nome = "Amazon";
		appA.versao = 1.02;

		System.out.println("Aplicativo A {" + "Nome: " + appA.nome + " versao: " + appA.versao + "}");
		appA.iniciar();

		System.out.println("============================-----\n");

		// Aplicativo 2

		Aplicativo appB = new Aplicativo();
		appB.nome = "Shopee";
		appB.versao = 3.151;

		System.out.println("Aplicativo B {" + "Nome: " + appB.nome + " versao: " + appB.versao + "}");
		appB.iniciar();

		System.out.println("============================-----\n");

//=========================================================================

//84 - CLIENTE

		// Cliente 1

		Cliente p1 = new Cliente();
		p1.cpf = "984.627.762-07";
		p1.telefone = "(13) 99180-6870";

		System.out.println("Cliente 1 {" + "CPF: " + p1.cpf + " Telefone: " + p1.telefone + "}");
		appA.iniciar();

		System.out.println("============================-----\n");

		// Cliente 2

		Cliente p2 = new Cliente();
		p2.cpf = "658.547.256-06";
		p2.telefone = "(13) 98120-3080";

		System.out.println("Cliente 2 {" + "CPF: " + p2.cpf + " Telefone: " + p2.telefone + "}");
		appA.iniciar();

		System.out.println("============================-----\n");

//=========================================================================

//92 - SISTEMA OPERACIONAL

		// Sistema Operacional 1

		SistemaOperacional sis1 = new SistemaOperacional();
		sis1.proprietario = "Microsoft";
		sis1.ano = "2016";

		System.out.println("Sistema Operacional 1 {" + "Proprietario: " + sis1.proprietario + " Ano: " + sis1.ano + "}");

		sis1.instalar();

		System.out.println("============================-----\n");

		// Sistema Operacional 2

		SistemaOperacional sis2 = new SistemaOperacional();

		sis2.proprietario = "Apple";
		sis2.ano = "2020";

		System.out.println("Sistema operacional 2 {" + "Proprietario: " + sis2.proprietario + " Ano: " + sis2.ano + "}");
		sis2.instalar();

		System.out.println("============================-----\n");

//=========================================================================

//92 - TAREFA

		// Tarefa 1

		Tarefa tf1 = new Tarefa();
		tf1.prazo = "2 Dias";
		tf1.status = "Concluido";

		System.out.println("Tarefa 1 {" + "Prazo: " + tf1.prazo + " Status: " + tf1.status + "}");
		tf1.gerando();

		System.out.println("============================-----\n");

		// Tarefa 2

		Tarefa tf2 = new Tarefa();
		tf2.prazo = "8 Dias";
		tf2.status = "Em Andamento";

		System.out.println("Tarefa 2 {" + "Prazo: " + tf2.prazo + " Status: " + tf2.status + "}");
		tf2.gerando();

		System.out.println("============================-----\n");

// =========================================================================

		// 95 - RELATORIO

		// Relatorio 1

		Relatorio rl1 = new Relatorio();
		rl1.titulo = "Sistema de Encanamento";
		rl1.autor = "Marcio";

		System.out.println("Relatorio 1 {" + "Titulo: " + rl1.titulo + " Autor: " + rl1.autor + "}");
		rl1.elaborando();

		System.out.println("============================-----\n");

		// Relatorio 1

		Relatorio rl2 = new Relatorio();
		rl2.titulo = "Sistema de tubulação";
		rl2.autor = "Miguel";

		System.out.println("Relatorio 2 {" + "Titulo: " + rl2.titulo + " Autor: " + rl2.autor + "}");
		rl2.elaborando();

		System.out.println("============================-----\n");

// =========================================================================

// 100 -  AVALIACAO

		// Avaliacao 1

		Avaliacao ava1 = new Avaliacao();
		ava1.data = "15/08/2023";
		ava1.local = "Escola Matriz";

		System.out.println("Avaliação 1 {" + "Data: " + ava1.data + " Local: " + ava1.local + "}");
		ava1.aplicando();

		System.out.println("============================-----\n");
		
		
		// Avaliacao 2

		Avaliacao ava2 = new Avaliacao();
		ava2.data = "20/04/2027";
		ava2.local = "Quartel";

		System.out.println("Avaliação 2 {" + "Data: " + ava2.data + " Local: " + ava2.local + "}");
		ava1.aplicando();

		System.out.println("============================-----\n");

	}
}
