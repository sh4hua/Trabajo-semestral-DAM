#!/usr/bin/env kotlin

enum class EstadoDron (val texto: String){
    EN_VUELO("En vuelo"),
    CARGANDO("Cargando")
}

data class Dron(
    val id: Int,
    val nombre: String,
    val latitud: Double,
    val longitud: Double,
    val bateria: Int,
    val estado: EstadoDron
)