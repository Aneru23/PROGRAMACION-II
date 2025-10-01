package uno;

class EmpleadoTiempoHorario extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double CalcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + 
               " | Tipo: Tiempo Horario" +
               " | Horas Trabajadas: " + horasTrabajadas +
               " | Tarifa por Hora: " + tarifaPorHora +
               " | Salario Mensual: " + CalcularSalarioMensual();
    }
}
