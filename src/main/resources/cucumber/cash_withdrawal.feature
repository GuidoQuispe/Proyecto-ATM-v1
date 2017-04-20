# language: es
Característica: Retirar efectivo de un ATM

Escenario: Retiro exitoso de una cuenta de credito (1)
        Este escenario tiene como finalidad probar si el sistema
        acepta los numeros decimales en su integridad.
    Dado que mi cuenta ha sido acreditada con Bs2000.55
    Cuando retiro Bs300
    Entonces Bs300 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs1700.55

Escenario: Retiro exitoso de una cuenta de credito (2)
        Este escenario tiene como finalidad probar si el sistema
        acepta los numeros decimales en su integridad, con la condicion 
        de que este termine en cero.
    Dado que mi cuenta ha sido acreditada con Bs100.50
    Cuando retiro Bs20
    Entonces Bs20 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs80.50

Escenario: Retiro exitoso de una cuenta de credito (3)
        Este escenario tiene como finalidad probar si el sistema
        acepta los numeros decimales en su integridad, con la condicion 
        de que este comience en cero.
    Dado que mi cuenta ha sido acreditada con Bs1500.01
    Cuando retiro Bs300
    Entonces Bs300 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs1200.01

Escenario: Retiro exitoso de una cuenta de credito (4)
        Este escenario tiene como finalidad probar si el sistema
        acepta el monto de dinero expresado sin centavos.
    Dado que mi cuenta ha sido acreditada con Bs1500.00
    Cuando retiro Bs300.00
    Entonces Bs300 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs1200

Escenario: Retiro exitoso de una cuenta de credito (5)
        Este escenario tiene como finalidad probar que el sistema
        solamente es modificado el saldo cuando se ingresan 
        valores positivos.
    Dado que mi cuenta ha sido acreditada con Bs0.55
    Cuando retiro Bs0
    Entonces Bs0 deben ser dispensados
    Y que mi cuenta ha sido acreditada con Bs0.45
    Entonces el saldo de mi cuenta debe ser de Bs1
    Y que mi cuenta ha sido acreditada con Bs0
    Entonces el saldo de mi cuenta debe ser de Bs1

Escenario: Retiro exitoso de una cuenta de credito (6)
        Este escenario tiene como finalidad probar si el sistema
        realiza operaciones aritmeticas correctamente.
    Dado que mi cuenta ha sido acreditada con Bs500.99
    Entonces el saldo de mi cuenta debe ser de Bs500.99
    Y que mi cuenta ha sido acreditada con Bs400.99
    Entonces el saldo de mi cuenta debe ser de Bs901.98
    Cuando retiro Bs497
    Entonces Bs497 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs404.98
    Y que mi cuenta ha sido acreditada con Bs5350.02
    Entonces el saldo de mi cuenta debe ser de Bs5755
    Cuando retiro Bs555.95
    Entonces Bs555.95 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs5199.05
    
Escenario: Retiro exitoso de una cuenta de credito (7)
        Este escenario tiene como finalidad probar si el sistema
        realiza operaciones aritmeticas correctamente.
    Dado que mi cuenta ha sido acreditada con Bs20500.85
    Cuando retiro Bs4970
    Entonces Bs4970 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs15530.85
    Cuando retiro Bs15000
    Entonces Bs15000 deben ser dispensados
    Y el saldo de mi cuenta debe ser de Bs530.85
