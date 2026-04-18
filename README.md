# 🏦 Simulador de Caixa Eletrônico em Java

## 📌 Descrição

Este projeto consiste no desenvolvimento de um **simulador de caixa eletrônico** em Java, dividido em duas etapas principais:

1. Implementação utilizando **lógica procedural** (estrutura de controle no `main`)
2. Refatoração para **Programação Orientada a Objetos (POO)**

O sistema permite operações básicas como:
- Consulta de saldo
- Depósito
- Saque

---

## 🧠 Conceitos Aplicados

### 🔹 Parte 1 - Lógica e Estruturas de Controle
- `do-while`
- `switch-case`
- Controle de fluxo
- Validação de regras de negócio

### 🔹 Parte 2 - Programação Orientada a Objetos
- Classes e objetos
- Encapsulamento
- Métodos
- Organização de código

---

## ⚙️ Funcionalidades

✔️ Ver saldo  
✔️ Realizar depósito  
✔️ Realizar saque  
✔️ Menu interativo no terminal  

---

## 🚨 Regras de Negócio

- O usuário pode realizar no máximo **3 saques por dia**
- Caso tente um 4º saque:

```txt
Limite de saques diários atingido
```

- O valor máximo por saque é de:

```txt
R$ 1.000,00
```

---

## 🏗️ Estrutura do Projeto

### 📁 Parte 1 - Lógica no `main`

Toda a lógica do sistema é implementada diretamente na classe principal utilizando estruturas de controle.

---

### 📁 Parte 2 - Orientação a Objetos

#### 🔹 Classe `ContaBancaria`

**Atributos:**
- `numero`
- `titular`
- `saldo`

**Métodos:**

```java
void depositar(double valor)
```

```java
boolean sacar(double valor)
```

---

## 💻 Exemplo de Uso

```java
ContaBancaria conta = new ContaBancaria(123, "Gabriel", 1000.0);

conta.depositar(500);
conta.sacar(200);

System.out.println("Saldo atual: " + conta.getSaldo());
```

---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto em uma IDE:
- IntelliJ
- Eclipse
- VS Code

3. Execute a classe `Main`

---

## 🎯 Objetivo Acadêmico

Este exercício tem como objetivo reforçar:

- Lógica de programação  
- Estruturas de controle  
- Transição de código procedural para orientação a objetos  
- Boas práticas de organização de código  

---

## 📚 Tecnologias Utilizadas

- Java  

---

## 👨‍💻 Autor

**Gabriel Carneiro Botelho**  
Estudante de Análise e Desenvolvimento de Sistemas  
