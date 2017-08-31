# language: es
Característica: Retirar efectivo de un ATM

Escenario: Retiro exitoso de una cuenta de credito (1)
        Este escenario tiene como finalidad probar si el sistema
        acepta los numeros decimales en su integridad.
    Dado que mi cuenta ha sido acreditada con Bs2300.55
    Cuando retiro Bs600
    Entonces Bs600 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs1700.55

Escenario: Retiro exitoso de una cuenta de credito (2)
        Este escenario tiene como finalidad probar si el sistema
        acepta los numeros decimales en su integridad, con la condicion 
        de que este termine en cero.
    Dado que mi cuenta ha sido acreditada con Bs0
    Cuando retiro Bs20
    Entonces Bs0 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs0
