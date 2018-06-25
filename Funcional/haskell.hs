{-Programa que dado dos numeros enteros x y determina si x es divisible a y-}

esDivisible x y = if (x `mod` y)==0
					  then "son divisibles"
					  else "no son divisibles"
{-Programa que dado dos numeros enteros x y determina si x es mayor a y-}
esMayor x y = if x>y
			 then "es Mayor"
			 else "no es Mayor"

{-Programa que dado dos numeros enteros x y determina si x es menor a y-}

esMenor x y = if x<y
			 then "es Menos"
			 else "no es Menor"


{- Programa que dados dos números enteros a y b 
ordena de menor a mayor a través de la distinción de casos.-}

ordenar a b |a < b =show(a)++" "++show(b) 
     |otherwise=show(b)++" "++show(a)

{-Programa que cuenta los dígitos de un número entero-}
contadorDeDigitos::Int->Int 
contadorDeDigitos 0=0 
contadorDeDigitos n= 1+ contadorDeDigitos (div n 10)

{-Producto de los dígitos de un número entero. Recibe un número entero, 
con la función (mod n 10) separa el primer dígito para luego multiplicarlo con el siguiente.-}
prod::Int->Int 
prod 0=1 
prod n=(mod n 10)*prod(div n 10)


{-Programa que recibe un número entero y devuelve la factorial del mismo.-}

fact::Int->Int 
fact 0=1 
fact n=n*fact(n-1)



inv::Integer->Integer->Integer 
inv n a |n<10=n 
     |otherwise=(mod n 10)*(10^(a+1))+ inv (div n 10) (a+1) 
may::Integer->Integer 
may n |n<10=n 
     | (mod n 10)<=(mod (div n 10) 10)=may (((div n 100)*10)+(mod n 10)) 
     |otherwise=(may (div n 10)) 
ordenarNumeros::Integer->String 
ordenarNumeros 0="" 
ordenarNumeros n |mod n 10==may n=show(mod n 10)++ordenarNumeros (div n 10) 
     |otherwise=ordenarNumeros (inv n 0)