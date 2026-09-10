Checklist

Passo a passo para configurar e rodar o projeto localmente.

1. Pré-requisitos

Tenha instalado:

Git

Java 21

Maven

Valide:

git --version
java -version
mvn -version

O Maven deve estar utilizando Java 21.

2. Clonar os projetos

Os módulos são projetos separados e possuem seus próprios pom.xml.

Clone o projeto de entidades:

git clone <URL_DO_REPOSITORIO_ENTITY>

Clone o projeto principal:

git clone <URL_DO_REPOSITORIO_CORE>

A estrutura local pode ficar, por exemplo:

Checklist/
├── entity/
└── core/

3. Instalar o projeto entity

Entre no projeto:

cd entity

Compile e instale o artefato no repositório Maven local:

mvn clean install

Isso disponibiliza o módulo entity para os outros projetos que possuem dependência dele.

4. Rodar o projeto core

Entre no projeto principal:

cd ../core

Na primeira execução, baixe as dependências e compile:

mvn clean install

Depois inicie o Quarkus:

mvn quarkus:dev

5. Acessar a aplicação

Por padrão, a aplicação estará disponível em:

http://localhost:8080
