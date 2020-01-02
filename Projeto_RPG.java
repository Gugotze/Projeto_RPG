package Projeto;

import java.util.*;

class Projeto_RPG {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static int javaCoins = 0, vidas = 0, sanidade = 0, cont_battle = 0, revive = 1, morte = 1, cont = 0;
	static int agua = random.nextInt(5), vara = random.nextInt(4), elixir = random.nextInt(3),
			tartare = random.nextInt(5), fisgadas = 5;
	static String nome_jogador, resposta, arma[] = new String[4], mentor;

	public static void main(String[] args) throws InterruptedException {
		String opcoes; // opções para o menu

		Logo(); // exibe o logo Java Wars

		do {
			System.out.println("		       .-.\r\n" + "                      |_:_|\r\n"
					+ "                     /(_Y_)\\\r\n" + ".                   ( \\/M\\/ )\r\n"
					+ " '.               _.'-/'-'\\-'._\r\n" + "   ':           _/.--'[[[[]'--.\\_\r\n"
					+ "     ':        /_'  : |::\"| :  '.\\\r\n" + "       ':     //   ./ |oUU| \\.'  :\\\r\n"
					+ "         ':  _:'..' \\_|___|_/ :   :|\r\n" + "           ':.  .'  |_[___]_|  :.':\\\r\n"
					+ "            [::\\ |  :  | |  :   ; : \\\r\n" + "             '-'   \\/'.| |.' \\  .;.' |\r\n"
					+ "             |\\_    \\  '-'   :       |\r\n" + "             |  \\    \\ .:    :   |   |\r\n"
					+ "             |   \\    | '.   :    \\  |\r\n" + "             /       \\   :. .;       |\r\n"
					+ "            /     |   |  :__/     :  \\\\\r\n" + "           |  |   |    \\:   | \\   |   ||\r\n"
					+ "          /    \\  : :  |:   /  |__|   /|\r\n" + "          |     : : :_/_|  /'._\\  '--|_\\\r\n"
					+ "          /___.-/_|-'   \\  \\\r\n" + "                         '-'");
			System.out.println("1. Jogar");
			System.out.println("2. Créditos");
			System.out.println("3. Sair");

			opcoes = sc.nextLine();

			switch (opcoes) {
			case "1":
				System.out.println("Loading...\n");
				Sinopse(); // exibe a sinopse do jogo

				do {
					System.out
							.println("Escolha em qual universo deseja acordar:\n" + "1- Khalintor\n" + "2- Nofigrad\n");

					switch (opcoes = sc.nextLine()) {
					case "1":
						Python_World();
						break;
					case "2":
						Csharp_World();
						break;
					default:
						System.out.println("Opção inválida.\n");
						break;
					}
				} while (!opcoes.equals("1") && !opcoes.equals("2"));

			case "2":
				System.out.println(
						"Copyright @ 2019 - Todos os direitos reservados.\nGustavo Fonseca\nMurillo Hejaije\nSillas Cavalcante");
				break;

			case "3":
				System.out.println("Saindo...\n");
				break;

			default:
				System.out.println("Opção inválida.\n");
				break;
			}
		} while (!opcoes.equals("1") && !opcoes.equals("3"));

	} // main

	// Fução para o logo do jogo

	static void Logo() {
		System.out.println("       _  _  _                                                                  ");
		System.out.println("      (_)(_)(_)                                                                 ");
		System.out.println("         (_)            _  _  _          _               _        _  _  _       ");
		System.out.println("         (_)           (_)(_)(_) _      (_)_           _(_)      (_)(_)(_) _    ");
		System.out.println("         (_)            _  _  _ (_)       (_)_       _(_)         _  _  _ (_)   ");
		System.out.println("  _      (_)          _(_)(_)(_)(_)         (_)_   _(_)         _(_)(_)(_)(_)   ");
		System.out.println(" (_)  _  (_)         (_)_  _  _ (_)_          (_)_(_)          (_)_  _  _ (_)_  ");
		System.out.println("  (_)(_)(_)            (_)(_)(_)  (_)           (_)              (_)(_)(_)  (_) ");
		System.out.println(" _             _");
		System.out.println("(_)           (_)                                                               ");
		System.out.println("(_)           (_)        _  _  _            _       _  _           _  _  _  _   ");
		System.out.println("(_)     _     (_)       (_)(_)(_) _        (_)_  _ (_)(_)        _(_)(_)(_)(_)  ");
		System.out.println("(_)   _(_)_   (_)        _  _  _ (_)         (_)(_)             (_)_  _  _  _   ");
		System.out.println("(_)  (_) (_)  (_)      _(_)(_)(_)(_)         (_)                  (_)(_)(_)(_)_ ");
		System.out.println("(_)_(_)   (_)_(_)     (_)_  _  _ (_)_        (_)                   _  _  _  _(_)");
		System.out.println("  (_)       (_)         (_)(_)(_)  (_)       (_)                  (_)(_)(_)(_)\n");
	}

	// Função para a sinopse

	static void Sinopse() {
		System.out.println(
				"Há muito tempo atrás ouvia-se uma história que existiam dois universos 'Khalintor' e 'Aincrad'"
						+ "\nonde em cada um deles, existiam sete esferas do conhecimento, cujo poder emanado"
						+ "\nera desconhecido.\n");
	}

	// Jogo com feedback da linguagem Python

	static void Python_World() throws InterruptedException {

		// Tutorial do jogo

		System.out.println("*-- Ano 2350--*\n"
				+ "\nO Universo Khalintor está em guerra a um tempo, os rebeldes e o exército cibernético estão em conflito"
				+ "\napós a descoberta das 7 esferas do conhecimento."
				+ "\nAo acordar no meio desse imenso conflito, ao lado de seu corpo,"
				+ "\nvocê encontra, o que apararenta ser um pedaço de vidro."
				+ "\nApós encostar no vidro, um holograma se projeta...\n");
		System.out.println("                                         /~~__\r\n"
				+ "                                        / \\  \\~~\\\r\n"
				+ "                           -~~\\/~~~~~~~//~~\\     |\r\n"
				+ "                         /~/ / \\ |  | // /  |  | |\r\n"
				+ "                        / / /~~\\\\ |  // /  /|  | |\r\n"
				+ "                       //  |\\\\  \\\\ |// /  / |    |\r\n"
				+ "                      |  / ' \\\\  \\\\V/ /  / /| |  '\r\n"
				+ "                      ||  |                 | | ||\r\n"
				+ "                      |   '                 |   ||\r\n"
				+ "                      | || ~--__       __--~|| ||`\r\n"
				+ "                      |  ' .____`     '____.||  | |\r\n"
				+ "                      | ||  \\(')\\  ,' /(')/ '  '| |\r\n"
				+ "                      ||||   ~~~   |   ~~~ || | | |\r\n"
				+ "                      | |`         |      ' ||| | |\r\n"
				+ "                      | | |        |        | | | |\r\n"
				+ "                      ||| `       \\v/       | | ' `\r\n"
				+ "                      ` |  |               ||' |   |\r\n"
				+ "                       |`  `    ---v---    '|  |   |\r\n"
				+ "                       ``|~ |    ~~~~~    | '  '   |\r\n"
				+ "                     /~\\|`  |\\           / |  |/~\\ |\r\n"
				+ "                    |/~\\``| | `_       -'  '  '/~\\|`\r\n"
				+ "                    ||  ||| '   ~-_ _-~   /| ||  || |\r\n"
				+ "        __________. || ,||`|       ~    ~' | ||, || .L_________\r\n"
				+ "    _-~~          |~|| |||||   |       |   | '|| ||~|          ~~-_\r\n"
				+ "  ,~         ()   | ||/||||`    |     |    || ||\\|| |   ()         ~,\r\n"
				+ " /                | `` |~~'     `     '    |'~~| '' |                \\\r\n"
				+ "|          ()  () |    |  /      |   |     '\\  |    | ()  ()          |\r\n"
				+ "|                 |    | |\\______     ______/| |    |                 |\r\n"
				+ "`                /     | | ~_    `   '    _~ | |     \\                '\r\n"
				+ " |              /  []  |/\\ //~_    |    _~\\\\ /\\|  []  \\              |\r\n"
				+ " |       _-~~~~~ \\    /|  ~/ //~_  |  _~\\\\ \\~  |\\    / ~~~~~-_       |\r\n"
				+ " |      /     |  |\\  / |    ~/   ~_|_~   \\~    | \\  /|  |     \\      |\r\n"
				+ " |_____|     _~  | \\/  '      ~_   ~_  _~      `  \\/ |  ~_     |_____|\r\n"
				+ "   |        '    |    |         ~_   ~_         |    |    `        |\r\n"
				+ "   |       |     '    |       _~  ~_   ~_       |    `     |       |\r\n"
				+ "   |       '    |     ` ___ _=.  _~ ~_  .=_ ___ '     |    `       |\r\n"
				+ "   |      |     |      |  _~ O|_~ / \\ ~_|O ~_  |      |     |      |\r\n"
				+ "   |      |     |      `_~   _~  __L__  ~_   ~_'      |     |      |\r\n"
				+ "   |______|     '|      |  _~  _~,---.~_  ~_  |      |`     |______|\r\n"
				+ "    |          | `      `_~_--~_~.===.~_~--_~_'      ' |          |\r\n"
				+ "    |          |  |      \\_-~~~.;'(O)`;.~~~-_/      |  |          |\r\n"
				+ "    |          |  |        ~_  ||\"=H=\"||  _~        |  |          |\r\n"
				+ "    |          '  `          ~_|h__H__n|_~          '  `          |\r\n"
				+ "    |         |    |           ~_-----_~           |    |         |\r\n"
				+ "    |         |    |             ~_ _~             |    |         |\n");
		System.out.println("Ser estranho: Olá DeveloperWarrior, eu me chamo LightDeveloper,"
				+ "\neu lhe invoquei no meu mundo, pois preciso de sua ajuda.\n"
				+ "\nEstamos em guerra por conta da descoberta das 7 orbes do conhecimento, porém,"
				+ "\no exército não tem conhecimento ainda do poder que elas possuem."
				+ "\n Ainda temos tempo para tomar posse dessas esferas, das mãos do mal, antes que,"
				+ "\nseu armamento se torne invencível e ele possa dominar outros mundos.\n"
				+ "\nCaso eles consigam esse poder, nosso universo, e principalmente a nossa capital 'MilleniumJavcon', estará em perigo."
				+ "\nNossa capital é dividida por muralhas cibernáticas, e cada muralha é defendida por um Coronel estelar,"
				+ "\nno qual está em posse de uma esfera.\n"
				+ "\nA última muralha é governada pela maior Elite do exército,"
				+ "\nvocê não pode deixar que os Coronéis cheguem na última muralha, pois"
				+ "\nse isso ocorrer, o maior Elite do exército irá tomar posse de todas elas e, nosso Universo estará em perigo."
				+ "\nPreciso que me ajude a unir essas esferas em prol de nosso universo.\n"
				+ "\nQual o seu nome jovem DeveloperWarrior?");
		mentor = "LightDeveloper";
		nome_jogador = sc.nextLine();
		System.out.println("Seu nome é " + nome_jogador + " ? "
				+ " Entendi!. Espero poder te ajudar em toda sua jornada.\n"
				+ "\nVocê esta equipado com uma armadura feita Vibranium, ao apertar o botão em seu braço direito, uma espada laser será ativada."
				+ "\nVocê precisará dela para combater os Coronéis e seus soldados em cada muralha."
				+ "\nEsta vendo esse botão ao lado do seu coração? Aperte ele!\n");

		// Elaborando um Random para saber com quantas vidas o jogador irá iniciar o
		// jogo

		Random botao_vidas = new Random();
		System.out.println("Deseja apertar o botão?" + "\n1- Sim" + "\n2- Não");
		String botao = sc.nextLine();
		while (!botao.equals("1")) {
			System.out.println("Você precisa apertar o botão ou não irá prosseguir em sua jornada!");
			botao = sc.nextLine();
		}

		vidas += botao_vidas.nextInt(6 - 1) + 1;

		System.out.println("*- Você recebeu " + vidas + " vidas -*\n");
		System.out.println(mentor + ": Caso sua vida fique abaixo de 0, você morrerá. Caso isso ocorra,\n"
				+ "sua armadura está equipada com um equipamento, similiar a um desfibrilador, que te da um choque\n"
				+ "e te revive aonde você morreu, porém, ele precisa de cargas,\n"
				+ "tome cuidado e não morra com frequência, pois se as cargas acabarem,\n"
				+ "você nunca mais irá renascer, nem aqui e nem no seu mundo.\n");
		System.out.println(mentor + ": Antes de você começar sua jornada,\n"
				+ "vou lhe apresentar um grande amigo que será muito importante na sua viajem.\n");

		// Chamando o Mercador para mostrar como ele funciona e introduzindo as moedas
		// do jogo.

		System.out.println("Deseja conhece-lo?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println("Mercador: Olá viajante, irei te ajudar em sua jornada.\n"
					+ "Eu vendo diversos itens que serão essenciais para a sua subrevivência.\n"
					+ "Vou te ajudar lhe dando 100 JavaCoins como cortesia da casa.\n");
			javaCoins += 100;
			Mercador(javaCoins);
		} else {
			System.out.println(mentor
					+ ": Eu ia te apresentar o Mercador, mas já que você não quis conhece-lo, fica para uma próxima vez.\n");
		}

		System.out.println(mentor
				+ ": Todas as vezes que você estiver prestes a enfrentar um Coronel, o Mercador estará lá te esperando,\n"
				+ "para caso você tenha JavaCoins o suficiente, poderá comprar um item.\n"
				+ "Você poderá comprar apenas um tipo de item a cada encontro com ele,\n"
				+ "podendo comprar a quantidade que quiser, caso ele as tenha.\n");

		// Começando o jogo.

