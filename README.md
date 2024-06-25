# Desafio-de-projeto-APIrestful
Este projeto foi desenvolvido para o bootcamp 2024 de java backend ministrado pela Dio com o apoio do Santader,
e tem como objetivo a entrega do desafio de projeto de API REST.

##Diagrama de Classes##

```mermaid
classDiagram
    class CloudType {
        -String type
        -String acronym
        -Altitude altitude
        -String formation
        -String associatedClimate
        -String appearance
    }

    class Altitude {
        -int maximum
        -int minimum
    }

    CloudType *-- Altitude
```
