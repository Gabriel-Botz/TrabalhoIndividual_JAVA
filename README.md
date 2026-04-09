# 💳 Simulador de Caixa Eletrônico

## 📌 Descrição do Projeto
Este projeto consiste no desenvolvimento de um Simulador de Caixa Eletrônico em Java, com o objetivo de aplicar conceitos fundamentais de lógica de programação e Programação Orientada a Objetos (POO).

O sistema permite que um usuário acesse sua conta bancária e realize operações básicas como consulta de saldo, depósito e saque, respeitando regras de negócio definidas.

---

## 🚀 Funcionalidades
- 🔐 Login com nome e número da conta
- 💰 Consulta de saldo
- ➕ Depósito de valores
- ➖ Saque de valores
- 🔁 Menu interativo com do-while e switch

---

## 📋 Regras de Negócio
- 💸 Cada conta possui um saldo inicial de R$ 50,00 (bônus de boas-vindas)
- 🔒 Máximo de 3 saques por execução

### ⚠️ Ao tentar um 4º saque
> Saques diários permitidos: 3. Limite atingido!

- 💵 Valor máximo por saque: R$ 1.000,00

### ❌ Não é permitido
- Sacar valores maiores que o saldo
- Sacar ou depositar valores menores ou iguais a zero

---

## 🧠 Conceitos Aplicados

### 🔹 Lógica de Programação
- Estrutura de repetição: do-while
- Estrutura de decisão: switch-case
- Controle de fluxo e validações

### 🔹 Programação Orientada a Objetos (POO)
- Criação de classes e objetos
- Encapsulamento de dados
- Métodos com regras de negócio
- Uso de construtor

---

## 🏗️ Estrutura do Projeto

### Classe Sist_CaixaElet
Responsável por:
- Gerenciar o fluxo do sistema
- Realizar login do usuário
- Exibir o menu e capturar opções

### Classe ContaBancaria
Responsável por:
- Armazenar dados da conta (numero, titular, saldo)
- Implementar regras de negócio

#### Métodos
- sacar(double valor)
- depositar(double valor)
- verSaldo()

---

## ▶️ Como Executar

### Compilar
``bash
javac Sist_CaixaElet.java ContaBancaria.java
java Sist_CaixaElet ``

## Dados de exemplo
- Nome: Gabriel Botelho
- Conta: 1200

## 📊 Exemplo de Uso

1 - Ver saldo
2 - Depositar
3 - Sacar
4 - Sair

## 🎯 Objetivo Acadêmico

Este projeto foi desenvolvido como atividade prática para consolidar conhecimentos em:

- Estruturas de controle
- Manipulação de dados
- Modelagem orientada a objetos

---

## 👨‍💻 Autor

Gabriel Carneiro Botelho  
Estudante de Análise e Desenvolvimento de Sistemas
