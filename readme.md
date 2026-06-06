# Sistema de Clínica Médica

## Descrição

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO), com o objetivo de simular o gerenciamento básico de uma clínica médica utilizando Java, Swing, JDBC e MySQL.

O sistema permite o cadastro e gerenciamento de médicos, pacientes e consultas por meio de uma interface gráfica desenvolvida com Java Swing e integração com banco de dados MySQL.

---

## Funcionalidades

### Médicos

* Cadastro de médicos
* Registro de CRM
* Especialidade médica
* Telefone para contato

### Pacientes

* Cadastro de pacientes
* Registro de CPF
* Idade
* Telefone para contato

### Consultas

* Cadastro de consultas
* Data da consulta
* Horário da consulta
* Médico responsável
* Paciente atendido

### Interface

* Tela inicial para navegação
* Acesso às telas de Médicos, Pacientes e Consultas
* Botão de retorno para a tela principal

---

## Tecnologias Utilizadas

* Java
* Java Swing
* JDBC
* MySQL
* VS Code

---

## Banco de Dados

O sistema utiliza o banco de dados MySQL chamado:

```sql
clinica
```

As tabelas utilizadas são:

* medico
* paciente
* consulta

O script de criação encontra-se no arquivo:

```text
clinica.sql
```

---

## Como Executar

1. Instalar o MySQL.
2. Executar o script `clinica.sql`.
3. Configurar usuário e senha do banco na classe `Conexao.java`.
4. Adicionar o MySQL Connector/J ao projeto.
5. Executar a classe `Main.java`.

---

## Autor

Renan Volpato

Projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos.
