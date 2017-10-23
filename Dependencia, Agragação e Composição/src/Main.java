import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		String nome;
		int nun = 1;
		Scanner sc = new Scanner(System.in);
		Montadora m = new Montadora();
		System.out.print("Digite o nome da empresa: ");
		m.empresa = sc.nextLine();
		while (a != 4) {
			System.out.println("Empresa montadora de carros " + m.empresa
					+ "\n1) Dependência (Montagem de veículos)\n2) Associação por agregação(Funcionarios)\n3) Associação por composição(Máquinas)\n4) Finalizar");
			a = sc.nextInt();
			while (a == 1) {
				ArrayList<Carro> dependencia = new ArrayList<Carro>();
				if (nun != 2) {
					System.out.print("Quantidade de metal na empresa: ");
					m.metal = sc.nextInt();
					System.out.println("Criar um carro? \n1) sim\n2) não");
					nun = sc.nextInt();
					if (nun == 2) {
						a = 100;
					}
				} else {
					System.out.println("Criar um carro? \n1) sim\n2) não");
					nun = 1;
				}
				while (nun == 1) {
					Carro c = new Carro();
					System.out.println("Ano do carro");
					c.ano = sc.nextInt();
					System.out.println("Nome do Carro");
					c.modelo = sc.nextLine();
					c.modelo = sc.nextLine();
					System.out.println("Quantidade de metal necessária");
					c.qtdMetal = sc.nextInt();
					if (c.montarCarro(m, c.qtdMetal) == true) {
						dependencia.add(c);
					}
					int i = 1;
					while (i == 1) {
						System.out.println(
								"-------------------------------------------\n1) Montar outro carro\n2) Ver seus carros\n3) Remover um item\n4) Pesquisar\n5) Sair");
						i = sc.nextInt();
						if (i == 1) {
							i = 10;
						}
						if (i == 2) {
							for (int j = 0; j < dependencia.size(); j++) {
								System.out.println((j + 1) + ")" + " Carro " + m.empresa + " "
										+ dependencia.get(j).modelo + " " + dependencia.get(j).ano + " foi utilizado "
										+ dependencia.get(j).qtdMetal + " de metal");
							}
							System.out.println("-------------------------------------------");
							i = 1;
						}
						if (i == 3) {
							System.out.println("Digite o número do que você quer excluir: ");
							for (int j = 0; j < dependencia.size(); j++) {
								System.out.println((j + 1) + ") " + dependencia.get(j).modelo);
							}
							int qual = sc.nextInt();
							qual -= 1;
							dependencia.remove(qual);
							System.out.println("Carro removido");
							i = 1;
						}
						if (i == 4) {
							System.out.println(
									"1) Pesquisar por modelo:\n2) Pesquisar por ano\n 3) Pesquisar por quantidade de metal");
							int q = sc.nextInt();
							if (q == 1) {
								System.out.println("Digite o modelo: ");
								String pModelo = sc.nextLine();
								pModelo = sc.nextLine();
								for (int j = 0; j < dependencia.size(); j++) {
									if (dependencia.get(j).modelo.toLowerCase().equals(pModelo.toLowerCase())) {
										System.out.println(dependencia.get(j).modelo + " " + dependencia.get(j).ano);
									}
								}
								i = 1;
							} else if (q == 2) {
								System.out.println("Digite o ano: ");
								int ano = sc.nextInt();
								for (int j = 0; j < dependencia.size(); j++) {
									if (dependencia.get(j).ano == ano) {
										System.out.println(dependencia.get(j).modelo + " " + dependencia.get(j).ano);
									}
								}
								i = 1;
							} else if (q == 3) {
								System.out.println("Digite a quantidade de metal: ");
								int metal = sc.nextInt();
								for (int j = 0; j < dependencia.size(); j++) {
									if (dependencia.get(j).qtdMetal == metal) {
										System.out.println(dependencia.get(j).modelo + " " + dependencia.get(j).ano
												+ " || Metal utilizado: " + dependencia.get(j).qtdMetal);
									}
								}
								i = 1;
							}
						}
						if (i == 5) {
							nun = 0;
							a = 0;
							i = 0;
						}
					}
				}
			}
			while (a == 2) {
				ArrayList<Funcionario> func = new ArrayList<Funcionario>();
				System.out.println("Adicionar funcionario?\n1) Sim\n2) Não");
				int n = sc.nextInt();
				if (n == 2) {
					a = 100;
				}
				while (n == 1) {
					Funcionario f = new Funcionario();
					System.out.println("Nome");
					f.nome = sc.nextLine();
					f.nome = sc.nextLine();
					System.out.println("Idade");
					f.idade = sc.nextInt();
					System.out.println("CPF");
					f.cpf = sc.nextLong();
					m.setFuncionario(f);
					n = 2;
					while (n == 2) {
						System.out.println(
								"------------------------------\n1) Adicionar funcionario\n2) Listar Funcionarios\n3) Remover Funcionarios\n4) Buscar Funcionario\n5) Sair\n------------------------------");
						int q = sc.nextInt();
						if (q == 1) {
							n = 1;
						} else if (q == 2) {
							func = m.getFuncionario();
							for (int j = 0; j < func.size(); j++) {
								System.out.println(func.get(j).nome + "\nCPF: " + func.get(j).cpf);

							}
						} else if (q == 3) {
							func = m.getFuncionario();
							for (int j = 0; j < func.size(); j++) {
								System.out.println(func.get(j).nome + "\nCPF: " + func.get(j).cpf);

							}
							System.out.println("Nome de quem você quer excluir: ");
							nome = sc.nextLine().toLowerCase();
							nome = sc.nextLine().toLowerCase();
							for (int j = 0; j < func.size(); j++) {
								if (func.get(j).nome.toLowerCase().equals(nome.toLowerCase())) {
									func.remove(j);
								}
							}
						} else if (q == 4) {
							System.out.println("Pesquisar funcionario por CPF");
							nun = sc.nextInt();
							for (int j = 0; j < func.size(); j++) {
								if (func.get(j).cpf == nun) {
									System.out.println("Nome: " + func.get(j).nome + "\nIdade: " + func.get(j).idade
											+ "\nCPF: " + func.get(j).cpf);
								}
							}
						} else if (q == 5) {
							n = 0;
							a = 0;
						}
					}
				}
			}
			while (a == 3) {
				ArrayList<Maquina> maq = new ArrayList<Maquina>();
				System.out.println("Adicionar maquina\n1) Sim\n2)Não");
				nun = sc.nextInt();
				if (nun == 2) {
					a = 100;
				}
				while (nun == 1) {
					System.out.println("Modelo da maquina: ");
					String modelo = sc.nextLine();
					modelo = sc.nextLine();
					System.out.println("Potência da maquina(em kW/h): ");
					int pot = sc.nextInt();
					m.addMaquina(modelo, pot);
					maq = m.getMaquina();
					nun = 2;
					while (nun == 2) {
						System.out.println(
								"------------------------------\n1)Adicionar outra maquina\n2)Listar maquinas\n3)Remover maquina\n4)Pesquisar\n5)Sair\n------------------------------");
						nun = sc.nextInt();
						if (nun == 1) {
							nun = 10;
						}
						if (nun == 2) {
							for (int j = 0; j < maq.size(); j++) {
								System.out.println(maq.get(j).getModelo() + " " + maq.get(j).getPotencia() + "kW/h");
							}
						} else if (nun == 3) {
							for (int j = 0; j < maq.size(); j++) {
								System.out.println(maq.get(j).getModelo());
							}
							System.out.println("Qual voce quer excluir?");
							String qual = sc.nextLine();
							qual = sc.nextLine();
							for (int j = 0; j < maq.size(); j++) {
								if (maq.get(j).getModelo().toLowerCase().equals(qual.toLowerCase())) {
									maq.remove(j);
								}
							}
						} else if (nun == 4) {
							System.out.println("Pesquisa por potência");
							int pote = sc.nextInt();
							for (int j = 0; j < maq.size(); j++) {
								if (maq.get(j).getPotencia() == pote) {
									System.out.println(maq.get(j).getModelo() + " " + maq.get(j).getPotencia());
								}
							}
						} else if (nun == 5) {
							a = 0;
							nun = 0;
						}

					}
				}
			}
		}
		sc.close();
	}
}
