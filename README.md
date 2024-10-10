# Challenge Conversor De Monedas

Aplicación para convertir monedas. 

## Preview

![conversionMoneda](https://github.com/user-attachments/assets/8ac15c51-ee6a-4a1f-8cfb-a1a714e55caa)

## Funcionalidad del proyecto

El objetivo de esta aplicación es tomar el input del usuario sobre el tipo de cambio que quiere realizar y después tomar como input la cantidad a convertir. 
- Si el input inicial no está dentro del rango 1 - 7 devuelve nuevamente el menú, lo hace hasta tener un input correcto
- Si el valor ingresado tiene multiples comas o multiples puntos, el usuario obtiene un mensaje de error sobre el formato de la cantidad y vuelve al inicio

## Tecnología usada

Java, la API [exchange rate](https://www.exchangerate-api.com/docs/overview) y la librería [Gson](https://github.com/google/gson/blob/main/UserGuide.md#overview)
