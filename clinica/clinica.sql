CREATE DATABASE clinica;

USE clinica;

CREATE TABLE medico (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    crm VARCHAR(30),
    especialidade VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE paciente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(20),
    telefone VARCHAR(20),
    idade INT
);

CREATE TABLE consulta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    data_consulta VARCHAR(30),
    horario VARCHAR(20),
    medico VARCHAR(100),
    paciente VARCHAR(100)
);