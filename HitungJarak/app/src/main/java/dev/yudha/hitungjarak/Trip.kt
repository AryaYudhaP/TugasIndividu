package dev.yudha.hitungjarak

data class Trip(
    val distance: Double, // Jarak perjalanan dalam km
    val fuelConsumption: Double, // Konsumsi bahan bakar (km/l)
    val fuelPrice: Double, // Harga bahan bakar per liter
    val cost: Double // Total biaya perjalanan (dihitung)
) {
    fun calculateCost(): Double {
        return (distance / fuelConsumption) * fuelPrice
    }
}
