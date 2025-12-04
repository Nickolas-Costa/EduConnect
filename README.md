📚 EduConnect – Sistema Acadêmico (Fases 7 e 8)

Sistema acadêmico desenvolvido em Java aplicando Arquitetura em Camadas, boas práticas de projeto e menus interativos em console.
Este repositório corresponde às entregas da Fase 7 (Arquitetura em Camadas) e da Fase Final (Sistema Consolidado).

🏗️ Fase 7 – Arquitetura em Camadas

Nesta fase, o sistema foi totalmente reorganizado para seguir uma estrutura profissional.
Os pacotes foram separados conforme responsabilidade:

src/
 ├─ model/        → Entidades (Aluno, Professor, Curso, Turma, Administrador…)
 ├─ service/      → Regras de negócio e validações
 ├─ repository/   → Armazenamento temporário em listas
 └─ ui/           → Interface textual (menus interativos)

✅ Objetivos cumpridos

Separação clara das responsabilidades (SRP – Single Responsibility Principle).

Implementação de classes de serviço para operações de negócio.

Repositórios centralizados para armazenamento em memória.

Interface de usuário organizada via console (Scanner).

Classe Main integrando todas as camadas.

🚀 Fase Final – Sistema Acadêmico Consolidado

Nesta fase, todas as funcionalidades foram unificadas em um sistema completo para demonstração a investidores.

🧩 Funcionalidades Implementadas
👤 Gestão de Usuários

Cadastro de Alunos

Cadastro de Professores

Cadastro de Administradores

Listagem geral

🎓 Gestão de Cursos

Cadastro de cursos

Listagem detalhada

Relatórios de cursos

🏫 Gestão de Turmas

Criação de turmas vinculadas a cursos

Associação de alunos

Definição de professor da turma

Registro de avaliações

Resumo completo da turma

📊 Relatórios Gerais

Relatórios de usuários (alunos, professores e administradores)

Relatórios de cursos

Relatórios de turmas (incluindo avaliações)

📌 Fluxo Principal do Sistema

O usuário navega via menus no console (UI).

Cada operação chama métodos das camadas de serviço.

As entidades são armazenadas temporariamente pelos repositórios.

A classe Main (Fase8.java) controla a aplicação.

🧪 Testes de Cenários Implementados

Inclui casos de testes simples simulando:

Cadastro de aluno (sucesso e falha)

Adição de aluno à turma

Relatórios com e sem dados

🗂️ Como Executar

Clone o repositório:

git clone https://github.com/SEU-USUARIO/educonnect.git


Abra o projeto no IntelliJ IDEA

Execute a classe:

src/Fase8.java


Navegue pelos menus interativos.

🔗 Códigos e Estrutura Completa

Todos os códigos das Fases 7 e 8 — entidades, serviços, repositórios e UI — estão neste repositório para conferência e revisão.


🧑‍💻 Tecnologias Utilizadas

Java 17

IntelliJ IDEA

Padrões de arquitetura em camadas

Programação orientada a objetos (POO)

Console UI (Scanner)


📄 Licença

Projeto acadêmico, livre para estudo e evolução.