		System.out.println(mentor + ": " + nome_jogador + ". Você está pronto para começar a sua jornada?\n"
				+ "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1"));

		// Primeira fase - Muralha 1.

		System.out.println("*-Entrando na 1ª Muralha-*\n");
		System.out.println(mentor + ": As muralhas cibernéticas possuem um bloqueio de VPN,\n"
				+ "por conta disso, nossa comunicação será impossível.\n"
				+ "A muralha só será destruída após a queda do General que a proteje.\n"
				+ "Destrua-o para desativar a muralha, e desbloquear o VPN.\n"
				+ "Tome cuidado! A soldados em todas as muralhas. Fique vivo, ou morra tentando, adeus!\n");

		do {
			System.out.println(
					nome_jogador + ": O que devo fazer? Observo dois caminhos, a esquerda tenho pouca visibilidade,\n"
							+ "mas a direita consigo ver algo...\n" + "1- Esquerda\n" + "2- Direita\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Bau(javaCoins, vidas);
			cont++;
			do {
				System.out
						.println("A sua frente, você se depara com dois portões, que levam pra duas saídas distintas.\n"
								+ "1- Ir pelo portão Branco\n" + "2- Ir pelo portão Preto\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println(
							"Após atravessar o portão, você vê uma pessoa, aparentemente com uma idade mais avançada, sem as pernas.\n\n"
									+ nome_jogador + ": O que aconteceu com o senhor?\n\n"
									+ "Desconhecido: Eu estou morrendo... Estava correndo para tentar fugir da guerra\n"
									+ "um Trooper jogou uma granada perto de mim e eu acabei perdendo minhas pernas.\n"
									+ "Por favor, me mate, eu imploro!!!\n ");
					System.out.println("1- Matar o senhor desconhecido, e acabar com seu sofrimento.\n"
							+ "2- Deixa-lo morrer me meio a guerra.\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("De forma rápida e indolor. Sua espada penetra o coração do senhor...\n\n"
							+ "Desconhecido: Obrigado...\n");
					sanidade++;
				} else if (resposta.equals("2")) {
					System.out.println(
							nome_jogador + ": Não tenho tempo para lidar com outros problemas, além dos meus.\n");
					System.out.println("Você continua seu caminho.\n"
							+ "Ao olhar para trás, você visualiza uma nave bombardeando o local aonde estava o senhor.\n");
					sanidade--;
				}
			} else if (resposta.equals("2")) {
				do {
					System.out.println("Ao atravessar o portão, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println(
							"Chegando mais perto você percebe que é uma Empunhadura de uma arma cibernética.\n\n"
									+ nome_jogador
									+ ": Aparentemente, preciso de mais 3 peças para reconstruir essa arma.\n\n");
					System.out.println("*- Você recebeu o item: 'Empunhadura enferrujada' -*\n");
					arma[0] = "Empunhadura enferrujada";

					break;
				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			}

		} else if (resposta.equals("2")) {
			Battle();
			cont_battle++;
			do {
				System.out
						.println("A sua frente, você se depara com dois portões, que levam pra duas saídas distintas.\n"
								+ "1- Ir pelo portão Branco\n" + "2- Ir pelo portão Preto\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println("Ao atravessar o portão, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println(
							"Chegando mais perto você percebe que é uma Empunhadura de uma arma cibernética.\n\n"
									+ nome_jogador
									+ ": Aparentemente, preciso de mais 3 peças para reconstruir essa arma.\n\n"
									+ "*- Você recebeu o item: 'Empunhadura enferrujada' -*.\n");
					arma[0] = "Empunhadura enferrujada";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;
				}
			} else if (resposta.equals("2")) {
				System.out.println(
						"Após atravessar o portão, você vê uma pessoa, aparentemente com uma idade mais avançada, sem as pernas.\n\n"
								+ nome_jogador + ": O que aconteceu com o senhor?\n"
								+ "Desconhecido: Eu estou morrendo... Estava correndo para tentar fugir da guerra\n"
								+ "um Trooper jogou uma granada perto de mim e eu acabei perdendo minhas pernas.\n"
								+ "Por favor, me mate, eu imploro!!!\n\n ");
				do {
					System.out.println("1- Matar o senhor desconhecido, e acabar com seu sofrimento\n"
							+ "2- Deixa-lo morrer me meio a guerra?\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("De forma rápida e indolor. Sua espada penetra o coração do senhor...\n"
							+ "Desconhecido: Obrigado...\n");
					sanidade++;
				} else if (resposta.equals("2")) {
					System.out.println(
							nome_jogador + ": Não tenho tempo para lidar com outros problemas, além dos meus.\n");
					System.out.println("Você continua seu caminho.\n"
							+ "Ao olhar para trás, você visualiza uma nave bombardeando o local aonde estava o senhor.\n");
					sanidade--;
				}
			}

		}
		do {
			System.out.println(nome_jogador
					+ ": Sinto um poder muito forte a minha frente, deve estar vindo de um dos Coronéis que o\n"
					+ mentor + " falou anteriormente.\n\n" + nome_jogador
					+ ": O Mercador está perto do grande salão do Coronel.\n\n" + "Deseja interagir com o Mercador?\n"
					+ "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...\n");
		}
		System.out.println(
				nome_jogador + ": O primeiro Coronel está dentro daquele salão... 'O medo toma todo seu corpo'\n"
						+ "Deseja enfrentar o Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_01(vidas);
		} else if (resposta.equals("2")) {
			Morte(vidas);
		}

		System.out
				.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...\n");
		System.out.println(
				"'O uso de 'variaveis', foi usado de diversas formas no passado, na linguangem ancestral 'Python', ele era usada de uma forma mais simples, porém funcional'.\n\n"
						+ "Diferentemente da linguagem  Java, onde as variaveis precisam ser declaradas e atribuidas\r\n"
						+ "na linguagem Python não a necessidade disso.\r\n"
						+ "Outro aspecto da linguagem Python, é que durante a execução do programa, não só os valores\r\n"
						+ "atribuidos a variavel pode mudar, mas também seu tipo.\n\n" + "n=20\n" + "n+=1\n"
						+ "print(n)\n" + "n='vinte'\n" + "print('n')\n\n");
		System.out.println("Lentamente, a primeira barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso... .\n");
		System.out.println(
				mentor + ": Você consegue me ouvir!?\n" + "Você conseguiu derrotar o primeiro Coronel, parabéns!\n"
						+ "Esse foi o primeiro passo para salvar o mundo!.\n\n");
		do {
			System.out.println(mentor + "Você esta pronto para entrar na Segunda muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Siga sua jornada, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 2ª Muralha -*\n");
		}

		// Segunda Fase - Muralha 2

		do {
			System.out.println(nome_jogador + ": O que devo fazer? Observo duas grandes construções...\n"
					+ "1- Entrar na primeira construção\n" + "2- Entrar na segunda construção\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println(
					"Após entrar no prédio, você visualiza uma criança, sentada ao lado de uma escada, aparentemente com os olhos marejados.\n\n"
							+ "Criança: Com licença senhor, você poderia me ajudar?\n"
							+ "Os soldados passaram por aqui e levaram os meus pais. Não sei para onde ir\n"
							+ "Estou com muito medo, o senhor poderia ficar comigo?\n\n ");
			do {
				System.out.println("1- Levar a criança a um local seguro.\n" + "2- Ignorar o pedido da criança.\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				System.out.println(nome_jogador + ": Venha comigo, vou te levar para um lugar seguro.\n"
						+ "Criança: 'Chorando'. Muito obrigado\n\n");
				System.out.println("Você decide voltar para a primeira muralha, já que ela não aparentava mais perigo\n"
						+ "No meio do caminho você, você acabou sendo atingido por um tiro de um Trooper\n\n"
						+ "*- Você perdeu 1 vida -*\n");
				vidas--;
				sanidade++;
				if (vidas < 0) {
					Morte(vidas);
				}
			} else if (resposta.equals("2")) {
				System.out.println(nome_jogador + ": Você já tem idade para se virar sozinho\n");
				System.out.println("Você continua seu caminho. Deixando pra trás, uma vida inocente\n"
						+ "Seu coração aos poucos vai se solidificando... .\n");
				sanidade--;
			}

			do {
				System.out.println("Logo após voltar para o prédio, você vê duas alavancas.\n"
						+ "1- Puxar alavanca esquerda\n" + "2- Puxar alavanca direita\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Aleatorio_Bau_Battle();
			} else if (resposta.equals("2")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Aleatorio_Bau_Battle();
			}

		} else if (resposta.equals("2")) {

			Aleatorio_Bau_Battle();

			do {
				System.out.println(" Após andar em todo o prédio, você vê duas alavancas.\n"
						+ "1- Puxar alavanca esquerda\n" + "2- Puxar alavanca direita\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));

			if (resposta.equals("1")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Aleatorio_Bau_Battle();
			} else if (resposta.equals("2")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Aleatorio_Bau_Battle();
			}

		}
		do {
			System.out
					.println(nome_jogador + ": Sinto um poder muito forte a minha frente, deve ser o segundo Coronel.\n"
							+ "O Mercador está perto do grande salão do Coronel.\n"
							+ "Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println("Deseja enfrentar o Segundo Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_02(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Uma granda é jogada bem no seu pé e explode!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("'O uso da estrutura condicional 'if', foi usado de diversas formas no passado,\n"
				+ "na linguangem ancestral 'Python', ele era usada de uma forma mais simples, porém funcional'.\n\n"
				+ "Difente da linguagem Java, o 'if' na linguagem Python, e os demais tipos de estruturas deveriam ser feitos de forma estruturada\n"
				+ "A cada 'if' que o usúario fizer, abaixo dele, deverá estar com uma 'tabulação' ou seja, 15 espaços\n"
				+ "dessa forma, você estará dizendo que a ação que o programa fizer, estará ligada ao 'if' descrito a cima dele, e o código estará estruturado.\n"
				+ "if(True):\n" + "	print(' ')\n" + "	else:\n" + " 		print(' ')\n\n");
		System.out.println("Lentamente, a segunda barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso novamente... .\n");
		System.out.println(mentor + ": A cada desafio que você passa, você se torna mais forte\n"
				+ "estou muito feliz em ter te invocado em nosso mundo para nos ajudar, obrigado!\n\n");
		do {
			System.out.println(
					mentor + ": Você esta pronto para entrar na Terceira muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println("Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Siga sua jornada, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 3ª Muralha -*\n");
		}

		// Terceira fase - Muralha 3

		System.out.println(
				"Ao entrar na terceira muralha, você não vê nada\n" + "além de apenas dois buracos no chão\n\n");
		do {
			System.out.println(nome_jogador + ": O que devo fazer?\n" + "1- Entrar no primeiro buraco\n"
					+ "2- Entrar no segundo buraco\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println("Ao descer pelo buraco, você chega nos dutos da terceira muralha\n" + nome_jogador
					+ ": Esse lugar cheira muito mal!\n\n");
			Aleatorio_Bau_Battle();
			do {
				System.out.println(
						"Andando nos dutos, você ve uma grade a sua frente, aparentemente com algo brilhanto depois dela.\n"
								+ "Logo a direita você ve um caminho longo...\n"
								+ "1- Ir pelo caminho longo a direita\n" + "2- Ir pelo caminho da grade\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println(
							"Andando pelo caminho longo e escuro, você escuta como se alguém estivesse correndo em sua direção\n"
									+ "Desconhecido: Sai da minha frente!!!\n" + "1- Matar o desconhecido\n"
									+ "2- Deixa-lo passar\n");

					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("O desconhecido vem em sua direção...\n"
							+ "Antes mesmo dele puxar a adaga que estava em sua cintura\n"
							+ "você ativa sua espada e o corta no meio.");
					sanidade--;
				} else if (resposta.equals("2")) {
					System.out.println("O desconhecido vem correndo em sua direção\n"
							+ "com medo, ele puxa a adaga que estava em sua cintura, o ataca e corre desesperadamente\n\n"
							+ "*- Você perdeu 1 de vida -*");
					sanidade++;
					vidas--;
					if (vidas < 0) {
						Morte(vidas);
					}
				}
			} else if (resposta.equals("2")) {
				do {
					System.out.println("Ao atravessar a grade, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println("Chegando mais perto você percebe que é o Carregador de uma arma cibernética.\n"
							+ nome_jogador + ": é a segunda parte da arma!\n"
							+ "*- Você recebeu o item: 'Carregador enferrujado' -*.\n");
					arma[1] = "Carregador enferrujado";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			}

		} else if (resposta.equals("2")) {
			System.out.println("Ao descer pelo buraco, você chega nos dutos da terceira muralha\n" + nome_jogador
					+ ": Esse lugar cheira muito mal!\n\n");
			Aleatorio_Bau_Battle();
			do {
				System.out.println(
						"Andando nos dutos, você ve uma grade a sua frente, aparentemente com algo brilhanto depois dela.\n"
								+ "Logo a direita você ve um caminho longo...\n" + "1- Ir pelo caminho da grade\n"
								+ "2- Ir pelo caminho longo a direita\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println("Ao atravessar a grade, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println("Chegando mais perto você percebe que é o Carregador de uma arma cibernética.\n"
							+ nome_jogador + ": é a segunda parte da arma!\n"
							+ "*- Você recebeu o item: 'Carregador enferrujado' -*.\n");
					arma[1] = "Carregador enferrujado";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			} else if (resposta.equals("2")) {
				do {
					System.out.println(
							"Andando pelo caminho longo e escuro, você escuta como se alguém estivesse correndo em sua direção\n"
									+ "Desconhecido: Sai da minha frente!!!\n" + "1- Matar o desconhecido\n"
									+ "2- Deixa-lo passar\n");

					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("O desconhecido vem em sua direção...\n"
							+ "Antes mesmo dele puxar a adaga que estava em sua cintura\n"
							+ "você ativa sua espada e o corta no meio.\n");
					sanidade--;
				} else if (resposta.equals("2")) {
					System.out.println("O desconhecido vem correndo em sua direção\n"
							+ "com medo, ele puxa a adaga que estava em sua cintura, o ataca e corre desesperadamente\n\n"
							+ "*- Você perdeu 1 de vida -*");
					sanidade++;
					vidas--;
					if (vidas < 0) {
						Morte(vidas);
					}
				}
			}

		}
		do {
			System.out.println(
					"Você continua andando pelos dutos, até que visualiza uma porta, e sente novamente um poder gigantesco.\n"
							+ "Provavelmente é o Terceiro Coronel\n\n"
							+ "O Mercador está perto da porta, aonde se encontra o Coronel.\n"
							+ "Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println(nome_jogador + ": O Terceiro Coronel está logo atrás daquela porta...\n");
		System.out.println("     ---   .    ____        -----      ______   -----        .\r\n"
				+ "  ___     / \\             .....................      ____   / \\\r\n"
				+ "        .'   '.  --  ..:::::''''''''''''''''':::::..      .'   '.\r\n"
				+ "  ---   | ^ ^ |    .::::''''          (_     ''''::::. -- | ^ ^ '\r\n"
				+ "        | ^ ^ |  .::''                       _)    ''::.  | ^ ^ | --\r\n"
				+ "____     '...'  .::'              .-.      (_        '::.  '...'\r\n"
				+ "        .-.!_  .::'       _)     /   \\                '::.   ! ____\r\n"
				+ "       / / `-`.:'                '-.-'            _)    ':..\"\"\".\r\n"
				+ " --    ' |  '.|:'      _)         .'.       (_          ':/' |  \\\r\n"
				+ "       | |   |'.               _/^---^\\_                  |     . --\r\n"
				+ " ___    \\ .  '|               \\-------../         (_      \\   '.'\r\n"
				+ "        ' :   '        _)      '.\\:::/.'       (_   )_    |'   || ___\r\n"
				+ "        | |  .|      _(         | | |'|                   / ' . |\r\n"
				+ "    --  | '. | \\                '.\\ /.'                   '.  | |--\r\n"
				+ "        |'.   '|                 |[ ]|           (_       | .'  |____\r\n"
				+ "__    .'\\ |  .'\\                 '.^.'                    \\ |.  .\r\n"
				+ "     .'-.\\'. | |        _)        (:)                     | ||| |\r\n"
				+ "   .'    \\'..' .             _..--'''--.._      (_       /'-._.-'| ---\r\n"
				+ "   |       `-..'.         .-'             '-.           |      .-'.\r\n"
				+ "    \\            `-.    .'  ..            .. '.        .'-._.-'    `.\r\n"
				+ "--   )              `-./    '::.        .::'   \\   _.-'             /\r\n"
				+ "     '._/-..          /       '::.    .::'      \\-'              .-'\r\n"
				+ "         ::.`-.      ''        '::   ::'        ''       _..-\\_.'\r\n"
				+ "         :::   '._   | \\         '   '         / |    .-'   .:: _____\r\n"
				+ "____     :::      `-.|  '  .----..___..----.  '  | .-'      :::\r\n"
				+ "         :::          \\ |  _..--.     .--.._  | /-'         ::: ---\r\n"
				+ "         :::   _)     | ' /     |     |     \\ ' |  (        :::\r\n"
				+ "   --    :::          )   |   _.'     '._   |   (   )_      :::____\r\n"
				+ "    ____ :::          /'. \\_.'   )\\ /(   '._/ .'\\     (_    :::\r\n"
				+ "         :::       .-'|  `-->-@ /     \\ @->--'  |-.         :::\r\n"
				+ "         :::    .-'   \\         | / \\ |         /  `-.      :::  ---\r\n"
				+ " ----    '' _.-'       |        )/   \\(        |      `-.   :::  _____\r\n"
				+ "  _.-=--..-'          . \\ /\\               /\\ /          `-. ''\r\n"
				+ " /.._    `.        .-'   .\\ '-.\\.\\\\.//./.-' /.`-.           `---.._\r\n"
				+ "|    `.    \\    .-'      | '.             .' |   `-.                \\ \r\n"
				+ " \\    _\\.   `.-'         |   '-././.\\.\\.-'   |      `.               |\r\n"
				+ "  `.-'  |   /::::::::::: \\                   /::::::::`.      ,-.    /\r\n"
				+ " - |   /   /        ----  '-.             .-'     ----  `.    |  \\_.'\r\n"
				+ "__ \\   | .'     _____        '-._._._._.-'     ____      |    |   |\r\n"
				+ "    `--'                                                 `-.  '._ / --\r\n"
				+ "                                                            `...-'\n");
		System.out
				.println("'O medo toma todo seu corpo'\n" + "Deseja enfrentar o Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_03(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Uma bomba explode tudo ao seu redor!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println(
				"'O uso do 'for', foi usado de diversas formas no passado, na linguagem ancestral Python, exigia inicialmente, a definição de uma variável\r\n"
						+ "e, em seguida, a lista que será iterada'.\r\n\n"
						+ "linguagens = ['C', 'Python',  'Lua', 'Cobol', 'Pascal', 'C++']\r\n"
						+ "for lingua in linguagens:\r\n"
						+ "   print('Linguagem contida na variável \"lingua\" neste ciclo: ', lingua)\n\n");
		System.out.println("Logo atrás do corpo do Coronel, uma escada surge, te levando para a superficie.\n\n");
		System.out.println("Lentamente, a terceira barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso... .\n");
		System.out.println(mentor + ": É incrivel o poder que cada orbe transborda no seu exterior\n"
				+ "espero que ainda haja tempo para salvar nossa capital.\n\n");
		do {
			System.out.println(mentor + "Você esta pronto para entrar na Quarta muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Continue seu caminho, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 4ª Muralha -*\n");
		}

		// Quarta Fase - Muralha 4

		do {
			System.out.println(
					"Logo após entrar na 4ª muralha, você percebe que a mesma, é cercada por luzes muito fortes\n"
							+ "que acabam te cegando bruscamente.\n" + "Você escuta um barulho à frente...\n"
							+ nome_jogador + ": Parece ser um som semelhante a de uma cachoeira\n"
							+ "1- Seguir em frente e investigar o barulho\n" + "2- Ficar parado\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Rio(fisgadas);

		} else if (resposta.equals("2")) {

			System.out.println("As luzes continuam te cegando\n" + "você fica muito tempo parado e nesse tempo,"
					+ "uma nave sobrevoou a quarta muralha, te localizou e o bombardeou\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);

		}
		System.out.println("Logo após passar pelo rio, você sente um poder muito forte vindo do alto da cachoeira.\n"
				+ "Você a escala, e logo a frente visualiza um tanque de guerra.\n"
				+ "O Mercador está um pouco antes do tanque de guerra, provavelmente é o 4º Coronel.\n");
		System.out.println("Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println("Deseja enfrentar o Quarto Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_04(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("O tanque atira em você e te joga cachoeira abaixo\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println(
				"Na linguagem python, o comando while faz com que um conjunto de instruções seja executado enquanto uma condição é atendida.\n"
						+ " Quando o resultado dessa condição passa a ser falso, a execução do loop é interrompida:\n"
						+ "contador = 0\r\n" + "while (contador < 10):\r\n" + "       print(contador)\r\n"
						+ "       contador   = contador + 1\r\n" + "");
		System.out.println("Lentamente, a quarta barreira cibernética é desativada, e a escuridão some,\n"
				+ "dando espaço para uma luz gigantesca que acende.\n"
				+ "Você escuta uma voz vindo do seu pulso novamente... .\n");
		System.out
				.println(mentor + ": Pensei que você não sairia dessa, pois estava tudo escuro na zona dessa muralha\n"
						+ "mas ainda bem que você conseguiu!\n");
		do {
			System.out
					.println(mentor + ": Você esta pronto para entrar na Quinta muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println("Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Siga sua jornada, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 5º Muralha -*\n");
		}

		// Quinta Fase - Muralha 5

		System.out
				.println("Ao entrar na quinta muralha, você não vê nada\n" + "a escuridão é sua única companheira\n\n");
		do {
			System.out.println(
					nome_jogador + ": O que devo fazer?\n" + "1- Seguir em meio a escuridão\n" + "2- Ficar parado\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println("Você decide seguir o caminho, sem nem ao menos enxergar algo.\n");

			if (sanidade < 0) {
				System.out.println("Você começa a ver luzes por todos os lugares\n"
						+ "pensando ser algum inimigo, você ataca o ar incansavelmente.\n"
						+ "Você acaba ficando exausto, e só depois de perceber que era apenas ilusões da sua mente, você para de atacar o nada.\n"
						+ "*- Você perdeu 1 de vida por conta do cansaço\n");
			} else {

				do {
					System.out.println("Andando no meio da escuridão,\n"
							+ "seguindo apenas sua intuição, você ve algo brilhando no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println("Chegando mais perto você percebe que é o Carregador de uma arma cibernética.\n"
							+ nome_jogador + ": é a segunda parte da arma!\n"
							+ "*- Você recebeu o item: 'Ferrolho enferrujado' -*.\n");
					arma[2] = "Ferrolho enferrujado";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			}

		} else if (resposta.equals("2")) {
			System.out.println(
					"Você fica parado\n" + "sem nem mesmo saber de onde veio\n" + "algo corta você ao meio!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		do {
			System.out.println(
					"Você continua andando pela escuridão, até que, sente novamente um poder gigantesco a sua frente.\n"
							+ "Provavelmente é o Quinto Coronel\n"
							+ "O Mercador acende uma luz, para lhe mostrar sua localização.\n"
							+ "Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println(nome_jogador + ": O Quinto Coronel está logo a frente, mas não consigo ve-lo... "
				+ "'O medo toma todo seu corpo'\n" + "Deseja enfrentar o Quinto Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_05(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Sem nem saber de onde vem, um tiro certeiro te acerta na cabeça\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("'Diferente da linguagem java, na linguagem python não existe um 'do while',\r\n"
				+ "porém você tem a possibilidade de usar um 'while-else''.\r\n"
				+ "'Ao final do while podemos utilizar a instrução else.\r\n"
				+ "O propósito disso é executar alguma instrução ou bloco de código ao final do loop'\r\n"
				+ "contador = 0\r\n" + "while (contador < 5):\r\n" + "      print(contador)\r\n"
				+ "      contador = contador + 1\r\n" + "else:\r\n"
				+ "      print(\"O loop while foi encerrado com sucesso!\")\r\n" + "");
		System.out.println("Lentamente, a quinta barreira cibernética é desativada, e a escuridão some,\n"
				+ "dando espaço para uma luz gigantesca que acende.\n"
				+ "Você escuta uma voz vindo do seu pulso novamente... .\n");
		System.out.println(mentor + ": É incrivel o poder que cada orbe transborda no seu exterior\n"
				+ "espero que ainda haja tempo para salvar nossa capital.\n\n");
		do {
			System.out.println(mentor + "Você esta pronto para entrar na Sexta muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Continue seu caminho, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 6ª Muralha -*\n");
		}

		// Sexta Fase - Muralha 6

		System.out.println("Logo após passar para a sexta muralha\n" + "você sente um cheiro forte de vegetação\n"
				+ "e percebe que a sexta muralha é tomada por uma vasta floresta.\n\n");
		do {
			System.out.println(
					nome_jogador + ": O que devo fazer? Vejo um caminho com vários cipós e com pouca mobilidade\n"
							+ "e um caminho lamacento.\n" + "1- Ir pelo caminho dos cipós\n"
							+ "2- Ir pelo caminho lamacento\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Aleatorio_Bau_Battle();

			System.out.println(nome_jogador + ": acho que escolhi o caminho mais dificil...\n\n");
			do {
				System.out.println("Um pouco mais a frente dos cipós, uma criança vem correndo em sua direção.\n"
						+ "Aparentando não ter muito dinheiro, ela chega perto de você e roupa suas JavaCoins\n"
						+ "1- Correr atrás da criança\n" + "2- Deixa-la ir com seu dinheiro\n");

				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				System.out.println(
						"Você corre atrás da criança\n" + "ao alcança-la, ela desesperadamente começa a te bater.\n"
								+ "Você lentamente, ativa sua espada e penetra o coração da criança...\n\n"
								+ nome_jogador + ": Espero que na sua próxima reencarnação, você seja mais esperta.\n");
				sanidade -= 2;
			} else if (resposta.equals("2")) {
				System.out.println("Você decide não correr atrás da criança.\n" + nome_jogador
						+ ": Acho que ele precisava muito daquele dinheiro\n" + "não preciso mais dele.\n");
				sanidade += 2;
				javaCoins = 0;
			}
			System.out.println("Você continua o caminho, agora, cortando os cipós com sua espada.\n\n");
		} else if (resposta.equals("2")) {
			Aleatorio_Bau_Battle();

			System.out.println("Com o corpo todo sujo, você sai do rio de lama\n"
					+ "porém o terreno a sua frente começa a deslizar e você cai junto com ele dentro de um grande rio...\n\n");
			Rio_da_floresta(fisgadas);

			System.out.println("Você sobe pelo cipó e corre para bem longe do rio.\n\n");
		}

		System.out.println(
				"Continuando seu caminho, você visualiza uma caverna, e percebe que o Sexto Coronel está dentro dela.\n"
						+ "Ao lado da caverna, o Mercador te chama.\n" + "Deseja interagir com o Mercador?\n"
						+ "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println(nome_jogador + ": O Sexto Coronel está dentro daquela caverna... "
				+ "Deseja enfrentar o Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_06(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Uma lança voa em sua direção, perfurando seu coração!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}

		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("'A criação de funções na linguagem python, eram bem mais fáceis que na linguagem java.\r\n"
				+ "A sintaxe de uma função é definida por três partes:\r\n" + "nome, parâmetros e corpo,\r\n"
				+ "o qual agrupa uma sequência de linhas que representa algum comportamento'.\r\n"
				+ " def hello(meu_nome):\r\n" + "     print('Olá',meu_nome)\n");
		System.out.println("Lentamente, a sexta barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso... .\n");
		System.out.println(mentor + ": Você é realmente muito forte\n"
				+ "a maior Elite do exército se encontra na sétima e última muralha.\n"
				+ "Essa é a última vez que falarei com você, por isso, tenha muito cuidado\n"
				+ "dizem que o topo da pirâmide do exército é traiçoeiro.\n" + "Boa sorte... :)\n");
		do {
			System.out.println(
					mentor + "Você esta pronto para entrar Sétima e última muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println("*- Entrando na 7ª Muralha -*\n");
		}

		// Sétima Fase - Muralha 7

		System.out.println("Ao entrar na última muralha,\n"
				+ "você percebe que ela possui apenas uma enorme pirâmide, com um olho no topo.\n\n");
		System.out.println("                        /\\\r\n" + "  ___                  /  \\                  ___\r\n"
				+ " /   \\     __         /    \\         __     /\r\n"
				+ "/     \\   /  \\   _   / <()> \\   _   /  \\   /\r\n"
				+ "       \\_/    \\_/ \\_/________\\_/ \\_/    \\_/\r\n"
				+ " __________________/__I___I___\\________________\r\n" + "                  /_I___I___I__\\\r\n"
				+ "                 /I___I___I___I_\\\r\n" + "                /___I___I___I___I\\\r\n"
				+ "               /__I___I___I___I___\\\r\n" + "              /_I___I___I___I___I__\\\r\n"
				+ "             /I___I___I___I___I___I_\\\r\n" + "            /___I___I___I___I___I___I\\\r\n"
				+ "           /__I___I___I___I___I___I___\\\r\n" + "          /_I___I___I___I___I___I___I__\\\n\n");
		System.out.println(nome_jogador + ": Eu nunca senti isso antes,\n" + "minhas mãos e pernas tremem,\n"
				+ "O grande Chefe de todo o exército está logo abaixo do grande olho da pirâmide.\n\n"
				+ "O mercador te chama, bem próximo da base da pirâmide, porém,\n"
				+ "ao tentar interagir com ele, um raio, vindo do alto da torre\n" + "queima o mercador.\n\n");

		do {
			System.out.println(nome_jogador + ": O Grande Elite do Exército está no topo da pirâmide... "
					+ "Deseja enfrentar o Grande Elite do Exército?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Grande_Elite_do_Exercito_07(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Um raio te acerta, do alto da pirâmide e te explode!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}

		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("'Pode-se construir uma lista em Python fornecendo todos seus elementos, como em:\r\n"
				+ "vet = [21, 22, 23, 24]; (o finalizador,\r\n"
				+ "só é obrigatório se tiver mais de um comando na mesma linha).\r\n" + "\r\n"
				+ "Pode-se também construtir uma lista em Python de modo interativo,\r\n"
				+ "agragando novo elemento a cada passo usando a função\r\n"
				+ " comando append(.), como em: vet.append(10+i);, que anexa o elemento de valor 10+i à lista'.\n\n"
				+ "vet = [];  'define um vetor vazio'\r\n"
				+ "for i in range(0, n, 1) : 'ou mais simples neste caso \"for i in range(n)'\r\n"
				+ "  vet.append(10+i); 'anexe mais um elemento à lista'");
		System.out.println("Lentamente, a Sétima barreira cibernética é desativada.\n\n");

		if (sanidade < 0) {
			System.out
					.println(nome_jogador + ": Que poder é esse incrível que estou sentindo correndo em minhas veias.\n"
							+ "Só pode ser das orbes do conhecimento.\n\n");
			System.out.println(
					"Por causa de todas as maldades que você fez até aqui, as orbes começam a corromper a sua mente...\n");
			System.out.println(nome_jogador + ": Acho que o " + mentor + " estava certo,\n"
					+ "só apenas esse conhecimento vago que este universo possui não é o bastante.\n"
					+ "Irei usar todo esse conhecimento para governar todos os outros universos, pois"
					+ "apenas eu, posso dominar o universo, para não deixar nas mãos de qualquer idiota.\n\n");
			System.out.println("Você, com uma maldade nunca antes vista, destrói toda a capital MilleniumJavcon,\n"
					+ "e vai embora, buscando dominar e destruir todos os universos possiveis...\n\n");

			System.out.println(".___________. __    __   _______     _______ .__   __.  _______  \r\n"
					+ "|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\ \r\n"
					+ "`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |\r\n"
					+ "    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |\r\n"
					+ "    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  |\r\n"
					+ "    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/");

		} else {
			System.out.println("Você começa a pensar que tudo o que você fez, foi apenas,\n"
					+ "espalhar o ódio por toda a capital.\n" + "Sem pensar duas vezes...\n\n"
					+ "*- Você destroe as 7 Orbes do conhecimento -*\n\n");
			System.out.println(nome_jogador + ": o " + mentor + " estava errado, nada disso era necessário\n"
					+ "para manter a paz nessa capital e no universo.\n"
					+ "Eu matei pessoas inocentes, matei as pessoas que defendiam a cidade, por nada...\n"
					+ "Nada vai pagar os pecados que cometi...\n\n");
			System.out.println(
					"Num último ato, com toda a tristeza acumulada em seu coração, você corta sua garganta com sua espada...\n\n"
							+ nome_jogador + ": Perdão por cometer tantos pecados,\n"
							+ "espero que um dia, eu possa finalmente me livrar do fardo que eu infelizmente, construi...\n\n");
			System.out.println(".___________. __    __   _______     _______ .__   __.  _______  \r\n"
					+ "|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\ \r\n"
					+ "`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |\r\n"
					+ "    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |\r\n"
					+ "    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  |\r\n"
					+ "    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/");
		}

	}

	// Jogo com feedback da linguagem Python

	static void Csharp_World() throws InterruptedException {

		System.out.println("*-- Ano 2350--*\n"
				+ "\nO Universo Nofigrad está em guerra a um tempo, os rebeldes e o exército cibernético estão em conflito"
				+ "\napós a descoberta das 7 esferas do conhecimento."
				+ "\nAo acordar no meio desse imenso conflito, ao lado de seu corpo,"
				+ "\nvocê encontra, o que apararenta ser um pedaço de vidro."
				+ "\nApós encostar no vidro, um holograma se projeta...\n");
		System.out.println("                                         /~~__\r\n"
				+ "                                        / \\  \\~~\\\r\n"
				+ "                           -~~\\/~~~~~~~//~~\\     |\r\n"
				+ "                         /~/ / \\ |  | // /  |  | |\r\n"
				+ "                        / / /~~\\\\ |  // /  /|  | |\r\n"
				+ "                       //  |\\\\  \\\\ |// /  / |    |\r\n"
				+ "                      |  / ' \\\\  \\\\V/ /  / /| |  '\r\n"
				+ "                      ||  |                 | | ||\r\n"
				+ "                      |   '                 |   ||\r\n"
				+ "                      | || ~--__       __--~|| ||`\r\n"
				+ "                      |  ' .____`     '____.||  | |\r\n"
				+ "                      | ||  \\(')\\  ,' /(')/ '  '| |\r\n"
				+ "                      ||||   ~~~   |   ~~~ || | | |\r\n"
				+ "                      | |`         |      ' ||| | |\r\n"
				+ "                      | | |        |        | | | |\r\n"
				+ "                      ||| `       \\v/       | | ' `\r\n"
				+ "                      ` |  |               ||' |   |\r\n"
				+ "                       |`  `    ---v---    '|  |   |\r\n"
				+ "                       ``|~ |    ~~~~~    | '  '   |\r\n"
				+ "                     /~\\|`  |\\           / |  |/~\\ |\r\n"
				+ "                    |/~\\``| | `_       -'  '  '/~\\|`\r\n"
				+ "                    ||  ||| '   ~-_ _-~   /| ||  || |\r\n"
				+ "        __________. || ,||`|       ~    ~' | ||, || .L_________\r\n"
				+ "    _-~~          |~|| |||||   |       |   | '|| ||~|          ~~-_\r\n"
				+ "  ,~         ()   | ||/||||`    |     |    || ||\\|| |   ()         ~,\r\n"
				+ " /                | `` |~~'     `     '    |'~~| '' |                \\\r\n"
				+ "|          ()  () |    |  /      |   |     '\\  |    | ()  ()          |\r\n"
				+ "|                 |    | |\\______     ______/| |    |                 |\r\n"
				+ "`                /     | | ~_    `   '    _~ | |     \\                '\r\n"
				+ " |              /  []  |/\\ //~_    |    _~\\\\ /\\|  []  \\              |\r\n"
				+ " |       _-~~~~~ \\    /|  ~/ //~_  |  _~\\\\ \\~  |\\    / ~~~~~-_       |\r\n"
				+ " |      /     |  |\\  / |    ~/   ~_|_~   \\~    | \\  /|  |     \\      |\r\n"
				+ " |_____|     _~  | \\/  '      ~_   ~_  _~      `  \\/ |  ~_     |_____|\r\n"
				+ "   |        '    |    |         ~_   ~_         |    |    `        |\r\n"
				+ "   |       |     '    |       _~  ~_   ~_       |    `     |       |\r\n"
				+ "   |       '    |     ` ___ _=.  _~ ~_  .=_ ___ '     |    `       |\r\n"
				+ "   |      |     |      |  _~ O|_~ / \\ ~_|O ~_  |      |     |      |\r\n"
				+ "   |      |     |      `_~   _~  __L__  ~_   ~_'      |     |      |\r\n"
				+ "   |______|     '|      |  _~  _~,---.~_  ~_  |      |`     |______|\r\n"
				+ "    |          | `      `_~_--~_~.===.~_~--_~_'      ' |          |\r\n"
				+ "    |          |  |      \\_-~~~.;'(O)`;.~~~-_/      |  |          |\r\n"
				+ "    |          |  |        ~_  ||\"=H=\"||  _~        |  |          |\r\n"
				+ "    |          '  `          ~_|h__H__n|_~          '  `          |\r\n"
				+ "    |         |    |           ~_-----_~           |    |         |\r\n"
				+ "    |         |    |             ~_ _~             |    |         |\n");
		System.out.println("Ser estranho: Olá DeveloperWarrior, eu me chamo LightDeveloper,"
				+ "\neu lhe invoquei no meu mundo, pois preciso de sua ajuda.\n"
				+ "\nEstamos em guerra por conta da descoberta das 7 orbes do conhecimento, porém,"
				+ "\no exército não tem conhecimento ainda do poder que elas possuem."
				+ "\n Ainda temos tempo para tomar posse dessas esferas, das mãos do mal, antes que,"
				+ "\nseu armamento se torne invencível e ele possa dominar outros mundos.\n"
				+ "\nCaso eles consigam esse poder, nosso universo, e principalmente a nossa capital 'MilleniumJavcon', estará em perigo."
				+ "\nNossa capital é dividida por muralhas cibernáticas, e cada muralha é defendida por um Coronel estelar,"
				+ "\nno qual está em posse de uma esfera.\n"
				+ "\nA última muralha é governada pela maior Elite do exército,"
				+ "\nvocê não pode deixar que os Coronéis cheguem na última muralha, pois"
				+ "\nse isso ocorrer, o maior Elite do exército irá tomar posse de todas elas e, nosso Universo estará em perigo."
				+ "\nPreciso que me ajude a unir essas esferas em prol de nosso universo.\n"
				+ "\nQual o seu nome jovem DeveloperWarrior?");
		mentor = "LightDeveloper";
		nome_jogador = sc.nextLine();
		System.out.println("Seu nome é " + nome_jogador + " ? "
				+ " Entendi!. Espero poder te ajudar em toda sua jornada.\n"
				+ "\nVocê esta equipado com uma armadura feita Vibranium, ao apertar o botão em seu braço direito, uma espada laser será ativada."
				+ "\nVocê precisará dela para combater os Coronéis e seus soldados em cada muralha."
				+ "\nEsta vendo esse botão ao lado do seu coração? Aperte ele!\n");

		// Elaborando um Random para saber com quantas vidas o jogador irá iniciar o
		// jogo

		Random botao_vidas = new Random();
		System.out.println("Deseja apertar o botão?" + "\n1- Sim" + "\n2- Não");
		String botao = sc.nextLine();
		while (!botao.equals("1")) {
			System.out.println("Você precisa apertar o botão ou não irá prosseguir em sua jornada!");
			botao = sc.nextLine();
		}

		vidas += botao_vidas.nextInt(6 - 1) + 1;

		System.out.println("*- Você recebeu " + vidas + " vidas -*\n");
		System.out.println(mentor + ": Caso sua vida fique abaixo de 0, você morrerá. Caso isso ocorra,\n"
				+ "sua armadura está equipada com um equipamento, similiar a um desfibrilador, que te da um choque\n"
				+ "e te revive aonde você morreu, porém, ele precisa de cargas,\n"
				+ "tome cuidado e não morra com frequência, pois se as cargas acabarem,\n"
				+ "você nunca mais irá renascer, nem aqui e nem no seu mundo.\n");
		System.out.println(mentor + ": Antes de você começar sua jornada,\n"
				+ "vou lhe apresentar um grande amigo que será muito importante na sua viajem.\n");

		// Chamando o Mercador para mostrar como ele funciona e introduzindo as moedas
		// do jogo.

		System.out.println("Deseja conhece-lo?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println("Mercador: Olá viajante, irei te ajudar em sua jornada.\n"
					+ "Eu vendo diversos itens que serão essenciais para a sua subrevivência.\n"
					+ "Vou te ajudar lhe dando 100 JavaCoins como cortesia da casa.\n");
			javaCoins += 100;
			Mercador(javaCoins);
		} else {
			System.out.println(mentor
					+ ": Eu ia te apresentar o Mercador, mas já que você não quis conhece-lo, fica para uma próxima vez.\n");
		}

		System.out.println(mentor
				+ ": Todas as vezes que você estiver prestes a enfrentar um Coronel, o Mercador estará lá te esperando,\n"
				+ "para caso você tenha JavaCoins o suficiente, poderá comprar um item.\n"
				+ "Você poderá comprar apenas um tipo de item a cada encontro com ele,\n"
				+ "podendo comprar a quantidade que quiser, caso ele as tenha.\n");

		// Começando o jogo.

		System.out.println(mentor + ": " + nome_jogador + ". Você está pronto para começar a sua jornada?\n"
				+ "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1"));

		// Primeira fase - Muralha 1.

		System.out.println("*-Entrando na 1ª Muralha-*\n");
		System.out.println(mentor + ": As muralhas cibernéticas possuem um bloqueio de VPN,\n"
				+ "por conta disso, nossa comunicação será impossível.\n"
				+ "A muralha só será destruída após a queda do General que a proteje.\n"
				+ "Destrua-o para desativar a muralha, e desbloquear o VPN.\n"
				+ "Tome cuidado! A soldados em todas as muralhas. Fique vivo, ou morra tentando, adeus!\n");

		do {
			System.out.println(
					nome_jogador + ": O que devo fazer? Observo dois caminhos, a esquerda tenho pouca visibilidade,\n"
							+ "mas a direita consigo ver algo...\n" + "1- Esquerda\n" + "2- Direita\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Bau(javaCoins, vidas);
			cont++;
			do {
				System.out
						.println("A sua frente, você se depara com dois portões, que levam pra duas saídas distintas.\n"
								+ "1- Ir pelo portão Branco\n" + "2- Ir pelo portão Preto\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println(
							"Após atravessar o portão, você vê uma pessoa, aparentemente com uma idade mais avançada, sem as pernas.\n\n"
									+ nome_jogador + ": O que aconteceu com o senhor?\n\n"
									+ "Desconhecido: Eu estou morrendo... Estava correndo para tentar fugir da guerra\n"
									+ "um Trooper jogou uma granada perto de mim e eu acabei perdendo minhas pernas.\n"
									+ "Por favor, me mate, eu imploro!!!\n ");
					System.out.println("1- Matar o senhor desconhecido, e acabar com seu sofrimento.\n"
							+ "2- Deixa-lo morrer me meio a guerra.\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("De forma rápida e indolor. Sua espada penetra o coração do senhor...\n\n"
							+ "Desconhecido: Obrigado...\n");
					sanidade++;
				} else if (resposta.equals("2")) {
					System.out.println(
							nome_jogador + ": Não tenho tempo para lidar com outros problemas, além dos meus.\n");
					System.out.println("Você continua seu caminho.\n"
							+ "Ao olhar para trás, você visualiza uma nave bombardeando o local aonde estava o senhor.\n");
					sanidade--;
				}
			} else if (resposta.equals("2")) {
				do {
					System.out.println("Ao atravessar o portão, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println(
							"Chegando mais perto você percebe que é uma Empunhadura de uma arma cibernética.\n\n"
									+ nome_jogador
									+ ": Aparentemente, preciso de mais 3 peças para reconstruir essa arma.\n\n");
					System.out.println("*- Você recebeu o item: 'Empunhadura enferrujada' -*\n");
					arma[0] = "Empunhadura enferrujada";

					break;
				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			}

		} else if (resposta.equals("2")) {
			Battle();
			cont_battle++;
			do {
				System.out
						.println("A sua frente, você se depara com dois portões, que levam pra duas saídas distintas.\n"
								+ "1- Ir pelo portão Branco\n" + "2- Ir pelo portão Preto\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println("Ao atravessar o portão, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println(
							"Chegando mais perto você percebe que é uma Empunhadura de uma arma cibernética.\n\n"
									+ nome_jogador
									+ ": Aparentemente, preciso de mais 3 peças para reconstruir essa arma.\n\n"
									+ "*- Você recebeu o item: 'Empunhadura enferrujada' -*.\n");
					arma[0] = "Empunhadura enferrujada";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;
				}
			} else if (resposta.equals("2")) {
				System.out.println(
						"Após atravessar o portão, você vê uma pessoa, aparentemente com uma idade mais avançada, sem as pernas.\n\n"
								+ nome_jogador + ": O que aconteceu com o senhor?\n"
								+ "Desconhecido: Eu estou morrendo... Estava correndo para tentar fugir da guerra\n"
								+ "um Trooper jogou uma granada perto de mim e eu acabei perdendo minhas pernas.\n"
								+ "Por favor, me mate, eu imploro!!!\n\n ");
				do {
					System.out.println("1- Matar o senhor desconhecido, e acabar com seu sofrimento\n"
							+ "2- Deixa-lo morrer me meio a guerra?\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("De forma rápida e indolor. Sua espada penetra o coração do senhor...\n"
							+ "Desconhecido: Obrigado...\n");
					sanidade++;
				} else if (resposta.equals("2")) {
					System.out.println(
							nome_jogador + ": Não tenho tempo para lidar com outros problemas, além dos meus.\n");
					System.out.println("Você continua seu caminho.\n"
							+ "Ao olhar para trás, você visualiza uma nave bombardeando o local aonde estava o senhor.\n");
					sanidade--;
				}
			}

		}
		do {
			System.out.println(nome_jogador
					+ ": Sinto um poder muito forte a minha frente, deve estar vindo de um dos Coronéis que o\n"
					+ mentor + " falou anteriormente.\n\n" + nome_jogador
					+ ": O Mercador está perto do grande salão do Coronel.\n\n" + "Deseja interagir com o Mercador?\n"
					+ "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...\n");
		}
		System.out.println(
				nome_jogador + ": O primeiro Coronel está dentro daquele salão... 'O medo toma todo seu corpo'\n"
						+ "Deseja enfrentar o Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_01(vidas);
		} else if (resposta.equals("2")) {
			Morte(vidas);
		}

		System.out
				.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...\n");
		System.out.println(
				"'O uso de 'variaveis', foi usado de diversas formas no passado, na linguangem ancestral 'Python', ele era usada de uma forma mais simples, porém funcional'.\n\n"
						+ "Diferentemente da linguagem  Java, onde as variaveis precisam ser declaradas e atribuidas\r\n"
						+ "na linguagem Python não a necessidade disso.\r\n"
						+ "Outro aspecto da linguagem Python, é que durante a execução do programa, não só os valores\r\n"
						+ "atribuidos a variavel pode mudar, mas também seu tipo.\n\n" + "n=20\n" + "n+=1\n"
						+ "print(n)\n" + "n='vinte'\n" + "print('n')\n\n");
		System.out.println("Lentamente, a primeira barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso... .\n");
		System.out.println(
				mentor + ": Você consegue me ouvir!?\n" + "Você conseguiu derrotar o primeiro Coronel, parabéns!\n"
						+ "Esse foi o primeiro passo para salvar o mundo!.\n\n");
		do {
			System.out.println(mentor + "Você esta pronto para entrar na Segunda muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Siga sua jornada, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 2ª Muralha -*\n");
		}

		// Segunda Fase - Muralha 2

		do {
			System.out.println(nome_jogador + ": O que devo fazer? Observo duas grandes construções...\n"
					+ "1- Entrar na primeira construção\n" + "2- Entrar na segunda construção\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println(
					"Após entrar no prédio, você visualiza uma criança, sentada ao lado de uma escada, aparentemente com os olhos marejados.\n\n"
							+ "Criança: Com licença senhor, você poderia me ajudar?\n"
							+ "Os soldados passaram por aqui e levaram os meus pais. Não sei para onde ir\n"
							+ "Estou com muito medo, o senhor poderia ficar comigo?\n\n ");
			do {
				System.out.println("1- Levar a criança a um local seguro.\n" + "2- Ignorar o pedido da criança.\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				System.out.println(nome_jogador + ": Venha comigo, vou te levar para um lugar seguro.\n"
						+ "Criança: 'Chorando'. Muito obrigado\n\n");
				System.out.println("Você decide voltar para a primeira muralha, já que ela não aparentava mais perigo\n"
						+ "No meio do caminho você, você acabou sendo atingido por um tiro de um Trooper\n\n"
						+ "*- Você perdeu 1 vida -*\n");
				vidas--;
				sanidade++;
				if (vidas < 0) {
					Morte(vidas);
				}
			} else if (resposta.equals("2")) {
				System.out.println(nome_jogador + ": Você já tem idade para se virar sozinho\n");
				System.out.println("Você continua seu caminho. Deixando pra trás, uma vida inocente\n"
						+ "Seu coração aos poucos vai se solidificando... .\n");
				sanidade--;
			}

			do {
				System.out.println("Logo após voltar para o prédio, você vê duas alavancas.\n"
						+ "1- Puxar alavanca esquerda\n" + "2- Puxar alavanca direita\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Bau(javaCoins, vidas);
			} else if (resposta.equals("2")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Battle();
			}

		} else if (resposta.equals("2")) {

			Aleatorio_Bau_Battle();

			do {
				System.out.println(" Após andar em todo o prédio, você vê duas alavancas.\n"
						+ "1- Puxar alavanca esquerda\n" + "2- Puxar alavanca direita\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));

			if (resposta.equals("1")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Bau(javaCoins, vidas);
			} else if (resposta.equals("2")) {
				System.out.println("Ao puxar a alavanca, uma porta se abre...\n");
				Battle();
			}

		}
		do {
			System.out
					.println(nome_jogador + ": Sinto um poder muito forte a minha frente, deve ser o segundo Coronel.\n"
							+ "O Mercador está perto do grande salão do Coronel.\n"
							+ "Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println("Deseja enfrentar o Segundo Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_02(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Uma granda é jogada bem no seu pé e explode!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("O if-else da linguagem C# é bem similar a da linguagem java.\n"
				+ "Uma simples mudança é apenas na momento de 'printar' algo na tela\n\n" + "int m = 12;\r\n"
				+ "int n = 18;\r\n" + "\r\n" + "if (m > 10)\r\n" + "    if (n > 20)\r\n" + "    {\r\n"
				+ "        Console.WriteLine(\"Resultado1\");\r\n" + "    }\r\n" + "    else\r\n" + "    {\r\n"
				+ "        Console.WriteLine(\"Resultado2\");\r\n" + "    }");
		System.out.println("Lentamente, a segunda barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso novamente... .\n");
		System.out.println(mentor + ": A cada desafio que você passa, você se torna mais forte\n"
				+ "estou muito feliz em ter te invocado em nosso mundo para nos ajudar, obrigado!\n\n");
		do {
			System.out.println(
					mentor + ": Você esta pronto para entrar na Terceira muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println("Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Siga sua jornada, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 3ª Muralha -*\n");
		}

		// Terceira fase - Muralha 3

		System.out.println(
				"Ao entrar na terceira muralha, você não vê nada\n" + "além de apenas dois buracos no chão\n\n");
		do {
			System.out.println(nome_jogador + ": O que devo fazer?\n" + "1- Entrar no primeiro buraco\n"
					+ "2- Entrar no segundo buraco\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println("Ao descer pelo buraco, você chega nos dutos da terceira muralha\n" + nome_jogador
					+ ": Esse lugar cheira muito mal!\n\n");
			Aleatorio_Bau_Battle();
			do {
				System.out.println(
						"Andando nos dutos, você ve uma grade a sua frente, aparentemente com algo brilhanto depois dela.\n"
								+ "Logo a direita você ve um caminho longo...\n"
								+ "1- Ir pelo caminho longo a direita\n" + "2- Ir pelo caminho da grade\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println(
							"Andando pelo caminho longo e escuro, você escuta como se alguém estivesse correndo em sua direção\n"
									+ "Desconhecido: Sai da minha frente!!!\n" + "1- Matar o desconhecido\n"
									+ "2- Deixa-lo passar\n");

					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("O desconhecido vem em sua direção...\n"
							+ "Antes mesmo dele puxar a adaga que estava em sua cintura\n"
							+ "você ativa sua espada e o corta no meio.");
					sanidade--;
				} else if (resposta.equals("2")) {
					System.out.println("O desconhecido vem correndo em sua direção\n"
							+ "com medo, ele puxa a adaga que estava em sua cintura, o ataca e corre desesperadamente\n\n"
							+ "*- Você perdeu 1 de vida -*");
					sanidade++;
					vidas--;
					if (vidas < 0) {
						Morte(vidas);
					}
				}
			} else if (resposta.equals("2")) {
				do {
					System.out.println("Ao atravessar a grade, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println("Chegando mais perto você percebe que é o Carregador de uma arma cibernética.\n"
							+ nome_jogador + ": é a segunda parte da arma!\n"
							+ "*- Você recebeu o item: 'Carregador enferrujado' -*.\n");
					arma[1] = "Carregador enferrujado";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			}

		} else if (resposta.equals("2")) {
			System.out.println("Ao descer pelo buraco, você chega nos dutos da terceira muralha\n" + nome_jogador
					+ ": Esse lugar cheira muito mal!\n\n");
			Aleatorio_Bau_Battle();
			do {
				System.out.println(
						"Andando nos dutos, você ve uma grade a sua frente, aparentemente com algo brilhanto depois dela.\n"
								+ "Logo a direita você ve um caminho longo...\n" + "1- Ir pelo caminho da grade\n"
								+ "2- Ir pelo caminho longo a direita\n");
				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				do {
					System.out.println("Ao atravessar a grade, você visualiza um objeto brilhante no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println("Chegando mais perto você percebe que é o Carregador de uma arma cibernética.\n"
							+ nome_jogador + ": é a segunda parte da arma!\n"
							+ "*- Você recebeu o item: 'Carregador enferrujado' -*.\n");
					arma[1] = "Carregador enferrujado";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			} else if (resposta.equals("2")) {
				do {
					System.out.println(
							"Andando pelo caminho longo e escuro, você escuta como se alguém estivesse correndo em sua direção\n"
									+ "Desconhecido: Sai da minha frente!!!\n" + "1- Matar o desconhecido\n"
									+ "2- Deixa-lo passar\n");

					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				if (resposta.equals("1")) {
					System.out.println("O desconhecido vem em sua direção...\n"
							+ "Antes mesmo dele puxar a adaga que estava em sua cintura\n"
							+ "você ativa sua espada e o corta no meio.\n");
					sanidade--;
				} else if (resposta.equals("2")) {
					System.out.println("O desconhecido vem correndo em sua direção\n"
							+ "com medo, ele puxa a adaga que estava em sua cintura, o ataca e corre desesperadamente\n\n"
							+ "*- Você perdeu 1 de vida -*");
					sanidade++;
					vidas--;
					if (vidas < 0) {
						Morte(vidas);
					}
				}
			}

		}
		do {
			System.out.println(
					"Você continua andando pelos dutos, até que visualiza uma porta, e sente novamente um poder gigantesco.\n"
							+ "Provavelmente é o Terceiro Coronel\n\n"
							+ "O Mercador está perto da porta, aonde se encontra o Coronel.\n"
							+ "Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println(nome_jogador + ": O Terceiro Coronel está logo atrás daquela porta...\n");
		System.out.println("     ---   .    ____        -----      ______   -----        .\r\n"
				+ "  ___     / \\             .....................      ____   / \\\r\n"
				+ "        .'   '.  --  ..:::::''''''''''''''''':::::..      .'   '.\r\n"
				+ "  ---   | ^ ^ |    .::::''''          (_     ''''::::. -- | ^ ^ '\r\n"
				+ "        | ^ ^ |  .::''                       _)    ''::.  | ^ ^ | --\r\n"
				+ "____     '...'  .::'              .-.      (_        '::.  '...'\r\n"
				+ "        .-.!_  .::'       _)     /   \\                '::.   ! ____\r\n"
				+ "       / / `-`.:'                '-.-'            _)    ':..\"\"\".\r\n"
				+ " --    ' |  '.|:'      _)         .'.       (_          ':/' |  \\\r\n"
				+ "       | |   |'.               _/^---^\\_                  |     . --\r\n"
				+ " ___    \\ .  '|               \\-------../         (_      \\   '.'\r\n"
				+ "        ' :   '        _)      '.\\:::/.'       (_   )_    |'   || ___\r\n"
				+ "        | |  .|      _(         | | |'|                   / ' . |\r\n"
				+ "    --  | '. | \\                '.\\ /.'                   '.  | |--\r\n"
				+ "        |'.   '|                 |[ ]|           (_       | .'  |____\r\n"
				+ "__    .'\\ |  .'\\                 '.^.'                    \\ |.  .\r\n"
				+ "     .'-.\\'. | |        _)        (:)                     | ||| |\r\n"
				+ "   .'    \\'..' .             _..--'''--.._      (_       /'-._.-'| ---\r\n"
				+ "   |       `-..'.         .-'             '-.           |      .-'.\r\n"
				+ "    \\            `-.    .'  ..            .. '.        .'-._.-'    `.\r\n"
				+ "--   )              `-./    '::.        .::'   \\   _.-'             /\r\n"
				+ "     '._/-..          /       '::.    .::'      \\-'              .-'\r\n"
				+ "         ::.`-.      ''        '::   ::'        ''       _..-\\_.'\r\n"
				+ "         :::   '._   | \\         '   '         / |    .-'   .:: _____\r\n"
				+ "____     :::      `-.|  '  .----..___..----.  '  | .-'      :::\r\n"
				+ "         :::          \\ |  _..--.     .--.._  | /-'         ::: ---\r\n"
				+ "         :::   _)     | ' /     |     |     \\ ' |  (        :::\r\n"
				+ "   --    :::          )   |   _.'     '._   |   (   )_      :::____\r\n"
				+ "    ____ :::          /'. \\_.'   )\\ /(   '._/ .'\\     (_    :::\r\n"
				+ "         :::       .-'|  `-->-@ /     \\ @->--'  |-.         :::\r\n"
				+ "         :::    .-'   \\         | / \\ |         /  `-.      :::  ---\r\n"
				+ " ----    '' _.-'       |        )/   \\(        |      `-.   :::  _____\r\n"
				+ "  _.-=--..-'          . \\ /\\               /\\ /          `-. ''\r\n"
				+ " /.._    `.        .-'   .\\ '-.\\.\\\\.//./.-' /.`-.           `---.._\r\n"
				+ "|    `.    \\    .-'      | '.             .' |   `-.                \\ \r\n"
				+ " \\    _\\.   `.-'         |   '-././.\\.\\.-'   |      `.               |\r\n"
				+ "  `.-'  |   /::::::::::: \\                   /::::::::`.      ,-.    /\r\n"
				+ " - |   /   /        ----  '-.             .-'     ----  `.    |  \\_.'\r\n"
				+ "__ \\   | .'     _____        '-._._._._.-'     ____      |    |   |\r\n"
				+ "    `--'                                                 `-.  '._ / --\r\n"
				+ "                                                            `...-'\n");
		System.out
				.println("'O medo toma todo seu corpo'\n" + "Deseja enfrentar o Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_03(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Uma bomba explode tudo ao seu redor!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println(
				"'O uso do 'for', foi usado de diversas formas no passado, na linguagem ancestral C#, exigia inicialmente, a definição de uma variável\r\n"
						+ "e, em seguida, a lista que será iterada'.\r\n\n" + "var=1;\n"
						+ "for (int i =0; i <= 10; i++) { //instruções }\r\n" + "\r\n");
		System.out.println("Logo atrás do corpo do Coronel, uma escada surge, te levando para a superficie.\n\n");
		System.out.println("Lentamente, a terceira barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso... .\n");
		System.out.println(mentor + ": É incrivel o poder que cada orbe transborda no seu exterior\n"
				+ "espero que ainda haja tempo para salvar nossa capital.\n\n");
		do {
			System.out.println(mentor + "Você esta pronto para entrar na Quarta muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Continue seu caminho, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 4ª Muralha -*\n");
		}

		// Quarta Fase - Muralha 4

		do {
			System.out.println(
					"Logo após entrar na 4ª muralha, você percebe que a mesma, é cercada por luzes muito fortes\n"
							+ "que acabam te cegando bruscamente.\n" + "Você escuta um barulho à frente...\n"
							+ nome_jogador + ": Parece ser um som semelhante a de uma cachoeira\n"
							+ "1- Seguir em frente e investigar o barulho\n" + "2- Ficar parado\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Rio(fisgadas);

		} else if (resposta.equals("2")) {

			System.out.println("As luzes continuam te cegando\n" + "você fica muito tempo parado e nesse tempo,"
					+ "uma nave sobrevoou a quarta muralha, te localizou e o bombardeou\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);

		}
		System.out.println("Logo após passar pelo rio, você sente um poder muito forte vindo do alto da cachoeira.\n"
				+ "Você a escala, e logo a frente visualiza um tanque de guerra.\n"
				+ "O Mercador está um pouco antes do tanque de guerra, provavelmente é o 4º Coronel.\n");
		System.out.println("Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println("Deseja enfrentar o Quarto Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_04(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("O tanque atira em você e te joga cachoeira abaixo\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println(
				"Na linguagem python, o comando while faz com que um conjunto de instruções seja executado enquanto uma condição é atendida.\n"
						+ " Quando o resultado dessa condição passa a ser falso, a execução do loop é interrompida:\n"
						+ "contador = 0\r\n" + "while (contador < 10):\r\n" + "       print(contador)\r\n"
						+ "       contador   = contador + 1\r\n" + "");
		System.out.println("Lentamente, a quarta barreira cibernética é desativada, e a escuridão some,\n"
				+ "dando espaço para uma luz gigantesca que acende.\n"
				+ "Você escuta uma voz vindo do seu pulso novamente... .\n");
		System.out
				.println(mentor + ": Pensei que você não sairia dessa, pois estava tudo escuro na zona dessa muralha\n"
						+ "mas ainda bem que você conseguiu!\n");
		do {
			System.out
					.println(mentor + ": Você esta pronto para entrar na Quinta muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println("Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = -1;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Siga sua jornada, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 5º Muralha -*\n");
		}

		// Quinta Fase - Muralha 5

		System.out
				.println("Ao entrar na quinta muralha, você não vê nada\n" + "a escuridão é sua única companheira\n\n");
		do {
			System.out.println(
					nome_jogador + ": O que devo fazer?\n" + "1- Seguir em meio a escuridão\n" + "2- Ficar parado\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			System.out.println("Você decide seguir o caminho, sem nem ao menos enxergar algo.\n");

			if (sanidade < 0) {
				System.out.println("Você começa a ver luzes por todos os lugares\n"
						+ "pensando ser algum inimigo, você ataca o ar incansavelmente.\n"
						+ "Você acaba ficando exausto, e só depois de perceber que era apenas ilusões da sua mente, você para de atacar o nada.\n"
						+ "*- Você perdeu 1 de vida por conta do cansaço\n");
			} else {

				do {
					System.out.println("Andando no meio da escuridão,\n"
							+ "seguindo apenas sua intuição, você ve algo brilhando no chão.\n"
							+ "Deseja ir identificar o objeto?\n" + "1- Sim\n" + "2- Não\n");
					resposta = sc.nextLine();
				} while (!resposta.equals("1") && !resposta.equals("2"));
				switch (resposta) {
				case "1":
					System.out.println("Chegando mais perto você percebe que é o Carregador de uma arma cibernética.\n"
							+ nome_jogador + ": é a segunda parte da arma!\n"
							+ "*- Você recebeu o item: 'Ferrolho enferrujado' -*.\n");
					arma[2] = "Ferrolho enferrujado";
					break;

				case "2":
					System.out.println("Você simplesmente ignora o item e vai embora.\n" + nome_jogador
							+ ": O que será que era aquele item...\n");
					break;

				}
			}

		} else if (resposta.equals("2")) {
			System.out.println(
					"Você fica parado\n" + "sem nem mesmo saber de onde veio\n" + "algo corta você ao meio!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		do {
			System.out.println(
					"Você continua andando pela escuridão, até que, sente novamente um poder gigantesco a sua frente.\n"
							+ "Provavelmente é o Quinto Coronel\n"
							+ "O Mercador acende uma luz, para lhe mostrar sua localização.\n"
							+ "Deseja interagir com o Mercador?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println(nome_jogador + ": O Quinto Coronel está logo a frente, mas não consigo ve-lo... "
				+ "'O medo toma todo seu corpo'\n" + "Deseja enfrentar o Quinto Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_05(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Sem nem saber de onde vem, um tiro certeiro te acerta na cabeça\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}
		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("Tanto na linguagem java, quanto na C#, o uso do 'do while' é bem similiar.\n"
				+ "A diferença praticamente n existe\n\n" + "do\r\n" + "{\r\n" + "//instruções\r\n" + "}\r\n"
				+ "while (expressão booleana)\n");
		System.out.println("Lentamente, a quinta barreira cibernética é desativada, e a escuridão some,\n"
				+ "dando espaço para uma luz gigantesca que acende.\n"
				+ "Você escuta uma voz vindo do seu pulso novamente... .\n");
		System.out.println(mentor + ": É incrivel o poder que cada orbe transborda no seu exterior\n"
				+ "espero que ainda haja tempo para salvar nossa capital.\n\n");
		do {
			System.out.println(mentor + "Você esta pronto para entrar na Sexta muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println(mentor + ": Continue seu caminho, em breve entrarei em contato com você. Boa Sorte!\n");
			System.out.println("*- Entrando na 6ª Muralha -*\n");
		}

		// Sexta Fase - Muralha 6

		System.out.println("Logo após passar para a sexta muralha\n" + "você sente um cheiro forte de vegetação\n"
				+ "e percebe que a sexta muralha é tomada por uma vasta floresta.\n\n");
		do {
			System.out.println(nome_jogador
					+ ": O que devo fazer? Vejo um caminho com vários cipós e com pouca mobilidade\n"
					+ "e um caminho lamacento\n" + "1- Ir pelo caminho dos cipós\n" + "2- Ir pelo caminho lamacento\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Aleatorio_Bau_Battle();

			System.out.println(nome_jogador + ": acho que escolhi o caminho mais dificil...\n\n");
			do {
				System.out.println("Um pouco mais a frente dos cipós, uma criança vem correndo em sua direção.\n"
						+ "Aparentando não ter muito dinheiro, ela chega perto de você e roupa suas JavaCoins\n"
						+ "1- Correr atrás da criança\n" + "2- Deixa-la ir com seu dinheiro\n");

				resposta = sc.nextLine();
			} while (!resposta.equals("1") && !resposta.equals("2"));
			if (resposta.equals("1")) {
				System.out.println(
						"Você corre atrás da criança\n" + "ao alcança-la, ela desesperadamente começa a te bater.\n"
								+ "Você lentamente, ativa sua espada e penetra o coração da criança...\n\n"
								+ nome_jogador + ": Espero que na sua próxima reencarnação, você seja mais esperta.\n");
				sanidade -= 2;
			} else if (resposta.equals("2")) {
				System.out.println("Você decide não correr atrás da criança.\n" + nome_jogador
						+ ": Acho que ele precisava muito daquele dinheiro\n" + "não preciso mais dele.\n");
				sanidade += 2;
				javaCoins = 0;
			}
			System.out.println("Você continua o caminho, agora, cortando os cipós com sua espada.\n\n");
		} else if (resposta.equals("2")) {
			Aleatorio_Bau_Battle();

			System.out.println("Com o corpo todo sujo, você sai do rio de lama\n"
					+ "porém o terreno a sua frente começa a deslizar e você cai junto com ele dentro de um grande rio...\n\n");
			Rio_da_floresta(fisgadas);

			System.out.println("Você sobe pelo cipó e corre para bem longe do rio.\n\n");
		}

		System.out.println(
				"Continuando seu caminho, você visualiza uma caverna, e percebe que o Sexto Coronel está dentro dela.\n"
						+ "Ao lado da caverna, o Mercador te chama.\n" + "Deseja interagir com o Mercador?\n"
						+ "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Mercador(javaCoins);
		} else if (resposta.equals("2")) {
			System.out.println("O Mercador desaparece em uma velocidade que nem seus olhos puderam acompanhar...");
		}
		System.out.println(nome_jogador + ": O Sexto Coronel está dentro daquela caverna... "
				+ "Deseja enfrentar o Coronel?\n" + "1- Sim\n" + "2- Não\n");
		do {
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Coronel_06(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Uma lança voa em sua direção, perfurando seu coração!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}

		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println(
				"'A criação de funções na linguagem C#, eram bem similares as que vemos hoje na linguagem java.\r\n"
						+ "public static string Calcular(string equacao)   \r\n" + "{  \r\n"
						+ "    string resultado = string.Empty;   \r\n" + "      // realizar cálculos\r\n"
						+ "      // .......\r\n" + "    return resultado;  \r\n" + "}\n  ");
		System.out.println("Lentamente, a sexta barreira cibernética é desativada.\n"
				+ "Você escuta uma voz vindo do seu pulso... .\n");
		System.out.println(mentor + ": Você é realmente muito forte\n"
				+ "a maior Elite do exército se encontra na sétima e última muralha.\n"
				+ "Essa é a última vez que falarei com você, por isso, tenha muito cuidado\n"
				+ "dizem que o topo da pirâmide do exército é traiçoeiro.\n" + "Boa sorte... :)\n");
		do {
			System.out.println(
					mentor + "Você esta pronto para entrar Sétima e última muralha?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("2")) {
			System.out.println(": Você desiste de continuar sua jornada, e o exército toma toda a cidade.\n\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		} else if (resposta.equals("1")) {
			System.out.println("*- Entrando na 7ª Muralha -*\n");
		}

		// Sétima Fase - Muralha 7

		System.out.println("Ao entrar na última muralha,\n"
				+ "você percebe que ela possui apenas uma enorme pirâmide, com um olho no topo.\n\n");
		System.out.println("                        /\\\r\n" + "  ___                  /  \\                  ___\r\n"
				+ " /   \\     __         /    \\         __     /\r\n"
				+ "/     \\   /  \\   _   / <()> \\   _   /  \\   /\r\n"
				+ "       \\_/    \\_/ \\_/________\\_/ \\_/    \\_/\r\n"
				+ " __________________/__I___I___\\________________\r\n" + "                  /_I___I___I__\\\r\n"
				+ "                 /I___I___I___I_\\\r\n" + "                /___I___I___I___I\\\r\n"
				+ "               /__I___I___I___I___\\\r\n" + "              /_I___I___I___I___I__\\\r\n"
				+ "             /I___I___I___I___I___I_\\\r\n" + "            /___I___I___I___I___I___I\\\r\n"
				+ "           /__I___I___I___I___I___I___\\\r\n" + "          /_I___I___I___I___I___I___I__\\\n\n");
		System.out.println(nome_jogador + ": Eu nunca senti isso antes,\n" + "minhas mãos e pernas tremem,\n"
				+ "O grande Chefe de todo o exército está logo abaixo do grande olho da pirâmide.\n\n"
				+ "O mercador te chama, bem próximo da base da pirâmide, porém,\n"
				+ "ao tentar interagir com ele, um raio, vindo do alto da torre\n" + "queima o mercador.\n\n");

		do {
			System.out.println(nome_jogador + ": O Grande Elite do Exército está no topo da pirâmide... "
					+ "Deseja enfrentar o Grande Elite do Exército?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			Grande_Elite_do_Exercito_07(vidas);
		} else if (resposta.equals("2")) {
			System.out.println("Um raio te acerta, do alto da pirâmide e te explode!\n");
			vidas = -1;
			revive = 0;
			Morte(vidas);
		}

		System.out.println("Após receber a esfera, uma luz que quase o cega surge da esfera, exibindo uma mensagem...");
		System.out.println("'Pode-se construir um vetor em C# fornecendo todos seus elementos ou não, como em:\r\n"
				+ "numeros[0] = 1;\r\n" + "numeros[1] = 600;\r\n" + "numeros[2] = 257;\r\n" + "numeros[3] = 12;\r\n"
				+ "numeros[4] = 42;\n\n"
				+ "Para se iniciar por exemplo um vetor int você devera elaborar algo similar a:\n"
				+ "int vet [] = new int [3]\n");

		if (sanidade < 0) {
			System.out
					.println(nome_jogador + ": Que poder é esse incrível que estou sentindo correndo em minhas veias.\n"
							+ "Só pode ser das orbes do conhecimento.\n\n");
			System.out.println(
					"Por causa de todas as maldades que você fez até aqui, as orbes começam a corromper a sua mente...\n");
			System.out.println(nome_jogador + ": Acho que o " + mentor + " estava certo,\n"
					+ "só apenas esse conhecimento vago que este universo possui não é o bastante.\n"
					+ "Irei usar todo esse conhecimento para governar todos os outros universos, pois"
					+ "apenas eu, posso dominar o universo, para não deixar nas mãos de qualquer idiota.\n\n");
			System.out.println("Você, com uma maldade nunca antes vista, destrói toda a capital MilleniumJavcon,\n"
					+ "e vai embora, buscando dominar e destruir todos os universos possiveis...\n\n");

			System.out.println(".___________. __    __   _______     _______ .__   __.  _______  \r\n"
					+ "|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\ \r\n"
					+ "`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |\r\n"
					+ "    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |\r\n"
					+ "    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  |\r\n"
					+ "    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/");

		} else {
			System.out.println("Você começa a pensar que tudo o que você fez, foi apenas,\n"
					+ "espalhar o ódio por toda a capital.\n" + "Sem pensar duas vezes...\n\n"
					+ "*- Você destroe as 7 Orbes do conhecimento -*\n\n");
			System.out.println(nome_jogador + ": o " + mentor + " estava errado, nada disso era necessário\n"
					+ "para manter a paz nessa capital e no universo.\n"
					+ "Eu matei pessoas inocentes, matei as pessoas que defendiam a cidade, por nada...\n"
					+ "Nada vai pagar os pecados que cometi...\n\n");
			System.out.println(
					"Num último ato, com toda a tristeza acumulada em seu coração, você corta sua garganta com sua espada...\n\n"
							+ nome_jogador + ": Perdão por cometer tantos pecados,\n"
							+ "espero que um dia, eu possa finalmente me livrar do fardo que eu infelizmente, construi...\n\n");
			System.out.println(".___________. __    __   _______     _______ .__   __.  _______  \r\n"
					+ "|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\ \r\n"
					+ "`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |\r\n"
					+ "    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |\r\n"
					+ "    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  |\r\n"
					+ "    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/");
		}

	}

	// Funçao para elaborar o Mercador do jogo.

	static void Mercador(int moedas) {
		System.out.println("Hello Stranger!\n");
		System.out.println(" JavaCoins");
		System.out.printf("╔════════╗ \r\n" + "║  " + "%4d" + "  ║\r\n" + "╚════════╝\n", javaCoins);

		Random valor_aleatorio = new Random();
		int[] valor_itens = new int[4];
		int comprar;
		String opcao;
		valor_itens[0] = valor_aleatorio.nextInt(200) + 600;
		valor_itens[1] = valor_aleatorio.nextInt(300) + 100;
		valor_itens[2] = valor_aleatorio.nextInt(100) + 600;
		valor_itens[3] = valor_aleatorio.nextInt(100) + 800;

		System.out.println("╔═══════════════════════╦════════╦════════════╦════════════════════════════════╗\r\n"
				+ "║          Item         ║  Valor ║ Quantidade ║           Descrição            ║\r\n"
				+ "╠═══════════════════════╬════════╬════════════╬════════════════════════════════╣\r\n"
				+ "║ Tartare de Salmão     ║  " + valor_itens[0] + "   ║     " + tartare
				+ "      ║ Recupera 3 de vida             ║\r\n"
				+ "╠═══════════════════════╬════════╬════════════╬════════════════════════════════╣\r\n"
				+ "║ Água Celestial        ║  " + valor_itens[1] + "   ║     " + agua
				+ "      ║ Recupera 1 de vida             ║\r\n"
				+ "╠═══════════════════════╬════════╬════════════╬════════════════════════════════╣\r\n"
				+ "║ Vara de Pescar Efêmera║  " + valor_itens[2] + "   ║     " + vara
				+ "      ║ Lhe concede 5 fisgadas         ║\r\n"
				+ "╠═══════════════════════╬════════╬════════════╬════════════════════════════════╣\r\n"
				+ "║ Elixir da Vida        ║  " + valor_itens[3] + "   ║     " + elixir
				+ "      ║ Te da direito a 1 renascimento ║\r\n"
				+ "╚═══════════════════════╩════════╩════════════╩════════════════════════════════╝\n");
		do {
			System.out.println("Deseja comprar algum item da loja?" + "\n1- Sim" + "\n2- Não");
			opcao = sc.nextLine();
		} while (!opcao.equals("1") && !opcao.equals("2"));
		if (opcao.equals("1")) {
			do {
				System.out.println("Qual item deseja comprar?\n" + "1- Tartare de Salmão\n" + "2- Água Celestial\n"
						+ "3- Vara de Pescar Efêmera\n" + "4- Elixir da Vida\n");
				opcao = sc.nextLine();
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
			if (opcao.equals("1")) {
				do {
					System.out.println("Quantos 'Tartare de Salmão' você deseja comprar?\n");
					System.out.println("         (\r\n" + "          )\r\n" + "     __..---..__\r\n"
							+ " ,-='  /  |  \\  `=-.\r\n" + ":--..___________..--;\r\n" + " \\.,_____________,./\n");
					comprar = sc.nextInt();
					if (comprar > tartare) {
						System.out.println("O vendedor não tem a quantidade que você quer desse item.\n");
					} else if (comprar <= tartare && comprar * valor_itens[0] > javaCoins) {
						System.out.println(
								"Você não possui JavaCoins suficientes para comprar essa quantidade de itens.\n");
					} else if (comprar <= tartare && comprar * valor_itens[0] <= javaCoins) {
						for (int i = 0; i < comprar; i++) {
							vidas += 3;
							tartare--;
							javaCoins -= valor_itens[0];
						}
						System.out.println("*- Você ganhou " + comprar * 3 + " vidas -*\n");
					}
				} while (comprar <= 0);
			} else if (opcao.equals("2")) {
				do {
					System.out.println("Quantas 'Água Celestial' você deseja comprar?\n");
					System.out.println(" ____________\r\n" + "<____________>\r\n" + "|            |\r\n"
							+ "|            |\r\n" + "|            |\r\n" + " \\          /\r\n" + "  \\________/\r\n"
							+ "      ||\r\n" + "      ||\r\n" + "      ||\r\n" + "      ||\r\n" + "   ___||___\r\n"
							+ "  /   ||   \\\r\n" + "  \\________/\n");
					comprar = sc.nextInt();
					if (comprar > tartare) {
						System.out.println("O vendedor não tem a quantidade que você quer desse item.\n");
					} else if (comprar <= tartare && comprar * valor_itens[1] > javaCoins) {
						System.out.println(
								"Você não possui JavaCoins suficientes para comprar essa quantidade de itens.\n");
					} else if (comprar <= tartare && comprar * valor_itens[1] <= javaCoins) {
						for (int i = 0; i < comprar; i++) {
							vidas++;
							agua--;
							javaCoins -= valor_itens[1];
						}
						System.out.println("*- Você ganhou " + comprar + " vidas -*\n");
					}
				} while (comprar <= 0);

			} else if (opcao.equals("3")) {
				do {
					System.out.println("Quantas 'Vara de Pescar Efêmera' você deseja comprar?\n");
					System.out.println("\r\n" + "                          ,......,        |  \r\n"
							+ "                          | FF@  |        |\r\n"
							+ "                         ,'======',       |\r\n"
							+ "                        /----------\\      |\r\n"
							+ "                        :;:(_/\\_):;:      |\r\n"
							+ "                        `:;\\/\"\"\\/;:'      |\r\n"
							+ "                           \\\\\\///         |\r\n"
							+ "                    .--,____,''.____.--,  |\r\n"
							+ "                    :  | __ \\  / __ |  ;  |\r\n"
							+ "                    |  ||__| || |__||  | ,LL\r\n"
							+ "                    |  :_____||_____:  |/._;\r\n"
							+ "                    \\  ;_____||_____;   ./||Q\r\n"
							+ "                     \\.. ||||[]||||  \\./\r\n"
							+ "                        [|   ||   |]\r\n" + "                        [:   __   :]\r\n"
							+ "                         |   ||   |\r\n"
							+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n"
							+ "      ,_(\\_(\\\\\\___       |   ||   |     ___///)__/)_.\r\n"
							+ "   (\\/,:;:;:;:(( o`\\     \\___/\\___/   /'o )):;:;:;:;.\\/)\r\n"
							+ "   (/\\.______,,\\\\__(     .| |  | |.  (___//.._______./\\)\r\n"
							+ "      (/    (/          (__))  ((__)       \\)     \\)\r\n" + "          \r\n" + "\n");
					comprar = sc.nextInt();
					if (comprar > tartare) {
						System.out.println("O vendedor não tem a quantidade que você quer desse item.\n");
					} else if (comprar <= tartare && comprar * valor_itens[2] > javaCoins) {
						System.out.println(
								"Você não possui JavaCoins suficientes para comprar essa quantidade de itens.\n");
					} else if (comprar <= tartare && comprar * valor_itens[2] <= javaCoins) {
						for (int i = 0; i < comprar; i++) {
							fisgadas += 5;
							vara--;
							javaCoins -= valor_itens[2];
						}
						System.out.println("*- Você comprou " + comprar + " 'Vara de Pescar Efêmera' -*\n");
					}
				} while (comprar <= 0);

			} else if (opcao.equals("4")) {
				do {
					System.out.println("Quantos 'Elixir da Vida' você deseja comprar?\n");
					System.out.println("*      *    .   *    .\r\n" + "     ..  *    o\r\n" + "   o   *  .    *\r\n"
							+ "     ________\r\n" + "    (________)\r\n" + "    |    o   |\r\n" + "    | o    o |\r\n"
							+ "    |   o    |\r\n" + "    | o    o |\r\n" + "    | o  o   |\r\n" + "    |      o |\r\n"
							+ "    ( o      )\r\n" + "     \\   o  /\r\n" + "      \\    /\r\n" + "       \\  /\r\n"
							+ "        ||\r\n" + "        ||\r\n" + "        ||\r\n" + "        ||\r\n"
							+ "        ||\r\n" + "     ___||___\r\n" + "    /   ||   \\\r\n" + "    \\________/\n");
					comprar = sc.nextInt();
					if (comprar > tartare) {
						System.out.println("O vendedor não tem a quantidade que você quer desse item.\n");
					} else if (comprar <= tartare && comprar * valor_itens[3] > javaCoins) {
						System.out.println(
								"Você não possui JavaCoins suficientes para comprar essa quantidade de itens.\n");
					} else if (comprar <= tartare && comprar * valor_itens[3] <= javaCoins) {
						for (int i = 0; i < comprar; i++) {
							revive++;
							elixir--;
							javaCoins -= valor_itens[3];
						}
						System.out.println("*- Você ganhou " + comprar + " renascimento -*\n");
					}
				} while (comprar <= 0);

			}

		} else {

		}

	}

	// Função de bau para ganhar vidas, perder ou ganhar moedas.

	static void Bau(int Javacoins, int Vidas) {
		ArrayList<String> sorte = new ArrayList<String>();
		sorte.add("*- Red Chest -*\n");
		sorte.add("*- Golden Chest -*\n");
		sorte.add("*- Green Chest -*\n");

		System.out.println("   		    ____...------------...____\r\n"
				+ "               _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._\r\n"
				+ "             .'     / /                    \\ \\     '.\r\n"
				+ "             |=====/o/======================\\o\\=====|\r\n"
				+ "             |____/_/________..____..________\\_\\____|\r\n"
				+ "             /   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\\r\n"
				+ "             \\_________\\####/_________/####/________/\r\n"
				+ "              |===\\!/========================\\!/===|\r\n"
				+ "              |   |=|          .---.         |=|   |\r\n"
				+ "              |===|o|=========/     \\========|o|===|\r\n"
				+ "              |   | |         \\() ()/        | |   |\r\n"
				+ "              |===|o|======{'-.) A (.-'}=====|o|===|\r\n"
				+ "              | __/ \\__     '-.\\uuu/.-'    __/ \\__ |\r\n"
				+ "              |=== .'.'^'.'.====|==== .'.'^'.'.=== |\r\n"
				+ "              |  _\\o/   __  {.' __  '.} _   _\\o/  _|\r\n"
				+ "              `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`\n");
		do {
			System.out.println("Você encontrou um baú, deseja abri-lo?\n" + "1- Sim\n" + "2- Não");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("1")) {
			Collections.shuffle(sorte);
			System.out.println(sorte.get(0));

			if (sorte.get(0) == ("*- Red Chest -*\n")) {
				System.out.println("Sua armadura foi infectada por um vírus\n\n" + "*- Você perdeu 1 vida -*\n");
				vidas--;
				if (vidas == -1) {
					Morte(vidas);
				}

			} else if (sorte.get(0) == ("*- Golden Chest -*\n")) {
				Random_moedas(javaCoins);
			} else if (sorte.get(0) == ("*- Green Chest -*\n")) {
				Random_vidas(vidas);
			} else if (cont_battle >= 3) {
				System.out.println("*- Grey Chest -*\n");
				System.out.println("*- Você recebeu o item: 'Bala Celestial' -*.\n");
				System.out.println(
						nome_jogador + ": Sera que faz parte da composição da arma que eu achei nas muralhas...\n");
				arma[3] = "Bala Celestial";
				cont_battle = 0;
			}

		} else {

		}

	}

	// Função elaborada para batalhas contra NPC de cada muralha.

	static void Battle() {

		ArrayList<String> NPC_Battle = new ArrayList<String>();
		NPC_Battle.add("");
		NPC_Battle.add(" ");
		NPC_Battle.add("  ");
		NPC_Battle.add("   ");
		NPC_Battle.add("    ");
		NPC_Battle.add("     ");
		NPC_Battle.add("      ");
		NPC_Battle.add("       ");
		NPC_Battle.add("        ");
		NPC_Battle.add("         ");

		System.out.println("Um Trooper aparece para tentar te matar!\n");
		System.out.println("            _____\r\n" + "           X_____\\\r\n" + "   .-^-.  ||_| |_||  .-^-.\r\n"
				+ "  /_\\_/_\\_|  |_|  |_/_\\_/_\\\r\n" + "  ||(_)| __\\_____/__ |(_)||\r\n"
				+ "  \\/| | |::|\\```/|::| | |\\/\r\n" + "  /`---_|::|-+-+-|::|_---'\\\r\n"
				+ " / /  \\ |::|-|-|-|::| /  \\ \\\r\n" + "/_/   /|`--'-+-+-`--'|\\   \\_\\\r\n"
				+ "| \\  / |===/_\\ /_\\===| \\  / |\r\n" + "|  \\/  /---/-/-\\-\\  o\\  \\/  |\r\n"
				+ "| ||| | O / /   \\ \\   | ||| |\r\n" + "| ||| ||-------------|o|||| |\r\n"
				+ "| ||| ||----\\ | /----|o|||| |\r\n" + "| _|| ||-----|||-----|o|||_ |\r\n"
				+ "\\/|\\/  |     |||     |o|\\/|\\/\r\n" + "\\_o/   |----|||||----|-' \\o_/\r\n"
				+ "       |##  |   |  ##|\r\n" + "       |----|   |----|\r\n" + "       ||__ |   | __||\r\n"
				+ "      [|'  `|] [|'  `|]\r\n" + "      [|`--'|] [|`--'|]\r\n" + "      /|__| |\\ /| |__|\\\r\n"
				+ "      ||  | || || |  ||\r\n" + "      ||__|_|| ||_|__||\r\n" + "      ||    || ||    ||\r\n"
				+ "      \\|----|/ \\|----|/    --            \r\n" + "      /______\\ /______\\\r\n"
				+ "      |__||__| |__||__|\n");
		System.out.println("##### NPC BATTLE #####\n");

		Collections.shuffle(NPC_Battle);
		System.out.println(NPC_Battle.get(0));

		if (NPC_Battle.get(0) == ("")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Quais são os Operadores Aritméticos conhecidos nas linguagens de programação?\n\n"
						+ "1- (+ - / )\n" + "2- (+ - * )\n" + "3- (+ - * / % )\n" + "4- (+ - )\n");
				resposta = sc.nextLine();
				if (resposta.equals("3")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("4") || resposta.equals("1")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("3") && vidas >= 0);

		} else if (NPC_Battle.get(0) == (" ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Como é feito o 'print' com quebra de linha na linguagem Java?\n\n" + "1- print\n"
						+ "2- System.out.println\n" + "3- Console.WriteLine\n" + "4- System.out.print\n");
				resposta = sc.nextLine();
				if (resposta.equals("2")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("1") || resposta.equals("4") || resposta.equals("3")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("2") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("  ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Como devo declarar uma variável de números inteiros?\n\n" + "1- double 'variável'\n"
						+ "2- float 'variável'\n" + "3- String 'variável'\n" + "4- int 'variável'\n");
				resposta = sc.nextLine();
				if (resposta.equals("4")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("3") || resposta.equals("1")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("4") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("   ")) {

			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println(
						"Quais são os operados lógicos na presentes na linguagem Java?\n\n" + "1- ( !, ||, && )\n"
								+ "2- ( !, || )\n" + "3- ( !, ||, &&, / )\n" + "4- ( !, ||, &&, %% )\n");
				resposta = sc.nextLine();
				if (resposta.equals("1")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("4") || resposta.equals("3")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("1") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("    ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Quais são os operados relacionais presentes na linguagem Java?\n\n"
						+ "1- ( ==, !=, >, < )\n" + "2- ( ==, !=, >, <, >=, <= )\n" + "3- ( =, !=, >, <, >=, <= )\n"
						+ "4- ( ==, !=, >, <, >=, <=, <> )\n");
				resposta = sc.nextLine();
				if (resposta.equals("2")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("3") || resposta.equals("4") || resposta.equals("1")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("2") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("     ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Qual 'import' inseri todas as bibliotecas java?\n\n" + "1- import java.util.*;\n"
						+ "2- import java.util.all*;\n" + "3- import java.library;\n" + "4- import.locale;\n");
				resposta = sc.nextLine();
				if (resposta.equals("1")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("4") || resposta.equals("3")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("1") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("      ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Qual alternativa a criação do 'Scanner' está correta?\n\n"
						+ "1- Scanner 'nome do scanner' = new Scanner;\n"
						+ "2- Scanner 'nome do scanner' = new Scanner (System.in)\n"
						+ "3- Scanner 'nome do scanner' = new Scanner (System.in);\n" + "4- Scanner = new Scanner;\n");
				resposta = sc.nextLine();
				if (resposta.equals("3")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("4") || resposta.equals("1")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("3") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("       ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Quais são os especificadores de formato no 'printf?\n\n"
						+ "1- ( %d, %f, %2f, %b )\n" + "2- ( %f, %2f, %b, %c )\n" + "3- ( %d, %f, %2f, %b, %c, %m )\n"
						+ "4- ( %d, %f, %2f, %b, %c )\n");
				resposta = sc.nextLine();
				if (resposta.equals("4")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("3") || resposta.equals("1")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("4") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("       ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("O caractere de escape pode ser considerado um caracter especial,\n\n"
						+ "permitindo inserir uma nova linha dentro dos métodos print e println do objeto System.out.\n"
						+ "Qual das alternativas compõe todos esses caracteres?\n" + "1- ( \\t, \\r, \\\\, \\\" )\n"
						+ "2- ( \\n, \\t, \\\\, \\\" )\n" + "3- ( \\n, \\t, \\r,\\\" )\n"
						+ "4- ( \\n, \\t, \\r, \\\\, \\\" )\n");
				resposta = sc.nextLine();
				if (resposta.equals("4")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("3") || resposta.equals("1")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("4") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("        ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Como faço um 'sorteio' de determinado conteúdo de uma 'Array'?\n\n"
						+ "1- Collections.shuffle('nome da array');\n" + "2- Collections.random('shuffle');\n"
						+ "3- Random.shuffle('nome da array');\n" + "4- Collections.shuffle(NPC_Battle)\n");
				resposta = sc.nextLine();
				if (resposta.equals("1")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("2") || resposta.equals("3") || resposta.equals("4")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("1") && vidas >= 0);

		} else if (NPC_Battle.get(0) == ("         ")) {
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				System.out.println("Quais são os tipos de variáveis primitas na linguangem java?\n\n"
						+ "1- ( byte, short, char, int, float, long e double )\n"
						+ "2- ( boolean, byte, short, char, int, float, long e double )\n"
						+ "3- ( boolean, char, int, float e double )\n" + "4- ( boolean, int, e double )\n");
				resposta = sc.nextLine();
				if (resposta.equals("2")) {
					System.out.println("Resposta correta!\n");
					Random_moedas(javaCoins);

				} else if (resposta.equals("1") || resposta.equals("3") || resposta.equals("4")) {
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
			} while (!resposta.equals("2") && vidas >= 0);

		}

	}

	// Função para Randomizar Bau ou Battle

	static void Aleatorio_Bau_Battle() {

		int aleatorio = random.nextInt(5);

		if (cont == 2) {
			Battle();
			cont = 0;
		}else if (aleatorio % 2 == 0) {
			Battle();
			cont_battle++;
		} else {
			Bau(javaCoins, vidas);
			cont++;
		}
	}
	// Função destinada a fazer um Random de moedas.

	static void Random_moedas(int JavaCoins) {

		int novas_moedas = 0;
		novas_moedas += random.nextInt(50) + 60;
		System.out.println("*- Você ganhou " + novas_moedas + " moedas -* \n");
		javaCoins += novas_moedas;

	}

	// Função destinada a fazer um Random de vidas.

	static void Random_vidas(int Vidas) {

		int novas_vidas = 0;
		novas_vidas += random.nextInt(2) + 1;
		System.out.println("*- Você ganhou " + novas_vidas + " vidas-*\n");
		vidas += novas_vidas;

	}

	// Função elaborada para o primeiro Rio artificial

	static void Rio(int Vara) throws InterruptedException {

		ArrayList<String> Rio_easy = new ArrayList<String>();
		Rio_easy.add("Parafuso");
		Rio_easy.add("Prego");
		Rio_easy.add("Braço de um Trooper");
		Rio_easy.add("うなぎ Robótica");
		Rio_easy.add("Pano de chão");
		Rio_easy.add("Baicu Selvagem");
		Rio_easy.add("Garoupa Javariana");
		Rio_easy.add("Salmão Robótico");
		Rio_easy.add("Dourado do Sul");
		Rio_easy.add("Garoupa de cauda azul");
		int pescar = 0;

		System.out.println("Ao seguir o som, que se parecia com o de uma cachoeira, você se depara com um grande lago\n"
				+ "que, ao mesmo tempo que parecia estar limpo, parecia estar sujo.\n");

		System.out.println("                  _.._\r\n" + "   _________....-~    ~-.______\r\n"
				+ "~~~                            ~~~~-----...___________..--------\r\n"
				+ "                                           |   |     |\r\n"
				+ "                                           | |   |  ||\r\n"
				+ "                                           |  |  |   |\r\n"
				+ "                                           |'. .' .`.|\r\n"
				+ "___________________________________________|0oOO0oO0o|____________\r\n"
				+ " -          -         -       -      -    / '  '. ` ` \\    -    -\r\n"
				+ "      --                  --       --   /    '  . `   ` \\    --\r\n"
				+ "---            ---          ---       /  '                \\ ---\r\n"
				+ "     ----               ----        /       ' ' .    ` `    \\  ----\r\n"
				+ "-----         -----         ----- /   '   '        `      `   \\\r\n"
				+ "                     ------     /          '    . `     `    `  \\\r\n"
				+ "            -------           /  '    '      '      `\r\n"
				+ "                    --------/     '     '   '\n");
		do {
			System.out.println(nome_jogador + ": acho que poderia parar um pouco para tentar pescar algo...\n"
					+ "1- Pescar\n" + "2- Continuar o caminho em busca da 4ª Orbe");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("1") && fisgadas > 0) {
			do {
				System.out.println("   Vara");
				System.out.println("╔═══════╗\r\n" + "║   " + fisgadas + "   ║\r\n" + "╚═══════╝\n");
				System.out.println("Quantas vezes você quer lançar a vara no rio, para tentar pegar algo?\n");
				pescar = sc.nextInt();
			} while (pescar > fisgadas);

			for (int i = 0; i < pescar; i++) {
				System.out.println("\r\n" + "           '\\\r\n" + "          '  \\    O\r\n"
						+ "        '     \\@  |\r\n" + "      '        `\\/|\r\n" + "    '           __|    *    *\r\n"
						+ "  '           //| |  (/   )/\r\n" + "'~-~-~-~-~-~\"\"\"\"\"\"\"\"\"\"*\"\"\"\"\"\"*\"\"\r\n"
						+ "~-~-~-~\"\"ejm97\"\"\"\"\"\"\")/\"\"\"\"\"(/\"\n");
				Thread.sleep(1000);
				System.out.print("Pescando.");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.println(".\n");
				Thread.sleep(1000);
				System.out.println("'Bóia afunda...'\n");
				Thread.sleep(1000);
				System.out.println("           '\\\r\n" + "           ' \\   {)\r\n" + "           A  \\@  |\r\n"
						+ "           ^   `\\/|\r\n" + "                __|    *    *\r\n"
						+ "              //| |   (/   )/\r\n"
						+ "-~-~-~-~-~-~\"\"\"\"\"\"\"\"\"*\"\"\"\"\"\"*\"\"\"\"\r\n"
						+ "~-~-~-~\"\"ejm97\"\"\"\"\")/\"\"\"\"\"(/\"\"\r\n" + "\r\n" + "\n");
				Thread.sleep(1000);
				fisgadas--;
				Collections.shuffle(Rio_easy);
				if (Rio_easy.get(0) == "Salmão Robótico" || Rio_easy.get(0) == "Garoupa Javariana"
						|| Rio_easy.get(0) == "Dourado do Sul" || Rio_easy.get(0) == "Garoupa de cauda azul") {
					System.out.println("Você fisgou um(a) " + Rio_easy.get(0) + " ");
					System.out.println("*- Você ganhou 1 vida -*\n");
					vidas++;
				} else if (Rio_easy.get(0) == "うなぎ Robótica" || Rio_easy.get(0) == "Baicu Selvagem") {
					System.out.println("Você fisgou um(a) " + Rio_easy.get(0) + " ");
					System.out.println("O peixe te atacou, logo após ser fisgado\n" + "*- Você perdeu 1 de vida -*\n");
					vidas--;
					if (vidas < 0) {
						Morte(vidas);
					}
				} else {
					System.out.println("Você fisgou um(a) " + Rio_easy.get(0) + " ");
					System.out.println(" ");
				}
			}
			System.out.println(
					"Você se sente um pouco cansado após a pescaria,\n" + "mas sabe que não ficar parado o dia todo.\n"
							+ "Você continua seu caminho em busca da 4ª Orbe.\n");

		} else if (resposta.equals("1") && fisgadas <= 0) {
			System.out.println("Você não possui uma vara para pescar no rio\n");

		} else {
			System.out.println("Você continua seu caminho em busca da 4ª Orbe.\n");

		}

	}

	// Função elaborada para o grande rio da floresta da muralha 6

	static void Rio_da_floresta(int Vara) throws InterruptedException {

		ArrayList<String> Rio_hard = new ArrayList<String>();
		Rio_hard.add("Parafuso");
		Rio_hard.add("Papel");
		Rio_hard.add("Prego");
		Rio_hard.add("Monte de lama");
		Rio_hard.add("Cipó");
		Rio_hard.add("Chip danificado");
		Rio_hard.add("Cabeça de tigre robótico");
		Rio_hard.add("Pano coberto de lama");
		Rio_hard.add("Metal velho");
		Rio_hard.add("Pele de javali em decomposição");
		Rio_hard.add("Peixe tigre celestial");

		int pescar = 0;

		System.out.println("Logo após cair no rio, você visualiza, bem ao fundo dele\n"
				+ "um grande e amedrontador vulto.\n" + "Você nada o mais rápido possível para a superfície.\n");

		System.out.println("\r\n" + "            ~        ~          ~            ~        ~\r\n"
				+ " ~                                  _.,-'=_.-'-._  ~        ~\r\n"
				+ "         ~     ~           ~   ._.-'             '-._   ~\r\n"
				+ "                      _.-':_.-'                      '-._   ~     ~\r\n"
				+ "                  _.-'                                   '-._.'-._\r\n"
				+ "   ~       .-'.-,'                                                '-.\r\n"
				+ "           '-._                       /\\   /\\                    _.-'\r\n"
				+ " ~             '-.           (o)(o)  /  \\ /  \\                ._'\r\n"
				+ "           ~      '-._         (/      /\\ (           _.'-._,-'\r\n"
				+ "                      '-._            /  \\ )      _.-'   (o o)\r\n"
				+ " ~     ) ( ) (    ~     .-'               (     .'       ))~((  ~\r\n"
				+ "      ) \" ( \" (        .-'                 )    '-._.,.            ~\r\n"
				+ "     )  \"  (\"  (       '-._               /           '-._  ~ \r\n"
				+ "    )   \"   (   ( ___      '-._          (                '.   ~\r\n"
				+ "        \"   \"    |   | ~      .'          )                '-._\r\n"
				+ "  ---._-|--|--|--|--/     _.-'           /  (o)(o)           _.'   ~\r\n"
				+ "       \\ o  o  o  o/     '-._           /    (  )           '-._-'-.\r\n"
				+ "   ~~~~~~~~~~~~~~~~~         '-._      (                        _.-'\r\n"
				+ "  ~          ~             ~     '-.    ) /\\            _.-\"._,'\r\n"
				+ "                  ~              _.'   / /\\ /\\         '.  ~    (o o)\r\n"
				+ "    (o o)              _.-'-._.-'     / /  \\  \\          '-._._ ))~((\r\n"
				+ "    ))~(( ~        _.-'              /                         '-. ~\r\n"
				+ "                .-'              .-'('-._                        '-.\r\n"
				+ " ~            _.'         _.-'-.-'~   ~  '.             _.'-.-'._  .'\r\n"
				+ "     .-'=_.'-'         .-'  ~   ~   _ _.-'          _.-'     ~   '.'\r\n"
				+ "  _.-'                 '-._,.-'._.-'    (o)(o)     '_   ~       ~\r\n"
				+ ".'                                         \\)         '-._   ~    ~\r\n"
				+ "'-.- = .-'.     (o)(o)                                    '=._\r\n"
				+ "          '._    (  )                                         '-.\r\n"
				+ "LGB     ~    :_                                            _.-'.-' ~\r\n"
				+ "     ~     ~   \"._,-'.-'._    .-`-._;'-._.='._          .-'  ~\r\n"
				+ "                    ~     '-_.\"      ~    ~   '-._:'=~_.'       ~\r\n"
				+ "           ~     ~      ~        ~     ~        ~          ~    ~\n");
		do {
			System.out.println(nome_jogador + ": O que era aquilo!?\n"
					+ "eu poderia tentar pescar aqui e descobrir o que era aquele vulto.\n\n" + "1- Pescar\n"
					+ "2- Subir pelo cipó, e continuar em busca da  6ª Orbe");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));

		if (resposta.equals("1") && fisgadas > 0) {
			do {
				System.out.println(" Vara");
				System.out.println("╔═══════╗\r\n" + "║   " + fisgadas + "   ║\r\n" + "╚═══════╝\n");
				System.out.println("Quantas vezes você quer lançar a vara no rio, para tentar pegar algo?\n");
				pescar = sc.nextInt();
			} while (pescar > fisgadas);

			for (int i = 0; i < pescar; i++) {
				System.out.println("\r\n" + "           '\\\r\n" + "          '  \\    O\r\n"
						+ "        '     \\@  |\r\n" + "      '        `\\/|\r\n" + "    '           __|    *    *\r\n"
						+ "  '           //| |  (/   )/\r\n" + "'~-~-~-~-~-~\"\"\"\"\"\"\"\"\"\"*\"\"\"\"\"\"*\"\"\r\n"
						+ "~-~-~-~\"\"ejm97\"\"\"\"\"\"\")/\"\"\"\"\"(/\"\n");
				Thread.sleep(1000);
				System.out.print("Pescando.");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.println(".\n");
				Thread.sleep(1000);
				System.out.println("'Bóia afunda...'\n");
				Thread.sleep(1000);
				System.out.println("           '\\\r\n" + "           ' \\   {)\r\n" + "           A  \\@  |\r\n"
						+ "           ^   `\\/|\r\n" + "                __|    *    *\r\n"
						+ "              //| |   (/   )/\r\n"
						+ "-~-~-~-~-~-~\"\"\"\"\"\"\"\"\"*\"\"\"\"\"\"*\"\"\"\"\r\n"
						+ "~-~-~-~\"\"ejm97\"\"\"\"\")/\"\"\"\"\"(/\"\"\r\n" + "\r\n" + "\n");
				Thread.sleep(1000);
				fisgadas--;
				Collections.shuffle(Rio_hard);
				if (Rio_hard.get(0) == "Peixe tigre celestial") {
					System.out.println("Você fisgou um(a) " + Rio_hard.get(0) + " ");
					System.out.println("*- Você ganhou 3 vidas e 2 Renascimentos -*\n");
					vidas += 3;
					revive += 2;
				} else {
					System.out.println("Você fisgou um(a) " + Rio_hard.get(0) + " ");
					System.out.println(" ");
				}
			}
			System.out.println(
					"Você se sente um pouco cansado após a pescaria,\n" + "mas sabe que não ficar parado o dia todo.\n"
							+ "Você continua seu caminho em busca da 6ª Orbe.\n");

		} else if (resposta.equals("1") && fisgadas <= 0) {
			System.out.println("Você não possui uma vara para pescar no rio\n");

		} else {
			System.out.println("Você continua seu caminho em busca da 6ª Orbe.\n");

		}

	}

	// Função elaborada para quando o jogador morrer.

	static void Morte(int Vidas) {

		System.out.println("Você morreu!\n");

		if (morte == 1) {
			System.out.println("                                           .\"\"--.._\r\n"
					+ "                                           []      `'--.._\r\n"
					+ "                                           ||__           `'-,\r\n"
					+ "                                         `)||_ ```'--..       \\\r\n"
					+ "                     _                    /|//}        ``--._  |\r\n"
					+ "                  .'` `'.                /////}              `\\/\r\n"
					+ "                 /  .\"\"\".\\              //{///\r\n"
					+ "                /  /_  _`\\\\            // `||\r\n"
					+ "                | |(_)(_)||          _//   ||\r\n"
					+ "                | |  /\\  )|        _///\\   ||\r\n"
					+ "                | |L====J |       / |/ |   ||\r\n"
					+ "               /  /'-..-' /    .'`  \\  |   ||\r\n"
					+ "              /   |  :: | |_.-`      |  \\  ||\r\n"
					+ "             /|   `\\-::.| |          \\   | ||\r\n"
					+ "           /` `|   /    | |          |   / ||\r\n"
					+ "         |`    \\   |    / /          \\  |  ||\r\n"
					+ "        |       `\\_|    |/      ,.__. \\ |  ||\r\n"
					+ "        /                     /`    `\\ ||  ||\r\n"
					+ "       |           .         /        \\||  ||\r\n"
					+ "       |                     |         |/  ||\r\n"
					+ "       /         /           |         (   ||\r\n"
					+ "      /          .           /          )  ||\r\n"
					+ "     |            \\          |             ||\r\n"
					+ "    /             |          /             ||\r\n"
					+ "   |\\            /          |              ||\r\n"
					+ "   \\ `-._       |           /              ||\r\n"
					+ "    \\ ,//`\\    /`           |              ||\r\n"
					+ "     ///\\  \\  |             \\              ||\r\n"
					+ "    |||| ) |__/             |              ||\r\n"
					+ "    |||| `.(                |              ||\r\n"
					+ "    `\\\\` /`                 /              ||\r\n"
					+ "       /`                   /              ||\r\n"
					+ "      /                     |              ||\r\n"
					+ "     |                      \\              ||\r\n"
					+ "    /                        |             ||\r\n"
					+ "  /`                          \\            ||\r\n"
					+ "/`                            |            ||\r\n"
					+ "`-.___,-.      .-.        ___,'            ||\r\n" + "         `---'`   `'----'`\n");

			System.out.println("Olá, meu nome é Morte.\n" + "Pelo que estou vendo essa é sua primeira vez aqui\n"
					+ "todas as vezes que você morrer, um item 'revive' seu poderá ser gasto para te ressucitar\n"
					+ "caso você não tenha 'revive' disponiveis, você não poderá mais reviver e será fim de jogo. Cuidado!\n"
					+ "Até a próxima... :)\n\n");
			morte--;
		}
		if (revive <= 0) {
			System.out.println("GAME OVER!\n");
			System.out.println("      ~~~~~~~~~\r\n" + "    /           \\\r\n" + "   /             \\\r\n"
					+ "  | )           ( |\r\n" + "   \\  /C\\   /C\\  /\r\n" + "   /  ~~~   ~~~  \\\r\n"
					+ "   \\___  .^,  ___/\r\n" + "    `| _______ |'\r\n" + " _   | HHHHHHH |   _\r\n"
					+ "( )  \\         /  ( )\r\n" + "_) \\  ~~~~^~~~~ ,/ (_)\r\n" + " ~\\ \"\\         /  /~\r\n"
					+ "    \\  \\     /  /\r\n" + "      \\  \\v/  /\r\n" + "       >     <\r\n"
					+ "      /  /^\\  \\\r\n" + "    /  /     \\  \\\r\n" + "_~/ \"/         \\  \\~_\r\n"
					+ " ) /             \\ ( )\r\n" + "(_)               (_)");
			System.exit(0);
		}
		do {
			System.out.println("Deseja deseja ressucitar?\n" + "1- Sim\n" + "2- Não\n");
			resposta = sc.nextLine();
		} while (!resposta.equals("1") && !resposta.equals("2"));
		if (resposta.equals("1")) {
			revive--;
			vidas++;
			javaCoins = 0;
			System.out.println("Você recebeu 1 vida, porém perdeu todas as suas JavaCoins.\n");

		} else {
			System.out.println("GAME OVER!\n");
			System.out.println("      ~~~~~~~~~\r\n" + "    /           \\\r\n" + "   /             \\\r\n"
					+ "  | )           ( |\r\n" + "   \\  /C\\   /C\\  /\r\n" + "   /  ~~~   ~~~  \\\r\n"
					+ "   \\___  .^,  ___/\r\n" + "    `| _______ |'\r\n" + " _   | HHHHHHH |   _\r\n"
					+ "( )  \\         /  ( )\r\n" + "_) \\  ~~~~^~~~~ ,/ (_)\r\n" + " ~\\ \"\\         /  /~\r\n"
					+ "    \\  \\     /  /\r\n" + "      \\  \\v/  /\r\n" + "       >     <\r\n"
					+ "      /  /^\\  \\\r\n" + "    /  /     \\  \\\r\n" + "_~/ \"/         \\  \\~_\r\n"
					+ " ) /             \\ ( )\r\n" + "(_)               (_)");
			System.exit(0);
		}

	}

	// Função para o Primeiro Desafio

	static void Coronel_01(int Vidas) {
		System.out.println("Ao entrar no salão, o Coronel te recebe com um sorriso sarcástico no rosto.\n");
		System.out.println("     .      .\r\n" + "     |\\____/|\r\n" + "    (\\|----|/)\r\n" + "     \\ 0  0 /\r\n"
				+ "      |    |\r\n" + "   ___/\\../\\____\r\n" + "  /     --       \\\r\n"
				+ " /  \\         /   \\\r\n" + "|    \\___/___/(   |\r\n" + "\\   /|  }{   | \\  )\r\n"
				+ " \\  ||__}{__|  |  |\r\n" + "  \\  |;;;;;;;\\  \\ / \\_______\r\n"
				+ "   \\ /;;;;;;;;| [,,[|======'\r\n" + "     |;;;;;;/ |     /\r\n" + "     ||;;|\\   |\r\n"
				+ "     ||;;/|   /\r\n" + "     \\_|:||__|\r\n" + "      \\ ;||  /\r\n" + "      |= || =|\r\n"
				+ "      |= /\\ =|\r\n" + "      /_/  \\_\\\n");

		System.out.println("Primeiro Coronel: Quem é você, verme insolente!?\n");
		System.out.printf("%s: Meu nome é %s. Estou aqui para tomar posse da esfera que você possui.\n\n", nome_jogador,
				nome_jogador);

		System.out.println(
				"Primeiro Coronel: Hahahahaha. Você acha que tem forças o suficiente para derrotar eu, o LordVaryl,\n"
						+ "e tomar posse da minha esfera?\n" + "Me mostre do que é capaz, forasteiro!\n\n");

		System.out.println("########## BOSS BATTLE ##########");
		System.out.println("\n");

		ArrayList<String> pergunta_01 = new ArrayList<String>();
		pergunta_01.add("name = Bruno;");
		pergunta_01.add("name = 'Bruno';");
		pergunta_01.add("name = \"Bruno\";");
		pergunta_01.add("Bruno = name;");

		boolean answer = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║  " + "%2d" + "   ║" + "          ║  "
					+ "%2d" + "   ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_01);

			System.out.println("Como uma variavel nomeada como: 'name' e tipo 'String' atribui um nome?\n ");
			System.out.println("1- " + pergunta_01.get(0));
			System.out.println("2- " + pergunta_01.get(1));
			System.out.println("3- " + pergunta_01.get(2));
			System.out.println("4- " + pergunta_01.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_01.get(0) == ("name = \"Bruno\";")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {

					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_01.get(1) == ("name = \"Bruno\";")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_01.get(2) == ("name = \"Bruno\";")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_01.get(3) == ("name = \"Bruno\";")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer = false;
				break;
			}
		} while (!answer && vidas >= 0);

		ArrayList<String> pergunta_02 = new ArrayList<String>();
		pergunta_02.add("n++;");
		pergunta_02.add("n+=1;");
		pergunta_02.add("n=1;");
		pergunta_02.add("Todas as alternativas estão certas");

		boolean answer_02 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_02);

			System.out.println(
					"Uma variavel tipo 'int' com nome e valor atribuido: 'n=0'. Como posso atribuir o valor '1' nessa variavel ?\n ");
			System.out.println("1- " + pergunta_02.get(0));
			System.out.println("2- " + pergunta_02.get(1));
			System.out.println("3- " + pergunta_02.get(2));
			System.out.println("4- " + pergunta_02.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_02.get(0) == ("Todas as alternativas estão certas")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {

					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_02.get(1) == ("Todas as alternativas estão certas")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_02.get(2) == ("Todas as alternativas estão certas")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_02.get(3) == ("Todas as alternativas estão certas")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_02 = false;
				break;
			}
		} while (!answer_02 && vidas >= 0);

		ArrayList<String> pergunta_03 = new ArrayList<String>();
		pergunta_03.add("String myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString);\n");
		pergunta_03.add("int myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString);\n");
		pergunta_03.add("String myString = \"1234\";\r\n" + "int n = Integer.parseStr(myString);\n");
		pergunta_03.add("String myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString)\n");

		boolean answer_03 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

			Collections.shuffle(pergunta_03);

			System.out.println("Como posso convertor uma váriavel tipo 'String' em uma tipo 'int'?\n ");
			System.out.println("1- " + pergunta_03.get(0));
			System.out.println("2- " + pergunta_03.get(1));
			System.out.println("3- " + pergunta_03.get(2));
			System.out.println("4- " + pergunta_03.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_03
						.get(0) == ("String myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString);\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {

					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_03
						.get(1) == ("String myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString);\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_03
						.get(2) == ("String myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString);\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_03
						.get(3) == ("String myString = \"1234\";\r\n" + "int n = Integer.parseInt(myString);\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_03 = false;
				break;
			}
		} while (!answer_03 && vidas >= 0);
		System.out.println("Desferindo seu terceiro e último golpe, você finalmente derrota o coronel.\n");
		System.out.println("*- Você ganhou 200 JavaCoins -*");
		javaCoins += 200;
		System.out.println("*- Você ganhou a 1ª Orbe: 'Variavel' -*\n");

	}

	// Função para o Segundo Desafio

	static void Coronel_02(int Vidas) {
		System.out.println("Ao entrar pela porta o Coronel te recebe com um ataque,\n" + "porém, você desvia.\n");
		System.out.println("         ,     .\r\n" + "        /(     )\\               A\r\n"
				+ "   .--.( `.___.' ).--.         /_\\\r\n" + "   `._ `%_&%#%$_ ' _.'     /| <___> |\\\r\n"
				+ "      `|(@\\*%%/@)|'       / (  |L|  ) \\\r\n" + "       |  |%%#|  |       J d8bo|=|od8b L\r\n"
				+ "        \\ \\$#%/ /        | 8888|=|8888 |\r\n" + "        |\\|%%#|/|        J Y8P\"|=|\"Y8P F\r\n"
				+ "        | (.\".)%|         \\ (  |L|  ) /\r\n" + "    ___.'  `-'  `.___      \\|  |L|  |/\r\n"
				+ "  .'#*#`-       -'$#*`.       / )|\r\n" + " /#%^#%*_ *%^%_  #  %$%\\    .J (__)\r\n"
				+ " #&  . %%%#% ###%*.   *%\\.-'&# (__)\r\n" + " %*  J %.%#_|_#$.\\J* \\ %'#%*^  (__)\r\n"
				+ " *#% J %$%%#|#$#$ J\\%   *   .--|(_)\r\n" + " |%  J\\ `%%#|#%%' / `.   _.'   |L|\r\n"
				+ " |#$%||` %%%$### '|   `-'      |L|\r\n" + " (#%%||` #$#$%%% '|            |L|\r\n"
				+ " | ##||  $%%.%$%  |            |L|\r\n" + " |$%^||   $%#$%   |  VK/cf     |L|\r\n"
				+ " |&^ ||  #%#$%#%  |            |L|\r\n" + " |#$*|| #$%$$#%%$ |\\           |L|\r\n"
				+ " ||||||  %%(@)$#  |\\\\          |L|\r\n" + " `|||||  #$$|%#%  | L|         |L|\r\n"
				+ "      |  #$%|$%%  | ||l        |L|\r\n" + "      |  ##$H$%%  | |\\\\        |L|\r\n"
				+ "      |  #%%H%##  | |\\\\|       |L|\r\n" + "      |  ##% $%#  | Y|||       |L|\r\n"
				+ "      J $$#* *%#% L  |E/\r\n" + "      (__ $F J$ __)  F/\r\n" + "      J#%$ | |%%#%L\r\n"
				+ "      |$$%#& & %%#|\r\n" + "      J##$ J % %%$F\r\n" + "       %$# * * %#&\r\n"
				+ "       %#$ | |%#$%\r\n" + "       *#$%| | #$*\r\n" + "      /$#' ) ( `%%\\\r\n"
				+ "     /#$# /   \\ %$%\\\r\n" + "    ooooO'     `Ooooo\n");

		System.out.println("Segundo Coronel: Você derrotou o primeiro Coronel!? Não acredito");
		System.out.printf("%s: Eu preciso da sua orbe, não posso deixar você com todo esse poder.\n\n", nome_jogador);

		System.out.println("Segundo Coronel: Acha mesmo que pode me derrotar!?\n" + "MORRA!!!\n\n");

		System.out.println("########## BOSS BATTLE ##########");
		System.out.println("\n");

		ArrayList<String> pergunta_01 = new ArrayList<String>();
		pergunta_01.add("Estruturas de Repetição");
		pergunta_01.add("Váriaveis");
		pergunta_01.add("Estruturas Condicionais");
		pergunta_01.add("Nenhuma das alternativas");

		boolean answer = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_01);

			System.out.println("Como é classificado os termos 'if','else if' e 'else?\n ");
			System.out.println("1- " + pergunta_01.get(0));
			System.out.println("2- " + pergunta_01.get(1));
			System.out.println("3- " + pergunta_01.get(2));
			System.out.println("4- " + pergunta_01.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_01.get(0) == ("Estruturas Condicionais")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {

					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_01.get(1) == ("Estruturas Condicionais")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_01.get(2) == ("Estruturas Condicionais")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_01.get(3) == ("Estruturas Condicionais")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer = false;
				break;
			}
		} while (!answer && vidas >= 0);

		ArrayList<String> pergunta_02 = new ArrayList<String>();
		pergunta_02.add("if(n=1){\n" + "n++\n" + "}");
		pergunta_02.add("if(n!=1){\n" + "n--\n" + "}");
		pergunta_02.add("if(n==1){\n" + "n++\n" + "}");
		pergunta_02.add("if(n==1){\n" + "n--\n" + "}");

		boolean answer_02 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_02);

			System.out.println("Qual das alternativas abaixo está errada?\n ");
			System.out.println("1- " + pergunta_02.get(0));
			System.out.println("2- " + pergunta_02.get(1));
			System.out.println("3- " + pergunta_02.get(2));
			System.out.println("4- " + pergunta_02.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_02.get(0) == ("if(n=1){\n" + "n++\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {

					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_02.get(1) == ("if(n=1){\n" + "n++\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_02.get(2) == ("if(n=1){\n" + "n++\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_02.get(3) == ("if(n=1){\n" + "n++\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_02 = false;
				break;
			}
		} while (!answer_02 && vidas >= 0);

		ArrayList<String> pergunta_03 = new ArrayList<String>();
		pergunta_03.add("if(a%2==0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n" + "}else{\r\n"
				+ "System.out.println(\"Sequencia A e Impar\");\r\n" + "}");
		pergunta_03.add("if(a/2==0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n" + "}else{\r\n"
				+ "System.out.println(\"Sequencia A e Impar\");\r\n" + "}");
		pergunta_03.add("if(a%2!=0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n" + "}else{\r\n"
				+ "System.out.println(\"Sequencia A e Impar\");\r\n" + "}");
		pergunta_03.add("if(a/2!=0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n" + "}else{\r\n"
				+ "System.out.println(\"Sequencia A e Impar\");\r\n" + "}");

		boolean answer_03 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

			Collections.shuffle(pergunta_03);

			System.out.println(
					"Em um determinado programa que te pedisse para digitar um número inteiro e mostrasse se ele seria par ou ímpar. Como você usaria o laço 'if'?\n ");
			System.out.println("1- " + pergunta_03.get(0));
			System.out.println("2- " + pergunta_03.get(1));
			System.out.println("3- " + pergunta_03.get(2));
			System.out.println("4- " + pergunta_03.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_03.get(0) == ("if(a%2==0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n"
						+ "}else{\r\n" + "System.out.println(\"Sequencia A e Impar\");\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {

					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_03.get(1) == ("if(a%2==0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n"
						+ "}else{\r\n" + "System.out.println(\"Sequencia A e Impar\");\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_03.get(2) == ("if(a%2==0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n"
						+ "}else{\r\n" + "System.out.println(\"Sequencia A e Impar\");\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_03.get(3) == ("if(a%2==0){\r\n" + "System.out.println(\"Sequencia A e Par\");\r\n"
						+ "}else{\r\n" + "System.out.println(\"Sequencia A e Impar\");\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_03 = false;
				break;
			}
		} while (!answer_03 && vidas >= 0);
		System.out.println("Desferindo seu terceiro e último golpe, você finalmente derrota o coronel.\n");
		System.out.println("*- Você ganhou 200 JavaCoins -*");
		javaCoins += 200;
		System.out.println("*- Você ganhou a 2ª Orbe: 'If' -*\n");

	}

	// Função para o Terceiro Desafio

	static void Coronel_03(int Vidas) {
		System.out.println("Você entra pela porta, e percebe que a sala é toda cercada por bombas.\n");

		System.out.println("                              _.--\"\"-._\r\n"
				+ "  .                         .\"         \".\r\n"
				+ " / \\    ,^.         /(     Y             |      )\\\r\n"
				+ "/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )\r\n"
				+ "|        :|    `>   '.     l_..-------.._l      .'\r\n"
				+ "|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"\r\n"
				+ " \\  .-' | |  `              l._       _.'\r\n" + "  \\/    | |                   l`^^'^^'j\r\n"
				+ "        | |                _   \\_____/     _\r\n"
				+ "        j |               l `--__)-'(__.--' |\r\n"
				+ "        | |               | /`---``-----'\"1 |  ,-----.\r\n"
				+ "        | |               )/  `--' '---'   \\'-'  ___  `-.\r\n"
				+ "        | |              //  `-'  '`----'  /  ,-'   I`.  \\\r\n"
				+ "      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\\r\n"
				+ "     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :\r\n"
				+ "      `._;/7(-.......'  /        ) (     |  |            | |\r\n"
				+ "      `._;l _'--------_/        )-'/     :  |___.    _._./ ;\r\n"
				+ "        | |                 .__ )-'\\  __  \\  \\  I   1   / /\r\n"
				+ "        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /\r\n"
				+ "                           \\__  `-'    __/  `-. `---'',-'\r\n"
				+ "                              )-._.-- (        `-----'\r\n"
				+ "                             )(  l\\ o ('..-.\r\n"
				+ "                       _..--' _'-' '--'.-. |\r\n"
				+ "                __,,-'' _,,-''            \\ \\\r\n"
				+ "               f'. _,,-'                   \\ \\\r\n"
				+ "              ()--  |                       \\ \\\r\n"
				+ "                \\.  |                       /  \\\r\n"
				+ "                  \\ \\                      |._  |\r\n"
				+ "                   \\ \\                     |  ()|\r\n"
				+ "                    \\ \\                     \\  /\r\n"
				+ "                     ) `-.                   | |\r\n"
				+ "                    // .__)                  | |\r\n"
				+ "                 _.//7'                      | |\r\n"
				+ "               '---'                         j_| `\r\n"
				+ "                                            (| |\r\n"
				+ "                                             |  \\\r\n"
				+ "                                             |lllj\r\n"
				+ "                                             |||||\n ");

		System.out.println("Terceiro Coronel: Olá ser insignificante, qual seu nome?");
		System.out.printf(
				"%s: Meu nome é %s. Você deve ser o Terceiro Coronel, preciso da orbe que você possui\n"
						+ "não posso deixar ela em suas mãos, pois sei q o exército precisa dela.\n\n",
				nome_jogador, nome_jogador);

		System.out.println("Terceiro Coronel: Você não irá conseguir tocar em mim, a cada passo que você der\n"
				+ "uma bomba irá explodir!\n\n");
		System.out.println(nome_jogador + ": Veremos!\n\n");

		System.out.println("########## BOSS BATTLE ##########");
		System.out.println("\n");

		ArrayList<String> pergunta_01 = new ArrayList<String>();
		pergunta_01.add("for(int i=0; i<n; i++)");
		pergunta_01.add("for(int i; i<n; i++)");
		pergunta_01.add("for(i=0; i<n; i++)");
		pergunta_01.add("for(int i=0; i<>n; i++)");

		boolean answer = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_01);

			System.out.println("Qual dos for abaixo esta correto?\n ");
			System.out.println("1- " + pergunta_01.get(0));
			System.out.println("2- " + pergunta_01.get(1));
			System.out.println("3- " + pergunta_01.get(2));
			System.out.println("4- " + pergunta_01.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_01.get(0) == ("for(int i=0; i<n; i++)")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {

					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_01.get(1) == ("for(int i=0; i<n; i++)")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_01.get(2) == ("for(int i=0; i<n; i++)")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_01.get(3) == ("for(int i=0; i<n; i++)")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer = false;
				break;
			}
		} while (!answer && vidas >= 0);

		ArrayList<String> pergunta_02 = new ArrayList<String>();
		pergunta_02.add("for (int i=0; i<5; i++) {\r\n" + "   int produto = i * 4;\r\n"
				+ "   System.out.println(produto);	\r\n" + "}");
		pergunta_02.add("for (int i=0; i<4; i++) {\r\n" + "   int produto = i * 4;\r\n"
				+ "   System.out.println(produto);	\r\n" + "}");
		pergunta_02.add("for (int i=1; i<4; i++) {\r\n" + "   int produto = i * 4;\r\n"
				+ "   System.out.println(produto);	\r\n" + "}");
		pergunta_02.add("for (i=0; i<5; i++) {\r\n" + "   int produto = i * 4;\r\n"
				+ "   System.out.println(produto);	\r\n" + "}");

		boolean answer_02 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_02);

			System.out.println(
					"Qual o 'for' correto para se fazer a multiplicação dos números: 0, 1, 2, 3 e 4 por uma variavel 'n=4'?\n ");
			System.out.println("1- " + pergunta_02.get(0));
			System.out.println("2- " + pergunta_02.get(1));
			System.out.println("3- " + pergunta_02.get(2));
			System.out.println("4- " + pergunta_02.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_02.get(0) == ("for (int i=0; i<5; i++) {\r\n" + "   int produto = i * 4;\r\n"
						+ "   System.out.println(produto);	\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {

					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_02.get(1) == ("for (int i=0; i<5; i++) {\r\n" + "   int produto = i * 4;\r\n"
						+ "   System.out.println(produto);	\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_02.get(2) == ("for (int i=0; i<5; i++) {\r\n" + "   int produto = i * 4;\r\n"
						+ "   System.out.println(produto);	\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_02.get(3) == ("for (int i=0; i<5; i++) {\r\n" + "   int produto = i * 4;\r\n"
						+ "   System.out.println(produto);	\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_02 = false;
				break;
			}
		} while (!answer_02 && vidas >= 0);

		ArrayList<String> pergunta_03 = new ArrayList<String>();
		pergunta_03.add("Estrutura Repetitiva");
		pergunta_03.add("Estrutura Condicional");
		pergunta_03.add("Estrutura de Variaveis");
		pergunta_03.add("Estrutura de Funções");

		boolean answer_03 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

			Collections.shuffle(pergunta_03);

			System.out.println("O laço 'for', é de qual tipo de estrutura?\n ");
			System.out.println("1- " + pergunta_03.get(0));
			System.out.println("2- " + pergunta_03.get(1));
			System.out.println("3- " + pergunta_03.get(2));
			System.out.println("4- " + pergunta_03.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_03.get(0) == ("Estrutura Repetitiva")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {

					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_03.get(1) == ("Estrutura Repetitiva")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_03.get(2) == ("Estrutura Repetitiva")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_03.get(3) == ("Estrutura Repetitiva")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_03 = false;
				break;
			}
		} while (!answer_03 && vidas >= 0);
		System.out.println("Desferindo seu terceiro e último golpe, você finalmente derrota o coronel.\n");
		System.out.println("*- Você ganhou 200 JavaCoins -*");
		System.out.println("*- Você ganhou 1 Renascimento -*");
		revive++;
		javaCoins += 200;
		System.out.println("*- Você ganhou a 3ª Orbe: 'For' -*\n");

	}

	// Função para o Quarto Desafio

	static void Coronel_04(int Vidas) {
		System.out.println("Antes mesmo de você chegar perto do Tanque, o mesmo atira\n"
				+ "sem você nem ao menos perceber, ele estoura seu braço esquerdo\n\n"
				+ "*- Você perdeu 1 de vida -*\n\n");
		vidas--;

		System.out.println(
				"                                                                                                  \r\n"
						+ "                                                     _..----.._                                   \r\n"
						+ "                                                    ]_.--._____[                                  \r\n"
						+ "                                                  ___|'--'__..|--._                               \r\n"
						+ "                              __               \"\"\"    ;            :                              \r\n"
						+ "                            ()_ \"\"\"\"---...__.'\"\"!\":  /    ___       :                             \r\n"
						+ "                               \"\"\"---...__\\]..__] | /    [ 0 ]      :                             \r\n"
						+ "                                          \"\"\"!--./ /      \"\"\"        :                            \r\n"
						+ "                                   __  ...._____;\"\"'.__________..--..:_                           \r\n"
						+ "                                  /  !\"''''''!''''''''''|''''/' ' ' ' \\\"--..__  __..              \r\n"
						+ "                                 /  /.--.    |          |  .'          \\' ' '.\"\"--.{'.            \r\n"
						+ "             _...__            >=7 //.-.:    |          |.'             \\ ._.__  ' '\"\"'.          \r\n"
						+ "          .-' /    \"\"\"\"----..../ \"\">==7-.....:______    |                \\| |  \"\";.;-\"> \\         \r\n"
						+ "          \"\"\"\";           __..\"   .--\"/\"\"\"\"\"----....\"\"\"\"\"----.....H_______\\_!....'----\"\"\"\"]       \r\n"
						+ "        _..---|._ __..--\"\"       _!.-=_.            \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"                   ;\"\"\"        \r\n"
						+ "       /   .-\";-.'--...___     .\" .-\"\"; ';\"\"-\"\"-...^..__...-v.^___,  ,__v.__..--^\"--\"\"-v.^v,      \r\n"
						+ "      ;   ;   |'.         \"\"\"-/ ./;  ;   ;\\P.        ;   ;        \"\"\"\"____;  ;.--\"\"\"\"// '\"\"<,     \r\n"
						+ "      ;   ;   | 1            ;  ;  '.: .'  ;<   ___.-'._.'------\"\"\"\"\"\"____'..'.--\"\"\";;'  o ';     \r\n"
						+ "      '.   \\__:/__           ;  ;--\"\"()_   ;'  /___ .-\" ____---\"\"\"\"\"\"\" __.._ __._   '>.,  ,/;     \r\n"
						+ "        \\   \\    /\"\"\"<--...__;  '_.-'/; \"\"; ;.'.'  \"-..'    \"-.      /\"/    `__. '.   \"---\";      \r\n"
						+ "         '.  'v ; ;     ;;    \\  \\ .'  \\ ; ////    _.-\" \"-._   ;    : ;   .-'__ '. ;   .^\".'      \r\n"
						+ "           '.  '; '.   .'/     '. `-.__.' /;;;   .o__.---.__o. ;    : ;   '\"\";;\"\"' ;v^\" .^        \r\n"
						+ "             '-. '-.___.'<__v.^,v'.  '-.-' ;|:   '    :      ` ;v^v^'.'.    .;'.__/_..-'          \r\n"
						+ "                '-...__.___...---\"\"'-.   '-'.;\\     'WW\\     .'_____..>.\"^\"-\"\"\"\"\"\"\"\"              \r\n"
						+ "                                      '--..__ '\"._..'  '\"-;;\"\"\"                                   \r\n"
						+ "                                             \"\"\"---'\"\"\"\"\"\"                                      \n");

		if (vidas == -1) {
			Morte(vidas);
		}

		System.out
				.println("Quarto Coronel: Hahahaha, seu inútil, você achou que eu deixaria você chegar perto de mim\n");
		System.out.println("Você não suporta a dor, e seu braço sangra sem parar\n");
		System.out.printf("%s: Degraçado, eu juro que irei te derrotar!!!\n", nome_jogador, nome_jogador);

		System.out.println("Quarto Coronel: Vamos ver! VENHA E LUTE POR SUA VIDA!\n\n");

		System.out.println("########## BOSS BATTLE ##########");
		System.out.println("\n");

		ArrayList<String> pergunta_01 = new ArrayList<String>();
		pergunta_01.add("int i = 0;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n" + "  i++;\r\n" + "}");
		pergunta_01.add("int i = 0;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n" + "  i--;\r\n" + "}");
		pergunta_01.add("int i = 5;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n" + "  i++;\r\n" + "}");
		pergunta_01.add("int i = 5;\r\n" + "while (i < 0) {\r\n" + "  System.out.println(i);\r\n" + "  i++;\r\n" + "}");

		boolean answer = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_01);

			System.out.println("Qual dos 'while' abaixo está correto?\n ");
			System.out.println("1- " + pergunta_01.get(0));
			System.out.println("2- " + pergunta_01.get(1));
			System.out.println("3- " + pergunta_01.get(2));
			System.out.println("4- " + pergunta_01.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_01.get(0) == ("int i = 0;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n"
						+ "  i++;\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {

					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_01.get(1) == ("int i = 0;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n"
						+ "  i++;\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_01.get(2) == ("int i = 0;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n"
						+ "  i++;\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_01.get(3) == ("int i = 0;\r\n" + "while (i < 5) {\r\n" + "  System.out.println(i);\r\n"
						+ "  i++;\r\n" + "}")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer = false;
				break;
			}
		} while (!answer && vidas >= 0);

		ArrayList<String> pergunta_02 = new ArrayList<String>();
		pergunta_02.add("Sim");
		pergunta_02.add("Não. While é uma váriavel");
		pergunta_02.add("Não. While faz parte das estruturas de repetição");
		pergunta_02.add("Todas as alternativas estão erradas");

		boolean answer_02 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_02);

			System.out.println("'O laço while faz parte das estruturas condicionais. Está correta essa afirmação?\n ");
			System.out.println("1- " + pergunta_02.get(0));
			System.out.println("2- " + pergunta_02.get(1));
			System.out.println("3- " + pergunta_02.get(2));
			System.out.println("4- " + pergunta_02.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_02.get(0) == ("Não. While faz parte das estruturas de repetição")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {

					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_02.get(1) == ("Não. While faz parte das estruturas de repetição")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_02.get(2) == ("Não. While faz parte das estruturas de repetição")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_02.get(3) == ("Não. While faz parte das estruturas de repetição")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_02 = false;
				break;
			}
		} while (!answer_02 && vidas >= 0);

		ArrayList<String> pergunta_03 = new ArrayList<String>();
		pergunta_03.add("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n" + "    tabuada= i * 3;\r\n"
				+ "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n");
		pergunta_03.add("int i=1;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n" + "    tabuada= i * 3;\r\n"
				+ "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n");
		pergunta_03.add("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<10){\r\n" + "    tabuada= i * 3;\r\n"
				+ "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n");
		pergunta_03.add("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n" + "    tabuada= i * 4;\r\n"
				+ "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n");

		boolean answer_03 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

			Collections.shuffle(pergunta_03);

			System.out.println(
					"Usando o laço 'while', como ficaria um programa para calcular a tabuada do numero 3. De 0 até 10?\n ");
			System.out.println("1- " + pergunta_03.get(0));
			System.out.println("2- " + pergunta_03.get(1));
			System.out.println("3- " + pergunta_03.get(2));
			System.out.println("4- " + pergunta_03.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_03.get(0) == ("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n"
						+ "    tabuada= i * 3;\r\n" + "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {

					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_03.get(1) == ("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n"
						+ "    tabuada= i * 3;\r\n" + "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_03.get(2) == ("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n"
						+ "    tabuada= i * 3;\r\n" + "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_03.get(3) == ("int i=0;\r\n" + "int tabuada=0;\r\n" + "\r\n" + "while (i<11){\r\n"
						+ "    tabuada= i * 3;\r\n" + "System.out.println(tabuada);\r\n" + "i++;\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_03 = false;
				break;
			}
		} while (!answer_03 && vidas >= 0);
		System.out.println("Desferindo seu terceiro e último golpe, você finalmente derrota o coronel.\n");
		System.out.println("*- Você ganhou 300 JavaCoins -*");
		javaCoins += 300;
		System.out.println("*- Você ganhou a 4ª Orbe: 'While' -*\n");

	}

	// Função para o Quinto Desafio

	static void Coronel_05(int Vidas) {
		System.out.println(
				"Lentamente você vai indo em direção do Quinto Coronel\n" + "sem nem ao menos saber onde ele está.\n");

		System.out.println("     _______                       \r\n" + "    <   ____)                      \r\n"
				+ " /--|  |(  o|                     \r\n" + "|   >   \\___|                     \r\n"
				+ "|  /---------+                    \r\n" + "| |    \\ =========______/|\r\n"
				+ "|  \\   \\\\=========------\\|\r\n" + "|   \\   \\----+--\\-)))           \r\n"
				+ "|   |\\______|_)))/            \r\n" + " \\__==========           \r\n"
				+ "    |   |-\\   \\          \r\n"
				+ "    |   |   \\   \\        (    /   .(  . \\)). (   )(  )      .\r\n"
				+ "    |   |   /   /         ) (      )).  ((  .)  ((( (. ((. .   .\r\n"
				+ "    |   |  /   /   ()  ))   ))   .( ( ( ) ). (   )(  ) ((   ))  ..\r\n"
				+ "    |   |_<   /   ( ) ( (  ) )   (( )  )).) ((  (  | \\(  )) ((. ).\r\n"
				+ "____<_____\\\\__\\__(___)_))_((_(____))__(_(________(_(_)_)((_");
		System.out.println("Quinta Coronel: Estou aqui!\n"
				+ "O Coronel atira, mas com seus instintos você consegue rebater a bala com sua espada.\n");
		System.out.printf("%s: Onde você está!, apareça!\n", nome_jogador, nome_jogador);

		System.out.println(
				"Quinto Coronel: Tente me achar, e a orbe irei lhe dar\n" + "fique parado e eu irei te derrotar!\n");

		System.out.println("########## BOSS BATTLE ##########");
		System.out.println("\n");

		ArrayList<String> pergunta_01 = new ArrayList<String>();
		pergunta_01.add("int i = 1;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=0 );");
		pergunta_01.add("int i = 0;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=0 );");
		pergunta_01.add("int i = 1;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=1 );");
		pergunta_01.add("int i = 1;\r\n" + "do{\r\n" + "   i--;	\r\n" + "}while(i !=1 );");

		boolean answer = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_01);

			System.out.println("Qual dos programas abaixo, usando 'do while' está em looping infinito?\n ");
			System.out.println("1- " + pergunta_01.get(0));
			System.out.println("2- " + pergunta_01.get(1));
			System.out.println("3- " + pergunta_01.get(2));
			System.out.println("4- " + pergunta_01.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_01.get(0) == ("int i = 1;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=0 );")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {

					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_01.get(1) == ("int i = 1;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=0 );")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_01.get(2) == ("int i = 1;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=0 );")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_01.get(3) == ("int i = 1;\r\n" + "do{\r\n" + "   i++;	\r\n" + "}while(i !=0 );")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer = false;
				break;
			}
		} while (!answer && vidas >= 0);

		ArrayList<String> pergunta_02 = new ArrayList<String>();
		pergunta_02.add(
				"A diferença é que com o uso do 'do while', teremos os comandos executados ao menos uma única vez.");
		pergunta_02
				.add("A diferença é que com o uso do 'while', teremos os comandos executados ao menos uma única vez.");
		pergunta_02.add("Não há diferença.");
		pergunta_02.add("Nenhuma das alternativas está correta");

		boolean answer_02 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_02);

			System.out.println("Qual a diferença do 'do while' para o 'while'?\n ");
			System.out.println("1- " + pergunta_02.get(0));
			System.out.println("2- " + pergunta_02.get(1));
			System.out.println("3- " + pergunta_02.get(2));
			System.out.println("4- " + pergunta_02.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_02.get(
						0) == ("A diferença é que com o uso do 'do while', teremos os comandos executados ao menos uma única vez.")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {

					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_02.get(
						1) == ("A diferença é que com o uso do 'do while', teremos os comandos executados ao menos uma única vez.")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_02.get(
						2) == ("A diferença é que com o uso do 'do while', teremos os comandos executados ao menos uma única vez.")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_02.get(
						3) == ("A diferença é que com o uso do 'do while', teremos os comandos executados ao menos uma única vez.")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_02 = false;
				break;
			}
		} while (!answer_02 && vidas >= 0);

		ArrayList<String> pergunta_03 = new ArrayList<String>();
		pergunta_03.add("If");
		pergunta_03.add("While");
		pergunta_03.add("Do while");
		pergunta_03.add("ForEach");

		boolean answer_03 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

			Collections.shuffle(pergunta_03);

			System.out.println("Qual das alternativas abaixo não é um laço de repetição?\n ");
			System.out.println("1- " + pergunta_03.get(0));
			System.out.println("2- " + pergunta_03.get(1));
			System.out.println("3- " + pergunta_03.get(2));
			System.out.println("4- " + pergunta_03.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_03.get(0) == ("If")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {

					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_03.get(1) == ("If")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_03.get(2) == ("If")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_03.get(3) == ("If")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 1 vida -*\n");
					vidas--;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_03 = false;
				break;
			}
		} while (!answer_03 && vidas >= 0);
		System.out.println("Desferindo seu terceiro e último golpe, você finalmente derrota o coronel.\n");
		System.out.println("*- Você ganhou 200 JavaCoins -*");
		javaCoins += 200;
		System.out.println("*- Você ganhou a 5ª Orbe: 'Do While' -*\n");

	}

	// Função para o Sexto Desafio

	static void Coronel_06(int Vidas) {
		System.out.println("Você entra na caverna e o visualiza o Sexto Coronel sentado em um trono de pedra\n"
				+ "aparentemente imóvel.\n");

		System.out.println("                   {}\r\n" + "                    {{}}\r\n" + "                    {{}}\r\n"
				+ "                     {}\r\n" + "                   .-''-.\r\n" + "                  /  __  \\\r\n"
				+ "                 /.-'  '-.\\\r\n" + "                 \\::.  .::/\r\n"
				+ "                  \\'    '/\r\n" + "             __ ___)    (___ __\r\n"
				+ "           .'   \\\\        //   `.\r\n" + "          /     | '-.__.-' |     \\\r\n"
				+ "          |     |  '::::'  |     |\r\n" + "          |    /    '::'    \\    |\r\n"
				+ "          |_.-;\\     __     /;-._|\r\n" + "          \\.'^`\\\\    \\/    //`^'./\r\n"
				+ "          /   _.-._ _||_ _.-._   \\ \r\n" + "         `\\___\\    '-..-'    /___/`\r\n"
				+ "              /'---.  `\\.---'\\\r\n" + "             ||    |`\\\\\\|    ||\r\n"
				+ "             ||    | || |    ||\r\n" + "             |;.__.' || '.__.;|\r\n"
				+ "             |       ||       |\r\n" + "             {{{{{{{{||}}}}}}}}\r\n"
				+ "              |      ||      |\r\n" + "              |.-==-.||.-==-.|\r\n"
				+ "              <.    .||.    .>\r\n" + "               \\'=='/||\\'=='/\r\n"
				+ "               |   / || \\   |\r\n" + "               |   | || |   |\r\n"
				+ "               |   | || |   |\r\n" + "               /^^\\| || |/^^\\ \r\n"
				+ "              /   .' || '.   \\\r\n" + "             /   /   ||   \\   \\\r\n"
				+ "            (__.'    \\/    '.__)\n");

		System.out.println("Sexto Coronel: Eu sabia que os outros Coronéis eram insignificantes\n"
				+ "como deixaram um lixo como você chegar até aqui.\n");
		System.out.printf("%s: 'Que poder é esse, é muito maior que os dos outros Coronéis'.\n"
				+ "Eu preciso da Orbe que você guarda no seu trono, não posso deixar vocês,\n"
				+ "o exército tomar conta de toda a capital.\n", nome_jogador);

		System.out.println("Sexto Coronel: Do que você está falando!?\n"
				+ "você deve estar louco, nós os Coronéis, defendemos cada muralha,\n"
				+ "pois diversos invasores tentam tomar posse das orbes para conseguirem todo o conhecimento do universo!\n\n");
		System.out.println(nome_jogador + ": você não vai me enganar com essa Ladainha"
				+ "eu irei te matar e proteger os civis!.\n\n"
				+ "Você pula em direção ao Coronel e começa sua luta!!!\n");

		System.out.println("########## BOSS BATTLE ##########");
		System.out.println("\n");

		ArrayList<String> pergunta_01 = new ArrayList<String>();
		pergunta_01.add("static void Nova_Funcao() { código da função }");
		pergunta_01.add("static double void Nova_Funcao() { código da função }");
		pergunta_01.add("static String [] Nova_Funcao(String nome) { código da função }");
		pergunta_01.add("static final int Nova_Funcao(int n) { código da função }");

		boolean answer = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_01);

			System.out.println("Como faço uma função que não retorna nenhum valor?\n ");
			System.out.println("1- " + pergunta_01.get(0));
			System.out.println("2- " + pergunta_01.get(1));
			System.out.println("3- " + pergunta_01.get(2));
			System.out.println("4- " + pergunta_01.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_01.get(0) == ("static void Nova_Funcao() { código da função }")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {

					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_01.get(1) == ("static void Nova_Funcao() { código da função }")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_01.get(2) == ("static void Nova_Funcao() { código da função }")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_01.get(3) == ("static void Nova_Funcao() { código da função }")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer = true;
				} else {
					answer = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer = false;
				break;
			}
		} while (!answer && vidas >= 0);

		ArrayList<String> pergunta_02 = new ArrayList<String>();
		pergunta_02.add("Não");
		pergunta_02.add("Sim");
		pergunta_02.add("Não existe função que retorna valores");
		pergunta_02.add("Não existe função que não retorna valor");

		boolean answer_02 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
			Collections.shuffle(pergunta_02);

			System.out.println("Toda função deve obrigatoriamente retornar algum valor?\n ");
			System.out.println("1- " + pergunta_02.get(0));
			System.out.println("2- " + pergunta_02.get(1));
			System.out.println("3- " + pergunta_02.get(2));
			System.out.println("4- " + pergunta_02.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_02.get(0) == ("Não")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {

					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_02.get(1) == ("Não")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_02.get(2) == ("Não")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_02.get(3) == ("Não")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_02 = true;
				} else {
					answer_02 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_02 = false;
				break;
			}
		} while (!answer_02 && vidas >= 0);

		ArrayList<String> pergunta_03 = new ArrayList<String>();
		pergunta_03.add("public static double somar( double a, double b ) {\r\n" + "return a + b;\r\n" + "}\r\n"
				+ "\r\n" + "public static void main(String args[]) {\r\n"
				+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n");
		pergunta_03.add("public static void somar( double a, double b ) {\r\n" + "return a + b;\r\n" + "}\r\n" + "\r\n"
				+ "public static void main(String args[]) {\r\n" + "System.out.println(somar(5.11, 5.122));\r\n"
				+ "}\n");
		pergunta_03.add("public static double void somar( double a, double b ) {\r\n" + "return a + b;\r\n" + "}\r\n"
				+ "\r\n" + "public static void main(String args[]) {\r\n"
				+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n");
		pergunta_03.add("public static int void somar( double a, double b ) {\r\n" + "return a + b;\r\n" + "}\r\n"
				+ "\r\n" + "public static void main(String args[]) {\r\n"
				+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n");

		boolean answer_03 = false;
		do {
			System.out.println("  Vidas" + "          Renascimentos");
			System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
					+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

			Collections.shuffle(pergunta_03);

			System.out.println("Qual das alternativas abaixo está correta?\n ");
			System.out.println("1- " + pergunta_03.get(0));
			System.out.println("2- " + pergunta_03.get(1));
			System.out.println("3- " + pergunta_03.get(2));
			System.out.println("4- " + pergunta_03.get(3));

			resposta = sc.nextLine();

			switch (resposta) {

			case "1":
				if (pergunta_03.get(0) == ("public static double somar( double a, double b ) {\r\n"
						+ "return a + b;\r\n" + "}\r\n" + "\r\n" + "public static void main(String args[]) {\r\n"
						+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {

					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "2":
				if (pergunta_03.get(1) == ("public static double somar( double a, double b ) {\r\n"
						+ "return a + b;\r\n" + "}\r\n" + "\r\n" + "public static void main(String args[]) {\r\n"
						+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			case "3":
				if (pergunta_03.get(2) == ("public static double somar( double a, double b ) {\r\n"
						+ "return a + b;\r\n" + "}\r\n" + "\r\n" + "public static void main(String args[]) {\r\n"
						+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}

				}
				break;

			case "4":
				if (pergunta_03.get(3) == ("public static double somar( double a, double b ) {\r\n"
						+ "return a + b;\r\n" + "}\r\n" + "\r\n" + "public static void main(String args[]) {\r\n"
						+ "System.out.println(somar(5.11, 5.122));\r\n" + "}\n")) {
					System.out.println("Resposta correta\n");
					System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
					answer_03 = true;
				} else {
					answer_03 = false;
					System.out.println("Resposta errada!\n");
					System.out.println("*- Você perdeu 2 vida -*\n");
					vidas -= 2;
					if (vidas == -1) {
						Morte(vidas);
					}
				}
				break;

			default:
				System.out.println("A alternativa não existe\n");
				answer_03 = false;
				break;
			}
		} while (!answer_03 && vidas >= 0);
		System.out.println("Desferindo seu terceiro e último golpe, você finalmente derrota o coronel.\n");
		System.out.println("*- Você ganhou 200 JavaCoins -*");
		javaCoins += 200;
		System.out.println("*- Você ganhou a 6ª Orbe: 'Funções' -*\n");

	}

	// Função para o Sétimo Desafio

	static void Grande_Elite_do_Exercito_07(int Vidas) {
		System.out.println("Você começa a subir a pirâmide e lembrar tudo o que passou.\n"
				+ "sem saber porque, a pirâmide para de atirar raios, e você consegue subir com facilidade\n"
				+ "chegando perto do olho no topo da pirâmide, você começa a escutar uma voz familiar...\n\n");

		System.out.println("                                        /~~__\r\n"
				+ "                                        / \\  \\~~\\\r\n"
				+ "                           -~~\\/~~~~~~~//~~\\     |\r\n"
				+ "                         /~/ / \\ |  | // /  |  | |\r\n"
				+ "                        / / /~~\\\\ |  // /  /|  | |\r\n"
				+ "                       //  |\\\\  \\\\ |// /  / |    |\r\n"
				+ "                      |  / ' \\\\  \\\\V/ /  / /| |  '\r\n"
				+ "                      ||  |                 | | ||\r\n"
				+ "                      |   '                 |   ||\r\n"
				+ "                      | || ~--__       __--~|| ||`\r\n"
				+ "                      |  ' .____`     '____.||  | |\r\n"
				+ "                      | ||  \\(')\\  ,' /(')/ '  '| |\r\n"
				+ "                      ||||   ~~~   |   ~~~ || | | |\r\n"
				+ "                      | |`         |      ' ||| | |\r\n"
				+ "                      | | |        |        | | | |\r\n"
				+ "                      ||| `       \\v/       | | ' `\r\n"
				+ "                      ` |  |               ||' |   |\r\n"
				+ "                       |`  `    ---v---    '|  |   |\r\n"
				+ "                       ``|~ |    ~~~~~    | '  '   |\r\n"
				+ "                     /~\\|`  |\\           / |  |/~\\ |\r\n"
				+ "                    |/~\\``| | `_       -'  '  '/~\\|`\r\n"
				+ "                    ||  ||| '   ~-_ _-~   /| ||  || |\r\n"
				+ "        __________. || ,||`|       ~    ~' | ||, || .L_________\r\n"
				+ "    _-~~          |~|| |||||   |       |   | '|| ||~|          ~~-_\r\n"
				+ "  ,~         ()   | ||/||||`    |     |    || ||\\|| |   ()         ~,\r\n"
				+ " /                | `` |~~'     `     '    |'~~| '' |                \\\r\n"
				+ "|          ()  () |    |  /      |   |     '\\  |    | ()  ()          |\r\n"
				+ "|                 |    | |\\______     ______/| |    |                 |\r\n"
				+ "`                /     | | ~_    `   '    _~ | |     \\                '\r\n"
				+ " |              /  []  |/\\ //~_    |    _~\\\\ /\\|  []  \\              |\r\n"
				+ " |       _-~~~~~ \\    /|  ~/ //~_  |  _~\\\\ \\~  |\\    / ~~~~~-_       |\r\n"
				+ " |      /     |  |\\  / |    ~/   ~_|_~   \\~    | \\  /|  |     \\      |\r\n"
				+ " |_____|     _~  | \\/  '      ~_   ~_  _~      `  \\/ |  ~_     |_____|\r\n"
				+ "   |        '    |    |         ~_   ~_         |    |    `        |\r\n"
				+ "   |       |     '    |       _~  ~_   ~_       |    `     |       |\r\n"
				+ "   |       '    |     ` ___ _=.  _~ ~_  .=_ ___ '     |    `       |\r\n"
				+ "   |      |     |      |  _~ O|_~ / \\ ~_|O ~_  |      |     |      |\r\n"
				+ "   |      |     |      `_~   _~  __L__  ~_   ~_'      |     |      |\r\n"
				+ "   |______|     '|      |  _~  _~,---.~_  ~_  |      |`     |______|\r\n"
				+ "    |          | `      `_~_--~_~.===.~_~--_~_'      ' |          |\r\n"
				+ "    |          |  |      \\_-~~~.;'(O)`;.~~~-_/      |  |          |\r\n"
				+ "    |          |  |        ~_  ||\"=H=\"||  _~        |  |          |\r\n"
				+ "    |          '  `          ~_|h__H__n|_~          '  `          |\r\n"
				+ "    |         |    |           ~_-----_~           |    |         |\r\n"
				+ "    |         |    |             ~_ _~             |    |         |\n ");

		System.out.printf(
				"%s: Olá %s, finalmente pudemos nos conhecer pessoalmente, você deve estár achando estranho tudo isso..., chegue mais perto\n\n",
				mentor, nome_jogador);
		System.out.println("Ao se aproximar do " + mentor + ", ele lhe desfere um golpe esmagador no seu estômago,\n"
				+ "e rouba as 6 Orbes que você conseguiu durante sua jornada...\n\n"
				+ "*- Você perdeu todas as suas vidas e renascimentos -*\n\n");
		vidas = 0;
		revive = 0;
		mentor = "DarkDeveloper";
		System.out.println(mentor
				+ ": HAHAHAHAHA, você é um idiota, eu te usei durante todo esse tempo e você não percebeu,\n"
				+ "os Coronéis foram colocadas em cada muralha para proteger as orbes dos invasores dos outros planetas,\n"
				+ "logo após a morte do meu pai, eu tomei o trono como o maior Elite do exército, e sem contar para ninguém,\n"
				+ "eu resolvi invocar alguém de outro mundo, no caso você, para enganar, e matar os outros Coronéis,\n"
				+ "para que assim, eu pudesse reunir todas as esferas e ter posse do maior conhecimento que o mundo já viu!\n\n");
		System.out.println(nome_jogador
				+ ": Porque!? Porque você precisa fazer isso, esse conhecimento está além do alcance de qualquer ser\n"
				+ "você não precisava fazer isso!\n\n");
		System.out.println(mentor + ": Para mim, não basta apenas o conhecimento desse mundo\n"
				+ "eu quero dominar todos os universos, e colocar todos aos meus pés.\n\n");
		System.out.println(
				mentor + ": Eu já cansei de jogar conversa fora,\n" + "ESSA PIRÂMIDE SERÁ O SEU TÚMULO!!!\n\n");

		if (arma[0] == "Empunhadura enferrujada" && arma[1] == "Carregador enferrujado"
				&& arma[2] == "Ferrolho enferrujado" && arma[3] == "Bala Celestial") {
			System.out.println("Algo na sua armadura começa a brilhar...\n"
					+ "Os 4 componentes da arma enferrujada que você encontrou, começam a interagir entre si, e se conectam no braço que você perdeu\n"
					+ "durante a batalha contra um dos Coronéis...\n\n");
			System.out.println(mentor + ": NÃO PODE SER!!!\n" + "é a Arma 'Automail Gunslinger'.\n"
					+ "Eu pensei que essa arma era apenas uma lenda. Dizem que ela foi elaborada pelo criador de nossa Capital"
					+ "'Edward Javcon', ela possui um poder nunca antes visto.\n\n");
			System.out.println(
					nome_jogador + ": 'Essa é minha última esperança... preciso derrota-lo com um único golpe'\n\n");
			System.out.println(mentor + ": Eu quero essa arma para mim, eu vou te destruir!!!\n\n");

			System.out.println("########## BOSS BATTLE ##########");
			System.out.println("\n");

			ArrayList<String> pergunta_01 = new ArrayList<String>();
			pergunta_01.add("int vet[] = new int [5];");
			pergunta_01.add("int vet[][] = new int[] [5];");
			pergunta_01.add("int vet[] = new int [5]");
			pergunta_01.add("vet[] = new int [5];");

			boolean answer = false;
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
				Collections.shuffle(pergunta_01);

				System.out.println("Qual dos vetores abaixo está correto?");
				System.out.println("1- " + pergunta_01.get(0));
				System.out.println("2- " + pergunta_01.get(1));
				System.out.println("3- " + pergunta_01.get(2));
				System.out.println("4- " + pergunta_01.get(3));

				resposta = sc.nextLine();

				switch (resposta) {

				case "1":
					if (pergunta_01.get(0) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você com um único tiro, estoura o Elite no meio -*\n");
						answer = true;
					} else {

						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "2":
					if (pergunta_01.get(1) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você com um único tiro, estoura o Elite no meio -*\n");
						answer = true;
					} else {
						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "3":
					if (pergunta_01.get(2) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você com um único tiro, estoura o Elite no meio -*\n");
						answer = true;
					} else {
						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}

					}
					break;

				case "4":
					if (pergunta_01.get(3) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você com um único tiro, estoura o Elite no meio -*\n");
						answer = true;
					} else {
						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				default:
					System.out.println("A alternativa não existe\n");
					answer = false;
					break;
				}
			} while (!answer && vidas >= 0);
			System.out.println("*- Você ganhou 2000 JavaCoins -*");
			javaCoins += 2000;
			System.out.println("*- Você ganhou a 7ª Orbe: 'Vetor' -*\n");
			System.out.println(mentor + ": Eu não acredito, fui destruído pelo meu próprio plano.\n"
					+ "acho que esse era meu destino, o pecado de querer possuir todo esse poder,\n"
					+ "me levou as ruínas. Tome cuidado, essas Orbes reunidas possui um poder nunca antes vistos...\n\n");
			System.out.println("Num último e leve suspiro, o Elite do exército morre...\n");

		} else {

			System.out.println("########## BOSS BATTLE ##########");
			System.out.println("\n");

			ArrayList<String> pergunta_01 = new ArrayList<String>();
			pergunta_01.add("int vet[] = new int [5];");
			pergunta_01.add("int vet[][] = new int[] [5];");
			pergunta_01.add("int vet[] = new int [5]");
			pergunta_01.add("vet[] = new int [5];");

			boolean answer = false;
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
				Collections.shuffle(pergunta_01);

				System.out.println("Qual dos vetores abaixo está correto?");
				System.out.println("1- " + pergunta_01.get(0));
				System.out.println("2- " + pergunta_01.get(1));
				System.out.println("3- " + pergunta_01.get(2));
				System.out.println("4- " + pergunta_01.get(3));

				resposta = sc.nextLine();

				switch (resposta) {

				case "1":
					if (pergunta_01.get(0) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer = true;
					} else {

						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "2":
					if (pergunta_01.get(1) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer = true;
					} else {
						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "3":
					if (pergunta_01.get(2) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer = true;
					} else {
						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}

					}
					break;

				case "4":
					if (pergunta_01.get(3) == ("int vet[] = new int [5];")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer = true;
					} else {
						answer = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				default:
					System.out.println("A alternativa não existe\n");
					answer = false;
					break;
				}
			} while (!answer && vidas >= 0);

			ArrayList<String> pergunta_02 = new ArrayList<String>();
			pergunta_02.add("Unidimensional");
			pergunta_02.add("Bidimensional");
			pergunta_02.add("Infinito");
			pergunta_02.add("Tridimensional");

			boolean answer_02 = false;
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);
				Collections.shuffle(pergunta_02);

				System.out.println("'Vetor' é um tipo de array: ?\n ");
				System.out.println("1- " + pergunta_02.get(0));
				System.out.println("2- " + pergunta_02.get(1));
				System.out.println("3- " + pergunta_02.get(2));
				System.out.println("4- " + pergunta_02.get(3));

				resposta = sc.nextLine();

				switch (resposta) {

				case "1":
					if (pergunta_02.get(0) == ("Unidimensional")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_02 = true;
					} else {

						answer_02 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "2":
					if (pergunta_02.get(1) == ("Unidimensional")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_02 = true;
					} else {
						answer_02 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "3":
					if (pergunta_02.get(2) == ("Unidimensional")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_02 = true;
					} else {
						answer_02 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}

					}
					break;

				case "4":
					if (pergunta_02.get(3) == ("Unidimensional")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_02 = true;
					} else {
						answer_02 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				default:
					System.out.println("A alternativa não existe\n");
					answer_02 = false;
					break;
				}
			} while (!answer_02 && vidas >= 0);

			ArrayList<String> pergunta_03 = new ArrayList<String>();
			pergunta_03.add("vet[0] = 2;");
			pergunta_03.add("vet[1] = 2;");
			pergunta_03.add("vet[0] = 2");
			pergunta_03.add("vet[1] = 2");

			boolean answer_03 = false;
			do {
				System.out.println("  Vidas" + "          Renascimentos");
				System.out.printf("╔═══════╗" + "          ╔═══════╗\r\n" + "║   " + "%2d" + "  ║" + "          ║   "
						+ "%2d" + "  ║\r\n" + "╚═══════╝" + "          ╚═══════╝\n\n", vidas, revive);

				Collections.shuffle(pergunta_03);

				System.out.println(
						"Um vetor denominado 'int vet[] = new int [4]'. Caso eu queira atribuir um valor, denominado '2' no primeiro slot desse vetor, como eu faria?\n");
				System.out.println("1- " + pergunta_03.get(0));
				System.out.println("2- " + pergunta_03.get(1));
				System.out.println("3- " + pergunta_03.get(2));
				System.out.println("4- " + pergunta_03.get(3));

				resposta = sc.nextLine();

				switch (resposta) {

				case "1":
					if (pergunta_03.get(0) == ("vet[0] = 2;")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_03 = true;
					} else {

						answer_03 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "2":
					if (pergunta_03.get(1) == ("vet[0] = 2;")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_03 = true;
					} else {
						answer_03 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				case "3":
					if (pergunta_03.get(2) == ("vet[0] = 2;")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_03 = true;
					} else {
						answer_03 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}

					}
					break;

				case "4":
					if (pergunta_03.get(3) == ("vet[0] = 2;")) {
						System.out.println("Resposta correta\n");
						System.out.println("*- Você ataca o boss e tira 1 de vida dele -*\n");
						answer_03 = true;
					} else {
						answer_03 = false;
						System.out.println("Resposta errada!\n");
						System.out.println("*- Você perdeu 1 vida -*\n");
						vidas--;
						if (vidas == -1) {
							Morte(vidas);
						}
					}
					break;

				default:
					System.out.println("A alternativa não existe\n");
					answer_03 = false;
					break;
				}
			} while (!answer_03 && vidas >= 0);
			System.out.println("*- Você ganhou 2000 JavaCoins -*");
			javaCoins += 2000;
			System.out.println("*- Você ganhou a 7ª Orbe: 'Vetor' -*\n");
			System.out.println(mentor + ": Eu não acredito, fui destruído pelo meu próprio plano.\n"
					+ "acho que esse era meu destino, o pecado de querer possuir todo esse poder,\n"
					+ "me levou as ruínas. Tome cuidado, essas Orbes reunidas possui um poder nunca antes vistos...\n\n");
			System.out.println("Num último e leve suspiro, o Elite do exército morre...\n");

		}
	}
}