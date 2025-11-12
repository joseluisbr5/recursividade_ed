# 🌳 Trabalho Prático – Árvores Binárias e Recursividade  
**Disciplina:** Estrutura de Dados  
**Professor:** Prof. Anderson Soares  
**Aluno:** José Luis Meneses da Silva

---

## 🎯 Objetivo  
Compreender o conceito de **recursividade** e aplicá-lo na implementação de uma **árvore binária de busca (BST)**, realizando as operações de **inserção, busca e percursos (pré, em e pós-ordem)**.

---

## 🧩 Parte 1 – Conceito e Explicação  

### 1️⃣ O que é recursividade?  
Recursividade é uma técnica em que uma função **chama a si mesma** para resolver um problema menor do mesmo tipo.  
Por exemplo: para calcular o fatorial de um número `n`, a função pode chamar `fatorial(n - 1)` até chegar ao caso base `n == 1`.  
Ela é muito útil para estruturas hierárquicas, como árvores.

---

### 2️⃣ Como a recursividade é usada na percorrência de uma árvore binária?  
Em uma árvore binária, cada nó pode ter um filho à esquerda e outro à direita.  
A recursividade facilita a travessia porque permite **visitar cada nó** naturalmente:  
- primeiro processa-se o nó atual,  
- depois visita-se a subárvore da esquerda,  
- e por fim a subárvore da direita.  

Assim, evitamos o uso de laços `for` ou `while`.

---

### 3️⃣ Qual a diferença entre recursão e laço (for/while)?  
- **Laços** repetem instruções de forma **iterativa**, controladas por um contador.  
- **Recursão** resolve o problema **dividindo-o em subproblemas menores**, com chamadas sucessivas da própria função até o **caso base**.  
