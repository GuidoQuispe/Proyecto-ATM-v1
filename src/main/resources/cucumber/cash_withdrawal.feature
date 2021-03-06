# language: es
Característica: Retirar efectivo de un ATM

Escenario: Retiro exitoso de una cuenta de credito
    Dado que mi cuenta ha sido acreditada con Bs2300.55
    Cuando retiro Bs600
    Entonces Bs600 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs1700.55


Escenario: Retiro exitoso de una cuenta de credito (2)
    Dado que mi cuenta ha sido acreditada con Bs2000
    Cuando retiro Bs600
    Entonces Bs600 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs1000