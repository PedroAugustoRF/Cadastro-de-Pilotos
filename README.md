# 🏎️ Cadastro de Pilotos (Java)

Aplicação de **linha de comando** desenvolvida em Java para realizar o cadastro e gerenciamento básico de pilotos, contratos e patrocínios, simulando um pequeno sistema administrativo inspirado no mundo do automobilismo.

O projeto foi construído com foco em **Programação Orientada a Objetos (POO)**, uso de **Enums**, organização em camadas e manipulação de coleções em Java.

---

## 📌 Objetivo

Este software foi desenvolvido com fins acadêmicos e de prática, visando exercitar conceitos importantes de Java, como:

* Encapsulamento
* Composição de objetos
* Listas (`ArrayList`)
* Enumeradores (`enum`)
* Entrada de dados com `Scanner`
* Organização de pacotes
* Separação de responsabilidades entre classes

---

## ⚙️ Funcionalidades

O sistema permite:

* Cadastrar pilotos
* Associar piloto a uma equipe
* Definir pistas disponíveis através de enum
* Registrar contratos
* Registrar patrocínios
* Listar informações cadastradas
* Simular um pequeno gerenciamento administrativo de equipe de corrida

---

## 🧱 Estrutura do Projeto

```
.
├── application
│   └── AppCadastroPiloto.java
│
├── entities
│   ├── Piloto.java
│   ├── Contrato.java
│   ├── Patrocinio.java
│   │
│   └── enums
│       ├── Equipes.java
│       └── Pistas.java
```

### 📂 application

Contém a classe principal responsável pela execução do programa e interação com o usuário via terminal.

### 📂 entities

Contém as classes de domínio do sistema (os objetos do mundo real representados em código):

* **Piloto** → informações do piloto
* **Contrato** → dados contratuais do piloto com a equipe
* **Patrocinio** → patrocinadores associados

### 📂 enums

Define valores fixos do sistema:

* **Equipes** → equipes disponíveis
* **Pistas** → circuitos disponíveis

---

## 🧠 Conceitos de POO aplicados

O projeto aplica diversos conceitos importantes:

| Conceito               | Onde é aplicado                                        |
| ---------------------- | ------------------------------------------------------ |
| Encapsulamento         | Atributos privados com getters e setters               |
| Composição             | Piloto possui contrato e patrocínio                    |
| Enumeração             | Equipes e pistas fixas do sistema                      |
| Organização em pacotes | Separação entre `application` e `entities`             |
| Abstração              | Representação de elementos do automobilismo em classes |

---

## 💻 Tecnologias Utilizadas

* Java (JDK 8 ou superior)
* Terminal / Console
* Programação Orientada a Objetos

---

## ▶️ Como Executar

### 1️⃣ Pré‑requisitos

Você precisa ter instalado:

* Java JDK 8 ou superior
* Variável de ambiente `JAVA_HOME` configurada (recomendado)

Verifique com:

```bash
java -version
javac -version
```

---

### 2️⃣ Compilar o Projeto

No diretório raiz do projeto execute:

```bash
javac application/AppCadastroPiloto.java entities/*.java entities/enums/*.java
```

---

### 3️⃣ Rodar o Programa

```bash
java application.AppCadastroPiloto
```

O sistema iniciará no terminal e passará a solicitar as informações para cadastro.

---

## 🖥️ Exemplo de Uso

```
Digite o nome do piloto:
> Ayrton Senna

Escolha a equipe:
1 - Ferrari
2 - Mercedes
3 - Red Bull

Digite o número correspondente:
> 3

Cadastro realizado com sucesso!
```

---

## 🔮 Possíveis Melhorias Futuras

Algumas evoluções que podem ser implementadas:

* Persistência em arquivo (CSV ou JSON)
* Interface gráfica (JavaFX ou Swing)
* Banco de dados (MySQL ou PostgreSQL)
* Sistema de exclusão e edição de pilotos
* Menu interativo completo
* Validações mais robustas

---

## 👨‍💻 Autor

**Pedro Augusto Ribeiro Ferreira**

Projeto desenvolvido para fins educacionais e prática de Java.

---

## 📄 Licença

Este projeto é livre para estudo e modificação para fins acadêmicos.

Sinta‑se à vontade para fazer um fork e melhorar a aplicação 🚀
