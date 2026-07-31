# ProjetoCampeonato 🎣🏆

Aplicação web desenvolvida em Java com páginas em ASP (Active Server Pages), criada para gerenciar e automatizar a apuração de resultados de campeonatos de pesca. O sistema controla o cadastro de equipes, registra o peso dos peixes capturados, calcula automaticamente a pontuação por etapa e gera o ranking final da competição.

<br>
<br>

## 🚀 Funcionalidades
Cadastro de Equipes: Registro dos participantes e equipes inscritas no campeonato.

Controle por Etapas: Organização da competição dividida em múltiplas etapas ou dias de pesca.

Registro de Capturas: Lançamento dos pesos dos peixes pescados por cada equipe em cada etapa.

Cálculo Automático de Pontuação: Processamento dinâmico das pontuações com base nos pesos registrados.

Resultados Finais: Geração e exibição do ranking geral e do vencedor do campeonato de forma automatizada.

## 🛠️ Tecnologias Utilizadas
Linguagem Principal: Java (Regras de negócio, lógica da aplicação e conexão com banco de dados).

Interface Web (Frontend): ASP (Active Server Pages) para a renderização das páginas e interação com o usuário.

Servidor de Aplicação: Compatível com servidores que suportem Java e integração ASP (ex: IIS com pontes/configurações adequadas ou servidores Tomcat configurados).

Banco de Dados: (Insira aqui o banco de dados utilizado, ex: MySQL, PostgreSQL, SQL Server).

<br>
<br>

## ⚙️ Como Executar o Projeto
Siga os passos abaixo para configurar e rodar a aplicação em sua máquina local:

<br>
Clone o repositório:

<br>
Bash
git clone https://github.com/maiconpdl/ProjetoCampeonato.git

<br>
Configure o Banco de Dados:


Atualize as credenciais de acesso ao banco (URL, usuário e senha) nos arquivos de configuração do projeto Java.

Compile e Importe no Servidor:

Abra o projeto em sua IDE Java de preferência (Eclipse, IntelliJ, NetBeans).

Configure o servidor de aplicação (como Apache Tomcat ou IIS, dependendo da sua arquitetura de integração Java + ASP).

Faça o build do projeto e publique-o no diretório raiz do seu servidor web.

Acesse a Aplicação:

Abra o seu navegador e acesse: http://localhost:8080/ProjetoCampeonato (ou a porta configurada no seu ambiente).



## 🤝 Como Contribuir
Contribuições são sempre bem-vindas! Se você quiser melhorar o projeto:

Faça um Fork do projeto.

Crie uma nova Branch para sua funcionalidade (git checkout -b feature/MinhaNovaFuncionalidade).

Faça o Commit das suas alterações (git commit -m 'Adicionando nova funcionalidade X').

Faça o Push para a Branch (git push origin feature/MinhaNovaFuncionalidade).

Abra um Pull Request.

📄 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo, modificá-lo e melhorá-lo.
