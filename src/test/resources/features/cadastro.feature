# language: pt

  Funcionalidade: Cadastro de usuário
    Eu usuário da web
    Quero me cadastrar no site da qazando
    Para acessar o site quando necessário

   Contexto: Acessar o site
     Dado que eu estou no site da qazando
     E acesso a área de cadastro


   @Cadastro_invalidos
   Esquema do Cenário: Validar cadastro: "<name>"
     Quando preencho meu nome "<nome>", email "<email>" e senha "<senha>"
     E clico em registrar
     Então vejo a mensagem "<mensagem>" de dados inválidos

   Exemplos:
     |nome   |  email          |senha       | mensagem       | name             |

