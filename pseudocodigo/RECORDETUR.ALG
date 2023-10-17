Algoritmo "RECORDE.TUR"
// Disciplina   : LÓGICA DE PROGRAMAÇÃO
// Professor: Marcelo Vasques
// Descrição do sistema :  Sistema para agência de viagem,
//                        para cadastro de clientes e destinos
//                        e consulta desses dados
// Aluno: Giovani Feitosa

Var

   clientes: vetor [1..100,1..4] de caractere
   rotulo_cliente: vetor [1..4] de caractere
   i, j, maxcliente: inteiro

   destinos: vetor [1..100,1..4] de caractere
   rotulo_destino: vetor [1..4] de caractere
   l, c, maxdestino : inteiro

   opcao, voltar: inteiro

   cliente_ID, destino_ID: inteiro

Inicio


   rotulo_cliente[1] <- "ID cliente: "
   rotulo_cliente[2] <- "Nome: "
   rotulo_cliente[3] <- "Telefone: "
   rotulo_cliente[4] <- "E-mail: "


   rotulo_destino[1] <- "ID destino:"
   rotulo_destino[2] <- "Cidade: "
   rotulo_destino[3] <- "Estado: "
   rotulo_destino[4] <- "País: "


   enquanto verdadeiro faca


      escreval("                 --** RECORDE.TUR  **-- ")
      escreval("-** Área de cadastro e consulta de clientes e destinos **-")
      escreval()
      escreval()
      escreval(" [1] - Cadastrar cliente")
      escreval(" [2] - Cadastrar destino")
      escreval(" [3] - Consultar lista de clientes ")
      escreval(" [4] - Consultar lista de Destino")
      escreval(" [5] - Buscar cliente por ID")
      escreval(" [6] - Buscar destino por ID")
      escreval("Pressione ESC para sair")
      escreval()
      escreval("            -  Selecione a opção desejada  -")
      leia(opcao)


         escolha opcao
         
              caso 1
                   limpatela
                   escreval("           -** CADASTRAR CLIENTES **-")
                   escreval("-                                                       -")
                   escreval("-     Quantos clientes você deseja cadastrar?        -")
                   escreval("-                                                       -")
                   escreval("            ************************")
                   leia(maxcliente)
                   limpatela
                   //escreval("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
                   //escreval("-                                                       -")
                   //escreval("-              Fill in clients data below               -")
                   //escreval("-                                                       -")
                   //escreval("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
                   para i de 1 ate maxcliente faca
                        para j de 1 ate 4 faca
                             escreva(rotulo_cliente[j])
                             leia(clientes[i,j])
                        fimpara
                        escreval()
                   fimpara
                   escreval("Cliente cadastrado!")
                   escreval()
                   escreval("Pressione qualquer tecla para voltar ao menu")
                   leia(voltar)
                   limpatela

              caso 2
                   limpatela
                   escreval("           -** CADASTRAR CLIENTES **-")
                   escreval("-                                                       -")
                   escreval("-     Quantos clientes você deseja cadastrar?        -")
                   escreval("-                                                       -")
                   escreval("            ************************")
                   leia(maxdestino)
                   limpatela
                  // escreval("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
                  // escreval("-                                                       -")
                  // escreval("-            Fill in destination data below             -")
                 //  escreval("-                                                       -")
                 //  escreval("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
                   para l de 1 ate maxdestino faca
                        para c de 1 ate 4 faca
                             escreva(rotulo_destino[c])
                             leia(destinos[l,c])
                        fimpara
                   escreval()
                   fimpara
                   escreval("Destino cadastrado!")
                   escreval()
                   escreval("Pressione qualquer tecla para voltar ao menu")
                   leia(voltar)
                   limpatela

              caso 3
                   limpatela
                   escreval()
                   escreval("-             ** LISTA DE CLIENTES **             -")
                   escreval()

                   para i de 1 ate maxcliente faca
                      para j de 1 ate 4 faca
                           escreva(rotulo_cliente[j])
                           escreval(clientes[i,j])
                      fimpara
                   escreval()
                   fimpara
                   escreval("Pressione qualquer tecla para voltar ao menu")
                   leia(voltar)
                   limpatela

              caso 4
                   limpatela
                   escreval("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
                   escreval("-                                                       -")
                   escreval("-          ** LISTA DE DESTINOS **          -")
                   escreval("-                                                       -")
                   escreval("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
                   para l de 1 ate maxdestino faca
                      para c de 1 ate 4 faca
                           escreval
                           escreva(rotulo_destino[c])
                           escreval(destinos[l,c])
                      fimpara
                      escreval()
                   fimpara
                   escreval("Pressione qualquer tecla para voltar ao menu")
                   leia(voltar)
                   limpatela

              caso 5
                   limpatela
                   escreval("                ******************    ")
                   escreval()
                   escreval("-              Buscar cliente por ID                   -")
                   escreval()
                   escreval("                ******************    ")
                   escreval()
                   escreva("ID do cliente: ")
                   leia(cliente_ID)
                   limpatela
                   para i de cliente_ID ate cliente_ID faca
                        para j de 1 ate 4 faca
                             escreva(rotulo_Cliente[j])
                             escreval(clientes[cliente_ID,j])
                        fimpara
                   fimpara
                   escreval()
                   escreval("Pressione qualquer tecla para voltar ao menu")
                   leia(voltar)

              caso 6
                   limpatela
                   escreval("                ******************    ")
                   escreval()
                   escreval("-              Buscar destino por ID                   -")
                   escreval()
                   escreval("                ******************    ")
                   escreval()
                   escreva("ID do destino: ")
                   leia(destino_ID)
                   limpatela
                   para l de destino_ID ate destino_ID faca
                        para c de 1 ate 4 faca
                             escreva(rotulo_destino[c])
                             escreval(destinos[destino_ID,c])
                        fimpara
                   fimpara
                   escreval()
                   escreval("Pressione qualquer tecla para voltar ao menu")
                   leia(voltar)
      fimescolha
   fimenquanto
Fimalgoritmo