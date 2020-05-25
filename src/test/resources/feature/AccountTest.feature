# language: pt
Funcionalidade: Busca da conta por usuario

  Cenario: Contas normais e aplicação de juros (10 reais).

    Dados as contas iniciais:
      | type   | owner | amount      |
      | CREDIT | edwin | 77777999.40 |
      | DEBIT  | mary  | 99999999.49 |
      | DEBIT  | celi  | 100.50      |

    Quando a conta vira um mes

    Entao as contas resultantes sao:
      | type   | owner | amount      |
      | CREDIT | edwin | 77777989.40 |
      | DEBIT  | mary  | 99999989.49 |
      | DEBIT  | celi  | 90.50       |

  Cenario: Contas normais com aplicação de juros e contas universitárias sem aplicação de juros.

    Dados as contas iniciais:
      | type   | owner | amount |
      | FREE   | edwin | 300.00 |
      | FREE   | mary  | 100.55 |
      | CREDIT | celi  | 290.00 |

    Quando a conta vira um mes

    Entao as contas resultantes sao:
      | type   | owner | amount |
      | FREE   | edwin | 300.00 |
      | FREE   | mary  | 100.55 |
      | CREDIT | celi  | 280.00 |
