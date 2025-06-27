Trabalho Prático: Refatoração e Padrões GRASP em Java

Este projeto demonstra técnicas avançadas de refatoração e princípios de design orientado a objetos em Java. Apresentamos os 7 principais problemas de design (bad smells) e os 9 padrões GRASP fundamentais para criar sistemas robustos e mantíveis.

Bad Smells e Soluções
1. Duplicated Code (Código Duplicado)
Problema: Trechos de código idênticos ou muito similares aparecem em múltiplos lugares.
Solução:

Extrair para métodos privados

Criar classes utilitárias

Aplicar o padrão Template Method para variações similares

2. Large Class/God Class (Classe Grande)
Problema: Classe que acumula muitas responsabilidades.
Solução:

Identificar coesões lógicas

Extrair responsabilidades para novas classes

Aplicar princípio da responsabilidade única

3. Long Method/God Method (Método Longo)
Problema: Métodos extensos que realizam múltiplas operações.
Solução:

Dividir em métodos menores

Extrair blocos lógicos para métodos auxiliares

Usar objetos de comando para operações complexas

4. Feature Envy (Inveja de Funcionalidade)
Problema: Método que acessa mais dados de outra classe do que da própria.
Solução:

Mover o método para a classe cujos dados ele mais usa

Se não for possível mover, considerar extrair para novo objeto

5. Divergent Change (Mudança Divergente)
Problema: Classe que muda por diferentes razões.
Solução:

Separar as responsabilidades que mudam por razões diferentes

Criar classes especializadas para cada eixo de mudança

6. Shotgun Surgery (Cirurgia de Espingarda)
Problema: Mudança simples requer modificações em muitas classes.
Solução:

Consolidar o comportamento relacionado

Criar classes intermediárias ou usar padrão Facade

7. Refused Bequest (Herança Recusada)
Problema: Subclasse não usa ou rejeita funcionalidades da superclasse.
Solução:

Substituir herança por composição

Extrair interface comum

Usar delegação em vez de herança

Padrões GRASP
1. Information Expert
Atribuir responsabilidades à classe que possui as informações necessárias para cumpri-las.

2. Controller
Usar classe intermediária para lidar com eventos do sistema.

3. Creator
Designar responsabilidade de criação à classe que possui os dados necessários.

4. Low Coupling
Minimizar dependências entre classes.

5. High Cohesion
Manter classes focadas em responsabilidades relacionadas.

6. Polymorphism
Usar polimorfismo para variar comportamentos.

7. Pure Fabrication
Criar classes artificiais para manter alta coesão.

8. Indirection
Introduzir mediadores para reduzir acoplamento direto.

9. Protected Variations
Proteger pontos de variação com interfaces estáveis.
