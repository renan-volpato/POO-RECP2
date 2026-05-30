package model;

public class Consulta {

    private int id;
    private String dataConsulta;
    private String horario;
    private String medico;
    private String paciente;

    public Consulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(
            String dataConsulta
    ) {
        this.dataConsulta =
                dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(
            String horario
    ) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(
            String medico
    ) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(
            String paciente
    ) {
        this.paciente = paciente;
    }
}