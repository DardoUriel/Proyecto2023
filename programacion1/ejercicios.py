'''
Solicitar números al usuario hasta que ingrese el cero. Por cada uno, mostrar la suma de sus dígitos.
Al finalizar mostrar la sumatoria de todos los números ingresados y la suma de sus dígitos.

'''
import funciones 
number = 0
while True:
    number =int(input("numero :"))
    if number == 0:
        break
    else:    
        print(funciones.sum_digits(number))